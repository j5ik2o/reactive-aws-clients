// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ChangeMessageVisibilityBatchRequestEntryBuilderOps(
    val self: ChangeMessageVisibilityBatchRequestEntry.Builder
) extends AnyVal {

  final def withIdAsScala(value: Option[String]): ChangeMessageVisibilityBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withReceiptHandleAsScala(value: Option[String]): ChangeMessageVisibilityBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.receiptHandle(v)
    }
  } // String

  final def withVisibilityTimeoutAsScala(value: Option[Int]): ChangeMessageVisibilityBatchRequestEntry.Builder = {
    value.fold(self) { v =>
      self.visibilityTimeout(v)
    }
  } // Int

}

final class ChangeMessageVisibilityBatchRequestEntryOps(val self: ChangeMessageVisibilityBatchRequestEntry)
    extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def receiptHandleAsScala: Option[String] = Option(self.receiptHandle) // String

  final def visibilityTimeoutAsScala: Option[Int] = Option(self.visibilityTimeout) // Int

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
