// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class MessageBuilderOps(val self: Message.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageIdAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.messageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.receiptHandle(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfBodyAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.md5OfBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bodyAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.body(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Map[MessageSystemAttributeName, String]]): Message.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfMessageAttributesAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageAttributes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAttributesAsScala(value: Option[Map[String, MessageAttributeValue]]): Message.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messageAttributes(v.asJava)
    }
  }

}

final class MessageOps(val self: Message) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageIdAsScala: Option[String] = Option(self.messageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala: Option[String] = Option(self.receiptHandle)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfBodyAsScala: Option[String] = Option(self.md5OfBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bodyAsScala: Option[String] = Option(self.body)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Map[MessageSystemAttributeName, String]] = Option(self.attributes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfMessageAttributesAsScala: Option[String] = Option(self.md5OfMessageAttributes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAttributesAsScala: Option[Map[String, MessageAttributeValue]] = Option(self.messageAttributes).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMessageOps {

  implicit def toMessageBuilderOps(v: Message.Builder): MessageBuilderOps = new MessageBuilderOps(v)

  implicit def toMessageOps(v: Message): MessageOps = new MessageOps(v)

}
