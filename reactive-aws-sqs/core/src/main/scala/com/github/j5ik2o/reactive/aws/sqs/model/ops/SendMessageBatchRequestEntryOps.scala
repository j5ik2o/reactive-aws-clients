// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageBatchRequestEntryBuilderOps(val self: SendMessageBatchRequestEntry.Builder) extends AnyVal {

  final def withIdAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withMessageBodyAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.messageBody(v)
    }
  } // String

  final def withDelaySecondsAsScala(value: Option[Int]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.delaySeconds(v)
    }
  } // Int

  final def withMessageAttributesAsScala(
      value: Option[Map[String, MessageAttributeValue]]
  ): SendMessageBatchRequestEntry.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messageAttributes(v.asJava)
    } // Map[String, MessageAttributeValue]
  }

  final def withMessageDeduplicationIdAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.messageDeduplicationId(v)
    }
  } // String

  final def withMessageGroupIdAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.messageGroupId(v)
    }
  } // String

}

final class SendMessageBatchRequestEntryOps(val self: SendMessageBatchRequestEntry) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def messageBodyAsScala: Option[String] = Option(self.messageBody) // String

  final def delaySecondsAsScala: Option[Int] = Option(self.delaySeconds) // Int

  final def messageAttributesAsScala: Option[Map[String, MessageAttributeValue]] = Option(self.messageAttributes).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, MessageAttributeValue]

  final def messageDeduplicationIdAsScala: Option[String] = Option(self.messageDeduplicationId) // String

  final def messageGroupIdAsScala: Option[String] = Option(self.messageGroupId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendMessageBatchRequestEntryOps {

  implicit def toSendMessageBatchRequestEntryBuilderOps(
      v: SendMessageBatchRequestEntry.Builder
  ): SendMessageBatchRequestEntryBuilderOps = new SendMessageBatchRequestEntryBuilderOps(v)

  implicit def toSendMessageBatchRequestEntryOps(v: SendMessageBatchRequestEntry): SendMessageBatchRequestEntryOps =
    new SendMessageBatchRequestEntryOps(v)

}
