package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEStatus, SSEType, SSEDescription => ScalaSSEDescription }
import software.amazon.awssdk.services.dynamodb.model.{ SSEDescription => JavaSSEDescription }

object SSEDescriptionOps {

  implicit class ScalaSSEDescriptionOps(val self: ScalaSSEDescription) extends AnyVal {

    def toJava: JavaSSEDescription = {
      val result = JavaSSEDescription.builder()
      self.status.map(_.entryName).foreach(result.status)
      self.sseType.map(_.entryName).foreach(result.sseType)
      self.kmsMasterKeyArn.foreach(result.kmsMasterKeyArn)
      result.build()
    }

  }

  implicit class JavaSSEDescriptionOps(val self: JavaSSEDescription) extends AnyVal {

    def toScala: ScalaSSEDescription = {
      ScalaSSEDescription()
        .withStatus(Option(self.status).map(_.toString).map(SSEStatus.withName))
        .withSSEType(Option(self.sseType).map(_.toString).map(SSEType.withName))
        .withKMSMasterKeyArn(Option(self.kmsMasterKeyArn))
    }

  }

}
