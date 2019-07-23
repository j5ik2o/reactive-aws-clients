// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class AttachmentStateChangeBuilderOps(val self: AttachmentStateChange.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentArnAsScala(value: Option[String]): AttachmentStateChange.Builder = {
    value.fold(self) { v =>
      self.attachmentArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): AttachmentStateChange.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class AttachmentStateChangeOps(val self: AttachmentStateChange) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentArnAsScala: Option[String] = Option(self.attachmentArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachmentStateChangeOps {

  implicit def toAttachmentStateChangeBuilderOps(v: AttachmentStateChange.Builder): AttachmentStateChangeBuilderOps =
    new AttachmentStateChangeBuilderOps(v)

  implicit def toAttachmentStateChangeOps(v: AttachmentStateChange): AttachmentStateChangeOps =
    new AttachmentStateChangeOps(v)

}
