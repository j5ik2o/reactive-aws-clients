// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteMessageBatchRequestEntryBuilderOps(val self: DeleteMessageBatchRequestEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): DeleteMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala(value: Option[String]): DeleteMessageBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.receiptHandle(v)
    }
  }

}

final class DeleteMessageBatchRequestEntryOps(val self: DeleteMessageBatchRequestEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala: Option[String] = Option(self.receiptHandle)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMessageBatchRequestEntryOps {

  implicit def toDeleteMessageBatchRequestEntryBuilderOps(
      v: DeleteMessageBatchRequestEntry.Builder
  ): DeleteMessageBatchRequestEntryBuilderOps = new DeleteMessageBatchRequestEntryBuilderOps(v)

  implicit def toDeleteMessageBatchRequestEntryOps(
      v: DeleteMessageBatchRequestEntry
  ): DeleteMessageBatchRequestEntryOps = new DeleteMessageBatchRequestEntryOps(v)

}
