// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageRequestBuilderOps(val self: SendMessageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageBodyAsScala(value: Option[String]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.messageBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delaySecondsAsScala(value: Option[Int]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.delaySeconds(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAttributesAsScala(value: Option[Map[String, MessageAttributeValue]]): SendMessageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messageAttributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageSystemAttributesAsScala(
      value: Option[Map[MessageSystemAttributeNameForSends, MessageSystemAttributeValue]]
  ): SendMessageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messageSystemAttributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageDeduplicationIdAsScala(value: Option[String]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.messageDeduplicationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageGroupIdAsScala(value: Option[String]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.messageGroupId(v)
    }
  }

}

final class SendMessageRequestOps(val self: SendMessageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageBodyAsScala: Option[String] = Option(self.messageBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delaySecondsAsScala: Option[Int] = Option(self.delaySeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAttributesAsScala: Option[Map[String, MessageAttributeValue]] = Option(self.messageAttributes).map {
    v =>
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
trait ToSendMessageRequestOps {

  implicit def toSendMessageRequestBuilderOps(v: SendMessageRequest.Builder): SendMessageRequestBuilderOps =
    new SendMessageRequestBuilderOps(v)

  implicit def toSendMessageRequestOps(v: SendMessageRequest): SendMessageRequestOps = new SendMessageRequestOps(v)

}
