// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteMessageBatchRequestBuilderOps(val self: DeleteMessageBatchRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): DeleteMessageBatchRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala(value: Option[Seq[DeleteMessageBatchRequestEntry]]): DeleteMessageBatchRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.entries(v.asJava)
    }
  }

}

final class DeleteMessageBatchRequestOps(val self: DeleteMessageBatchRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala: Option[Seq[DeleteMessageBatchRequestEntry]] =
    Option(self.entries).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMessageBatchRequestOps {

  implicit def toDeleteMessageBatchRequestBuilderOps(
      v: DeleteMessageBatchRequest.Builder
  ): DeleteMessageBatchRequestBuilderOps = new DeleteMessageBatchRequestBuilderOps(v)

  implicit def toDeleteMessageBatchRequestOps(v: DeleteMessageBatchRequest): DeleteMessageBatchRequestOps =
    new DeleteMessageBatchRequestOps(v)

}
