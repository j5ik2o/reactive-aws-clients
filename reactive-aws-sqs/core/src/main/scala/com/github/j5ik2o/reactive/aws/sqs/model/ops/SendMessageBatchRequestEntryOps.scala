// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageBatchRequestEntryBuilderOps(val self: SendMessageBatchRequestEntry.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def messageBodyAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.messageBody(v)
    }
  }

  final def delaySecondsAsScala(value: Option[Int]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.delaySeconds(v)
    }
  }

  final def messageAttributesAsScala(
      value: Option[Map[String, MessageAttributeValue]]
  ): SendMessageBatchRequestEntry.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messageAttributes(v.asJava)
    }
  }

  final def messageDeduplicationIdAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.messageDeduplicationId(v)
    }
  }

  final def messageGroupIdAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.messageGroupId(v)
    }
  }

}

final class SendMessageBatchRequestEntryOps(val self: SendMessageBatchRequestEntry) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def messageBodyAsScala: Option[String] = Option(self.messageBody)

  final def delaySecondsAsScala: Option[Int] = Option(self.delaySeconds)

  final def messageAttributesAsScala: Option[Map[String, MessageAttributeValue]] = Option(self.messageAttributes).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def messageDeduplicationIdAsScala: Option[String] = Option(self.messageDeduplicationId)

  final def messageGroupIdAsScala: Option[String] = Option(self.messageGroupId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendMessageBatchRequestEntryOps {

  implicit def toSendMessageBatchRequestEntryBuilderOps(
      v: SendMessageBatchRequestEntry.Builder
  ): SendMessageBatchRequestEntryBuilderOps = new SendMessageBatchRequestEntryBuilderOps(v)

  implicit def toSendMessageBatchRequestEntryOps(v: SendMessageBatchRequestEntry): SendMessageBatchRequestEntryOps =
    new SendMessageBatchRequestEntryOps(v)

}
