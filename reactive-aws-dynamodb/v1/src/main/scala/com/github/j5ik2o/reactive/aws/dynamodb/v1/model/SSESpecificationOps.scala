// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSESpecification => ScalaSSESpecification, _ }
import com.amazonaws.services.dynamodbv2.model.{ SSESpecification => JavaSSESpecification }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SSESpecificationOps {

  implicit class ScalaSSESpecificationOps(val self: ScalaSSESpecification) extends AnyVal {

    def toJava: JavaSSESpecification = {
      val result = new JavaSSESpecification()
      self.enabled.map(_.booleanValue).foreach(v => result.withEnabled(v)) // Boolean
      self.sseType.foreach { v =>
        import SSETypeOps._; result.withSSEType(v.toJava)
      } // String
      self.kmsMasterKeyId.filter(_.nonEmpty).foreach(v => result.withKMSMasterKeyId(v)) // String

      result
    }

  }

  implicit class JavaSSESpecificationOps(val self: JavaSSESpecification) extends AnyVal {

    def toScala: ScalaSSESpecification = {
      ScalaSSESpecification()
        .withEnabled(Option(self.getEnabled).map(_.booleanValue)) // Boolean
        .withSseType(Option(self.getSSEType).map { v =>
          import SSETypeOps._; v.toScala
        }) // String
        .withKmsMasterKeyId(Option(self.getKMSMasterKeyId)) // String
    }

  }

}
