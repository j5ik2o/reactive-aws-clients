// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class MessageAttributeValueBuilderOps(val self: MessageAttributeValue.Builder) extends AnyVal {

  final def stringValueAsScala(value: Option[String]): MessageAttributeValue.Builder = {
    value.fold(self) { v =>
      self.stringValue(v)
    }
  }

  final def binaryValueAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): MessageAttributeValue.Builder = {
    value.fold(self) { v =>
      self.binaryValue(v)
    }
  }

  final def stringListValuesAsScala(value: Option[Seq[String]]): MessageAttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stringListValues(v.asJava)
    }
  }

  final def binaryListValuesAsScala(
      value: Option[Seq[software.amazon.awssdk.core.SdkBytes]]
  ): MessageAttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.binaryListValues(v.asJava)
    }
  }

  final def dataTypeAsScala(value: Option[String]): MessageAttributeValue.Builder = {
    value.fold(self) { v =>
      self.dataType(v)
    }
  }

}

final class MessageAttributeValueOps(val self: MessageAttributeValue) extends AnyVal {

  final def stringValueAsScala: Option[String] = Option(self.stringValue)

  final def binaryValueAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.binaryValue)

  final def stringListValuesAsScala: Option[Seq[String]] = Option(self.stringListValues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def binaryListValuesAsScala: Option[Seq[software.amazon.awssdk.core.SdkBytes]] =
    Option(self.binaryListValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def dataTypeAsScala: Option[String] = Option(self.dataType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMessageAttributeValueOps {

  implicit def toMessageAttributeValueBuilderOps(v: MessageAttributeValue.Builder): MessageAttributeValueBuilderOps =
    new MessageAttributeValueBuilderOps(v)

  implicit def toMessageAttributeValueOps(v: MessageAttributeValue): MessageAttributeValueOps =
    new MessageAttributeValueOps(v)

}
