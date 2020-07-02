// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ChangeMessageVisibilityBatchRequestBuilderOps(val self: ChangeMessageVisibilityBatchRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): ChangeMessageVisibilityBatchRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala(
      value: Option[Seq[ChangeMessageVisibilityBatchRequestEntry]]
  ): ChangeMessageVisibilityBatchRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.entries(v.asJava)
    }
  }

}

final class ChangeMessageVisibilityBatchRequestOps(val self: ChangeMessageVisibilityBatchRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala: Option[Seq[ChangeMessageVisibilityBatchRequestEntry]] =
    Option(self.entries).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeMessageVisibilityBatchRequestOps {

  implicit def toChangeMessageVisibilityBatchRequestBuilderOps(
      v: ChangeMessageVisibilityBatchRequest.Builder
  ): ChangeMessageVisibilityBatchRequestBuilderOps = new ChangeMessageVisibilityBatchRequestBuilderOps(v)

  implicit def toChangeMessageVisibilityBatchRequestOps(
      v: ChangeMessageVisibilityBatchRequest
  ): ChangeMessageVisibilityBatchRequestOps = new ChangeMessageVisibilityBatchRequestOps(v)

}
