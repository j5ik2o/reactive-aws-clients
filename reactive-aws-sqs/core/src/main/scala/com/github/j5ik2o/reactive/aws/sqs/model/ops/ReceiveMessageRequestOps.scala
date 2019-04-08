// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ReceiveMessageRequestBuilderOps(val self: ReceiveMessageRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

  final def attributeNamesAsScala(value: Option[Seq[QueueAttributeName]]): ReceiveMessageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeNames(v.asJava)
    } // Seq[String]
  }

  final def messageAttributeNamesAsScala(value: Option[Seq[String]]): ReceiveMessageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messageAttributeNames(v.asJava)
    } // Seq[String]
  }

  final def maxNumberOfMessagesAsScala(value: Option[Int]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v =>
      self.maxNumberOfMessages(v)
    }
  } // Int

  final def visibilityTimeoutAsScala(value: Option[Int]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v =>
      self.visibilityTimeout(v)
    }
  } // Int

  final def waitTimeSecondsAsScala(value: Option[Int]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v =>
      self.waitTimeSeconds(v)
    }
  } // Int

  final def receiveRequestAttemptIdAsScala(value: Option[String]): ReceiveMessageRequest.Builder = {
    value.fold(self) { v =>
      self.receiveRequestAttemptId(v)
    }
  } // String

}

final class ReceiveMessageRequestOps(val self: ReceiveMessageRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

  final def attributeNamesAsScala: Option[Seq[QueueAttributeName]] = Option(self.attributeNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def messageAttributeNamesAsScala: Option[Seq[String]] = Option(self.messageAttributeNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def maxNumberOfMessagesAsScala: Option[Int] = Option(self.maxNumberOfMessages) // Int

  final def visibilityTimeoutAsScala: Option[Int] = Option(self.visibilityTimeout) // Int

  final def waitTimeSecondsAsScala: Option[Int] = Option(self.waitTimeSeconds) // Int

  final def receiveRequestAttemptIdAsScala: Option[String] = Option(self.receiveRequestAttemptId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReceiveMessageRequestOps {

  implicit def toReceiveMessageRequestBuilderOps(v: ReceiveMessageRequest.Builder): ReceiveMessageRequestBuilderOps =
    new ReceiveMessageRequestBuilderOps(v)

  implicit def toReceiveMessageRequestOps(v: ReceiveMessageRequest): ReceiveMessageRequestOps =
    new ReceiveMessageRequestOps(v)

}
