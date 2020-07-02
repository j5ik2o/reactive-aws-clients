// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ReceiveMessageRequestBuilderOps(val self: ReceiveMessageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNamesAsScala(value: Option[Seq[QueueAttributeName]]): ReceiveMessageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAttributeNamesAsScala(value: Option[Seq[String]]): ReceiveMessageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messageAttributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxNumberOfMessagesAsScala(value: Option[Int]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v => self.maxNumberOfMessages(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityTimeoutAsScala(value: Option[Int]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v => self.visibilityTimeout(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def waitTimeSecondsAsScala(value: Option[Int]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v => self.waitTimeSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiveRequestAttemptIdAsScala(value: Option[String]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v => self.receiveRequestAttemptId(v) }
  }

}

final class ReceiveMessageRequestOps(val self: ReceiveMessageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNamesAsScala: Option[Seq[QueueAttributeName]] =
    Option(self.attributeNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAttributeNamesAsScala: Option[Seq[String]] =
    Option(self.messageAttributeNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxNumberOfMessagesAsScala: Option[Int] = Option(self.maxNumberOfMessages)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityTimeoutAsScala: Option[Int] = Option(self.visibilityTimeout)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def waitTimeSecondsAsScala: Option[Int] = Option(self.waitTimeSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiveRequestAttemptIdAsScala: Option[String] = Option(self.receiveRequestAttemptId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReceiveMessageRequestOps {

  implicit def toReceiveMessageRequestBuilderOps(v: ReceiveMessageRequest.Builder): ReceiveMessageRequestBuilderOps =
    new ReceiveMessageRequestBuilderOps(v)

  implicit def toReceiveMessageRequestOps(v: ReceiveMessageRequest): ReceiveMessageRequestOps =
    new ReceiveMessageRequestOps(v)

}
