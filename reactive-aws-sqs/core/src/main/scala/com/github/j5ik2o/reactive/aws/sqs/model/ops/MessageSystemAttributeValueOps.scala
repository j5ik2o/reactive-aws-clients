// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class MessageSystemAttributeValueBuilderOps(val self: MessageSystemAttributeValue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stringValueAsScala(value: Option[String]): MessageSystemAttributeValue.Builder = {
    value.fold(self) { v => self.stringValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def binaryValueAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): MessageSystemAttributeValue.Builder = {
    value.fold(self) { v => self.binaryValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stringListValuesAsScala(value: Option[Seq[String]]): MessageSystemAttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stringListValues(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def binaryListValuesAsScala(
      value: Option[Seq[software.amazon.awssdk.core.SdkBytes]]
  ): MessageSystemAttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.binaryListValues(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataTypeAsScala(value: Option[String]): MessageSystemAttributeValue.Builder = {
    value.fold(self) { v => self.dataType(v) }
  }

}

final class MessageSystemAttributeValueOps(val self: MessageSystemAttributeValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stringValueAsScala: Option[String] = Option(self.stringValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def binaryValueAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.binaryValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stringListValuesAsScala: Option[Seq[String]] =
    Option(self.stringListValues).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def binaryListValuesAsScala: Option[Seq[software.amazon.awssdk.core.SdkBytes]] =
    Option(self.binaryListValues).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataTypeAsScala: Option[String] = Option(self.dataType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMessageSystemAttributeValueOps {

  implicit def toMessageSystemAttributeValueBuilderOps(
      v: MessageSystemAttributeValue.Builder
  ): MessageSystemAttributeValueBuilderOps = new MessageSystemAttributeValueBuilderOps(v)

  implicit def toMessageSystemAttributeValueOps(v: MessageSystemAttributeValue): MessageSystemAttributeValueOps =
    new MessageSystemAttributeValueOps(v)

}
