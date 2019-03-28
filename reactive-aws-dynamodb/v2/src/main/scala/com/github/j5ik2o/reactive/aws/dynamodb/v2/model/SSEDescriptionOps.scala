// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEDescription => ScalaSSEDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ SSEDescription => JavaSSEDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SSEDescriptionOps {

  implicit class ScalaSSEDescriptionOps(val self: ScalaSSEDescription) extends AnyVal {

    def toJava: JavaSSEDescription = {
      val result = JavaSSEDescription.builder()
      self.status.foreach { v =>
        import SSEStatusOps._; result.status(v.toJava)
      } // String
      self.sseType.foreach { v =>
        import SSETypeOps._; result.sseType(v.toJava)
      } // String
      self.kmsMasterKeyArn.filter(_.nonEmpty).foreach(v => result.kmsMasterKeyArn(v)) // String

      result.build()
    }

  }

  implicit class JavaSSEDescriptionOps(val self: JavaSSEDescription) extends AnyVal {

    def toScala: ScalaSSEDescription = {
      ScalaSSEDescription()
        .withStatus(Option(self.status).map { v =>
          import SSEStatusOps._; v.toScala
        }) // String
        .withSseType(Option(self.sseType).map { v =>
          import SSETypeOps._; v.toScala
        }) // String
        .withKmsMasterKeyArn(Option(self.kmsMasterKeyArn)) // String
    }

  }

}
