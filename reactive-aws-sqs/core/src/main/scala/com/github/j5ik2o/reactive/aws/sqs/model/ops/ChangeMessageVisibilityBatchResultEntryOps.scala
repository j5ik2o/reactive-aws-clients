// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ChangeMessageVisibilityBatchResultEntryBuilderOps(val self: ChangeMessageVisibilityBatchResultEntry.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): ChangeMessageVisibilityBatchResultEntry.Builder = {
    value.fold(self) { v => self.id(v) }
  }

}

final class ChangeMessageVisibilityBatchResultEntryOps(val self: ChangeMessageVisibilityBatchResultEntry)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeMessageVisibilityBatchResultEntryOps {

  implicit def toChangeMessageVisibilityBatchResultEntryBuilderOps(
      v: ChangeMessageVisibilityBatchResultEntry.Builder
  ): ChangeMessageVisibilityBatchResultEntryBuilderOps = new ChangeMessageVisibilityBatchResultEntryBuilderOps(v)

  implicit def toChangeMessageVisibilityBatchResultEntryOps(
      v: ChangeMessageVisibilityBatchResultEntry
  ): ChangeMessageVisibilityBatchResultEntryOps = new ChangeMessageVisibilityBatchResultEntryOps(v)

}
