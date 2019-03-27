// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CancellationReason => ScalaCancellationReason, _ }
import com.amazonaws.services.dynamodbv2.model.{ CancellationReason => JavaCancellationReason }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CancellationReasonOps {

  implicit class ScalaCancellationReasonOps(val self: ScalaCancellationReason) extends AnyVal {

    def toJava: JavaCancellationReason = {
      val result = new JavaCancellationReason()
      self.item.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withItem(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.code.filter(_.nonEmpty).foreach(v => result.withCode(v))       // String
      self.message.filter(_.nonEmpty).foreach(v => result.withMessage(v)) // String

      result
    }

  }

  implicit class JavaCancellationReasonOps(val self: JavaCancellationReason) extends AnyVal {

    def toScala: ScalaCancellationReason = {
      ScalaCancellationReason()
        .withItem(Option(self.getItem).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withCode(Option(self.getCode)) // String
        .withMessage(Option(self.getMessage)) // String
    }

  }

}
