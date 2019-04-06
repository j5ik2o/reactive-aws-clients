// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageBatchResultEntryBuilderOps(val self: SendMessageBatchResultEntry.Builder) extends AnyVal {

  final def withIdAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withMessageIdAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.messageId(v)
    }
  } // String

  final def withMd5OfMessageBodyAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageBody(v)
    }
  } // String

  final def withMd5OfMessageAttributesAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageAttributes(v)
    }
  } // String

  final def withSequenceNumberAsScala(value: Option[String]): SendMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  } // String

}

final class SendMessageBatchResultEntryOps(val self: SendMessageBatchResultEntry) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def messageIdAsScala: Option[String] = Option(self.messageId) // String

  final def md5OfMessageBodyAsScala: Option[String] = Option(self.md5OfMessageBody) // String

  final def md5OfMessageAttributesAsScala: Option[String] = Option(self.md5OfMessageAttributes) // String

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendMessageBatchResultEntryOps {

  implicit def toSendMessageBatchResultEntryBuilderOps(
      v: SendMessageBatchResultEntry.Builder
  ): SendMessageBatchResultEntryBuilderOps = new SendMessageBatchResultEntryBuilderOps(v)

  implicit def toSendMessageBatchResultEntryOps(v: SendMessageBatchResultEntry): SendMessageBatchResultEntryOps =
    new SendMessageBatchResultEntryOps(v)

}
