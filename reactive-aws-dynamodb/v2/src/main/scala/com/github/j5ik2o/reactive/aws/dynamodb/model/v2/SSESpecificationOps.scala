package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEType, SSESpecification => ScalaSSESpecification }
import software.amazon.awssdk.services.dynamodb.model.{ SSESpecification => JavaSSESpecification }

object SSESpecificationOps {

  implicit class ScalaSSESpecificationOps(val self: ScalaSSESpecification) extends AnyVal {

    def toJava: JavaSSESpecification = {
      val result = JavaSSESpecification.builder()
      self.enabled.foreach(v => result.enabled(v))
      self.sseType.map(_.entryName).foreach(result.sseType)
      self.kmsMasterKeyId.foreach(result.kmsMasterKeyId)
      result.build()
    }

  }

  implicit class JavaSSESpecificationOps(val self: JavaSSESpecification) extends AnyVal {

    def toScala: ScalaSSESpecification = {
      ScalaSSESpecification()
        .withEnabled(Option(self.enabled).map(_.booleanValue()))
        .withSSEType(
          Option(self.sseType)
            .map(_.toString)
            .map(SSEType.withName)
        ).withKMSMasterKeyId(
          Option(self.kmsMasterKeyId)
        )
    }

  }

}
