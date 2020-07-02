// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageBatchResponseBuilderOps(val self: SendMessageBatchResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala(value: Option[Seq[SendMessageBatchResultEntry]]): SendMessageBatchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successful(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedAsScala(value: Option[Seq[BatchResultErrorEntry]]): SendMessageBatchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failed(v.asJava)
    }
  }

}

final class SendMessageBatchResponseOps(val self: SendMessageBatchResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala: Option[Seq[SendMessageBatchResultEntry]] =
    Option(self.successful).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedAsScala: Option[Seq[BatchResultErrorEntry]] =
    Option(self.failed).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendMessageBatchResponseOps {

  implicit def toSendMessageBatchResponseBuilderOps(
      v: SendMessageBatchResponse.Builder
  ): SendMessageBatchResponseBuilderOps = new SendMessageBatchResponseBuilderOps(v)

  implicit def toSendMessageBatchResponseOps(v: SendMessageBatchResponse): SendMessageBatchResponseOps =
    new SendMessageBatchResponseOps(v)

}
