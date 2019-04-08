// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageRequestBuilderOps(val self: SendMessageRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

  final def messageBodyAsScala(value: Option[String]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.messageBody(v)
    }
  } // String

  final def delaySecondsAsScala(value: Option[Int]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.delaySeconds(v)
    }
  } // Int

  final def messageAttributesAsScala(value: Option[Map[String, MessageAttributeValue]]): SendMessageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messageAttributes(v.asJava)
    } // Map[String, MessageAttributeValue]
  }

  final def messageDeduplicationIdAsScala(value: Option[String]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.messageDeduplicationId(v)
    }
  } // String

  final def messageGroupIdAsScala(value: Option[String]): SendMessageRequest.Builder = {
    value.fold(self) { v =>
      self.messageGroupId(v)
    }
  } // String

}

final class SendMessageRequestOps(val self: SendMessageRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

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
trait ToSendMessageRequestOps {

  implicit def toSendMessageRequestBuilderOps(v: SendMessageRequest.Builder): SendMessageRequestBuilderOps =
    new SendMessageRequestBuilderOps(v)

  implicit def toSendMessageRequestOps(v: SendMessageRequest): SendMessageRequestOps = new SendMessageRequestOps(v)

}
