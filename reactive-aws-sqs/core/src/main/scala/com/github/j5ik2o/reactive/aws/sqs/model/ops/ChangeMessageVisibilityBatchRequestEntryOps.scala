// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ChangeMessageVisibilityBatchRequestEntryBuilderOps(
    val self: ChangeMessageVisibilityBatchRequestEntry.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): ChangeMessageVisibilityBatchRequestEntry.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala(value: Option[String]): ChangeMessageVisibilityBatchRequestEntry.Builder = {
    value.fold(self) { v => self.receiptHandle(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityTimeoutAsScala(value: Option[Int]): ChangeMessageVisibilityBatchRequestEntry.Builder = {
    value.fold(self) { v => self.visibilityTimeout(v) }
  }

}

final class ChangeMessageVisibilityBatchRequestEntryOps(val self: ChangeMessageVisibilityBatchRequestEntry)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala: Option[String] = Option(self.receiptHandle)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityTimeoutAsScala: Option[Int] = Option(self.visibilityTimeout)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeMessageVisibilityBatchRequestEntryOps {

  implicit def toChangeMessageVisibilityBatchRequestEntryBuilderOps(
      v: ChangeMessageVisibilityBatchRequestEntry.Builder
  ): ChangeMessageVisibilityBatchRequestEntryBuilderOps = new ChangeMessageVisibilityBatchRequestEntryBuilderOps(v)

  implicit def toChangeMessageVisibilityBatchRequestEntryOps(
      v: ChangeMessageVisibilityBatchRequestEntry
  ): ChangeMessageVisibilityBatchRequestEntryOps = new ChangeMessageVisibilityBatchRequestEntryOps(v)

}
