// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class MessageBuilderOps(val self: Message.Builder) extends AnyVal {

  final def messageIdAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.messageId(v)
    }
  }

  final def receiptHandleAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.receiptHandle(v)
    }
  }

  final def md5OfBodyAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.md5OfBody(v)
    }
  }

  final def bodyAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.body(v)
    }
  }

  final def attributesAsScala(value: Option[Map[MessageSystemAttributeName, String]]): Message.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    }
  }

  final def md5OfMessageAttributesAsScala(value: Option[String]): Message.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageAttributes(v)
    }
  }

  final def messageAttributesAsScala(value: Option[Map[String, MessageAttributeValue]]): Message.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messageAttributes(v.asJava)
    }
  }

}

final class MessageOps(val self: Message) extends AnyVal {

  final def messageIdAsScala: Option[String] = Option(self.messageId)

  final def receiptHandleAsScala: Option[String] = Option(self.receiptHandle)

  final def md5OfBodyAsScala: Option[String] = Option(self.md5OfBody)

  final def bodyAsScala: Option[String] = Option(self.body)

  final def attributesAsScala: Option[Map[MessageSystemAttributeName, String]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def md5OfMessageAttributesAsScala: Option[String] = Option(self.md5OfMessageAttributes)

  final def messageAttributesAsScala: Option[Map[String, MessageAttributeValue]] = Option(self.messageAttributes).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMessageOps {

  implicit def toMessageBuilderOps(v: Message.Builder): MessageBuilderOps = new MessageBuilderOps(v)

  implicit def toMessageOps(v: Message): MessageOps = new MessageOps(v)

}
