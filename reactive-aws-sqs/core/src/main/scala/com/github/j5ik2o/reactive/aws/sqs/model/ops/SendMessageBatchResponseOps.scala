// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageBatchResponseBuilderOps(val self: SendMessageBatchResponse.Builder) extends AnyVal {

  final def withSuccessfulAsScala(value: Option[Seq[SendMessageBatchResultEntry]]): SendMessageBatchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.successful(v.asJava)
    } // Seq[SendMessageBatchResultEntry]
  }

  final def withFailedAsScala(value: Option[Seq[BatchResultErrorEntry]]): SendMessageBatchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.failed(v.asJava)
    } // Seq[BatchResultErrorEntry]
  }

}

final class SendMessageBatchResponseOps(val self: SendMessageBatchResponse) extends AnyVal {

  final def successfulAsScala: Option[Seq[SendMessageBatchResultEntry]] = Option(self.successful).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[SendMessageBatchResultEntry]

  final def failedAsScala: Option[Seq[BatchResultErrorEntry]] = Option(self.failed).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[BatchResultErrorEntry]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendMessageBatchResponseOps {

  implicit def toSendMessageBatchResponseBuilderOps(
      v: SendMessageBatchResponse.Builder
  ): SendMessageBatchResponseBuilderOps = new SendMessageBatchResponseBuilderOps(v)

  implicit def toSendMessageBatchResponseOps(v: SendMessageBatchResponse): SendMessageBatchResponseOps =
    new SendMessageBatchResponseOps(v)

}