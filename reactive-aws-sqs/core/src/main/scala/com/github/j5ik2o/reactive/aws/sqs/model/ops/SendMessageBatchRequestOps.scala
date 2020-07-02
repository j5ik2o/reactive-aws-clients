// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageBatchRequestBuilderOps(val self: SendMessageBatchRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): SendMessageBatchRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala(value: Option[Seq[SendMessageBatchRequestEntry]]): SendMessageBatchRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.entries(v.asJava)
    }
  }

}

final class SendMessageBatchRequestOps(val self: SendMessageBatchRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala: Option[Seq[SendMessageBatchRequestEntry]] =
    Option(self.entries).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendMessageBatchRequestOps {

  implicit def toSendMessageBatchRequestBuilderOps(
      v: SendMessageBatchRequest.Builder
  ): SendMessageBatchRequestBuilderOps = new SendMessageBatchRequestBuilderOps(v)

  implicit def toSendMessageBatchRequestOps(v: SendMessageBatchRequest): SendMessageBatchRequestOps =
    new SendMessageBatchRequestOps(v)

}
