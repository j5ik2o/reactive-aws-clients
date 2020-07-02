// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageBatchRequestEntryBuilderOps(val self: SendMessageBatchRequestEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageBodyAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v => self.messageBody(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delaySecondsAsScala(value: Option[Int]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v => self.delaySeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAttributesAsScala(
      value: Option[Map[String, MessageAttributeValue]]
  ): SendMessageBatchRequestEntry.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messageAttributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageSystemAttributesAsScala(
      value: Option[Map[MessageSystemAttributeNameForSends, MessageSystemAttributeValue]]
  ): SendMessageBatchRequestEntry.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messageSystemAttributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageDeduplicationIdAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v => self.messageDeduplicationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageGroupIdAsScala(value: Option[String]): SendMessageBatchRequestEntry.Builder = {
    value.fold(self) { v => self.messageGroupId(v) }
  }

}

final class SendMessageBatchRequestEntryOps(val self: SendMessageBatchRequestEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageBodyAsScala: Option[String] = Option(self.messageBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delaySecondsAsScala: Option[Int] = Option(self.delaySeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAttributesAsScala: Option[Map[String, MessageAttributeValue]] =
    Option(self.messageAttributes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageSystemAttributesAsScala
      : Option[Map[MessageSystemAttributeNameForSends, MessageSystemAttributeValue]] =
    Option(self.messageSystemAttributes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageDeduplicationIdAsScala: Option[String] = Option(self.messageDeduplicationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
