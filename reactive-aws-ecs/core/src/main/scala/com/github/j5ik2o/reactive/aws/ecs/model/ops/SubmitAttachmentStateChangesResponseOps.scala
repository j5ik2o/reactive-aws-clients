// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SubmitAttachmentStateChangesResponseBuilderOps(val self: SubmitAttachmentStateChangesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acknowledgmentAsScala(value: Option[String]): SubmitAttachmentStateChangesResponse.Builder = {
    value.fold(self) { v =>
      self.acknowledgment(v)
    }
  }

}

final class SubmitAttachmentStateChangesResponseOps(val self: SubmitAttachmentStateChangesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acknowledgmentAsScala: Option[String] = Option(self.acknowledgment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitAttachmentStateChangesResponseOps {

  implicit def toSubmitAttachmentStateChangesResponseBuilderOps(
      v: SubmitAttachmentStateChangesResponse.Builder
  ): SubmitAttachmentStateChangesResponseBuilderOps = new SubmitAttachmentStateChangesResponseBuilderOps(v)

  implicit def toSubmitAttachmentStateChangesResponseOps(
      v: SubmitAttachmentStateChangesResponse
  ): SubmitAttachmentStateChangesResponseOps = new SubmitAttachmentStateChangesResponseOps(v)

}
