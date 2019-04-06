// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class MessageAttributeValueBuilderOps(val self: MessageAttributeValue.Builder) extends AnyVal {

  final def withStringValueAsScala(value: Option[String]): MessageAttributeValue.Builder = {
    value.fold(self) { v =>
      self.stringValue(v)
    }
  } // String

  final def withBinaryValueAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): MessageAttributeValue.Builder = {
    value.fold(self) { v =>
      self.binaryValue(v)
    }
  } // SdkBytes

  final def withStringListValuesAsScala(value: Option[Seq[String]]): MessageAttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stringListValues(v.asJava)
    } // Seq[String]
  }

  final def withBinaryListValuesAsScala(
      value: Option[Seq[software.amazon.awssdk.core.SdkBytes]]
  ): MessageAttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.binaryListValues(v.asJava)
    } // Seq[SdkBytes]
  }

  final def withDataTypeAsScala(value: Option[String]): MessageAttributeValue.Builder = {
    value.fold(self) { v =>
      self.dataType(v)
    }
  } // String

}

final class MessageAttributeValueOps(val self: MessageAttributeValue) extends AnyVal {

  final def stringValueAsScala: Option[String] = Option(self.stringValue) // String

  final def binaryValueAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.binaryValue) // SdkBytes

  final def stringListValuesAsScala: Option[Seq[String]] = Option(self.stringListValues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def binaryListValuesAsScala: Option[Seq[software.amazon.awssdk.core.SdkBytes]] =
    Option(self.binaryListValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[SdkBytes]

  final def dataTypeAsScala: Option[String] = Option(self.dataType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMessageAttributeValueOps {

  implicit def toMessageAttributeValueBuilderOps(v: MessageAttributeValue.Builder): MessageAttributeValueBuilderOps =
    new MessageAttributeValueBuilderOps(v)

  implicit def toMessageAttributeValueOps(v: MessageAttributeValue): MessageAttributeValueOps =
    new MessageAttributeValueOps(v)

}
