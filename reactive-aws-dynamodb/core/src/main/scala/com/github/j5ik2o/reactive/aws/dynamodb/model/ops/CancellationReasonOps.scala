// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CancellationReasonBuilderOps(val self: CancellationReason.Builder) extends AnyVal {

  final def withItemAsScala(value: Option[Map[String, AttributeValue]]): CancellationReason.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.item(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def withCodeAsScala(value: Option[String]): CancellationReason.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  } // String

  final def withMessageAsScala(value: Option[String]): CancellationReason.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

}

final class CancellationReasonOps(val self: CancellationReason) extends AnyVal {

  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def codeAsScala: Option[String] = Option(self.code) // String

  final def messageAsScala: Option[String] = Option(self.message) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancellationReasonOps {

  implicit def toCancellationReasonBuilderOps(v: CancellationReason.Builder): CancellationReasonBuilderOps =
    new CancellationReasonBuilderOps(v)

  implicit def toCancellationReasonOps(v: CancellationReason): CancellationReasonOps = new CancellationReasonOps(v)

}
