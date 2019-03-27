// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEDescription => ScalaSSEDescription, _ }
import com.amazonaws.services.dynamodbv2.model.{ SSEDescription => JavaSSEDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SSEDescriptionOps {

  implicit class ScalaSSEDescriptionOps(val self: ScalaSSEDescription) extends AnyVal {

    def toJava: JavaSSEDescription = {
      val result = new JavaSSEDescription()
      self.status.foreach { v =>
        import SSEStatusOps._; result.withStatus(v.toJava)
      } // String
      self.sseType.foreach { v =>
        import SSETypeOps._; result.withSSEType(v.toJava)
      } // String
      self.kmsMasterKeyArn.filter(_.nonEmpty).foreach(v => result.withKMSMasterKeyArn(v)) // String

      result
    }

  }

  implicit class JavaSSEDescriptionOps(val self: JavaSSEDescription) extends AnyVal {

    def toScala: ScalaSSEDescription = {
      ScalaSSEDescription()
        .withStatus(Option(self.getStatus).map { v =>
          import SSEStatusOps._; v.toScala
        }) // String
        .withSseType(Option(self.getSSEType).map { v =>
          import SSETypeOps._; v.toScala
        }) // String
        .withKmsMasterKeyArn(Option(self.getKMSMasterKeyArn)) // String
    }

  }

}
