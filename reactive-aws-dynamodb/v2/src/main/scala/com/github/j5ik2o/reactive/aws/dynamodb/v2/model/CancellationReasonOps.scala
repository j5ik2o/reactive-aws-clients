// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CancellationReason => ScalaCancellationReason, _ }
import software.amazon.awssdk.services.dynamodb.model.{ CancellationReason => JavaCancellationReason }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CancellationReasonOps {

  implicit class ScalaCancellationReasonOps(val self: ScalaCancellationReason) extends AnyVal {

    def toJava: JavaCancellationReason = {
      val result = JavaCancellationReason.builder()
      self.item.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.item(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.code.filter(_.nonEmpty).foreach(v => result.code(v))       // String
      self.message.filter(_.nonEmpty).foreach(v => result.message(v)) // String

      result.build()
    }

  }

  implicit class JavaCancellationReasonOps(val self: JavaCancellationReason) extends AnyVal {

    def toScala: ScalaCancellationReason = {
      ScalaCancellationReason()
        .withItem(Option(self.item).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withCode(Option(self.code)) // String
        .withMessage(Option(self.message)) // String
    }

  }

}
