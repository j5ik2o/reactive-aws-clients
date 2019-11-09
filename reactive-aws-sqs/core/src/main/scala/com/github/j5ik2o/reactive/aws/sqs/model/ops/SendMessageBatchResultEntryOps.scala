// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageBatchResultEntryBuilderOps(val self: SendMessageBatchResultEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageIdAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.messageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfMessageBodyAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfMessageAttributesAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageAttributes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfMessageSystemAttributesAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageSystemAttributes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceNumberAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  }

}

final class SendMessageBatchResultEntryOps(val self: SendMessageBatchResultEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageIdAsScala: Option[String] = Option(self.messageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfMessageBodyAsScala: Option[String] = Option(self.md5OfMessageBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfMessageAttributesAsScala: Option[String] = Option(self.md5OfMessageAttributes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def md5OfMessageSystemAttributesAsScala: Option[String] = Option(self.md5OfMessageSystemAttributes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendMessageBatchResultEntryOps {

  implicit def toSendMessageBatchResultEntryBuilderOps(
      v: SendMessageBatchResultEntry.Builder
  ): SendMessageBatchResultEntryBuilderOps = new SendMessageBatchResultEntryBuilderOps(v)

  implicit def toSendMessageBatchResultEntryOps(v: SendMessageBatchResultEntry): SendMessageBatchResultEntryOps =
    new SendMessageBatchResultEntryOps(v)

}
