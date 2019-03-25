package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSESpecification => ScalaSSESpecification, _ }
import software.amazon.awssdk.services.dynamodb.model.{ SSESpecification => JavaSSESpecification }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SSESpecificationOps {

  implicit class ScalaSSESpecificationOps(val self: ScalaSSESpecification) extends AnyVal {

    def toJava: JavaSSESpecification = {
      val result = JavaSSESpecification.builder()
      self.enabled.map(_.booleanValue).foreach(v => result.enabled(v)) // Boolean
      self.sseType.foreach { v =>
        import SSETypeOps._; result.sseType(v.toJava)
      } // String
      self.kmsMasterKeyId.filter(_.nonEmpty).foreach(v => result.kmsMasterKeyId(v)) // String

      result.build()
    }

  }

  implicit class JavaSSESpecificationOps(val self: JavaSSESpecification) extends AnyVal {

    def toScala: ScalaSSESpecification = {
      ScalaSSESpecification()
        .withEnabled(Option(self.enabled).map(_.booleanValue)) // Boolean
        .withSseType(Option(self.sseType).map { v =>
          import SSETypeOps._; v.toScala
        }) // String
        .withKmsMasterKeyId(Option(self.kmsMasterKeyId)) // String
    }

  }

}
