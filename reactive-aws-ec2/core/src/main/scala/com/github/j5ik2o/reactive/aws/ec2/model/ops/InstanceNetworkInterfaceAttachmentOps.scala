// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceNetworkInterfaceAttachmentBuilderOps(val self: InstanceNetworkInterfaceAttachment.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachTimeAsScala(value: Option[java.time.Instant]): InstanceNetworkInterfaceAttachment.Builder = {
    value.fold(self) { v => self.attachTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentIdAsScala(value: Option[String]): InstanceNetworkInterfaceAttachment.Builder = {
    value.fold(self) { v => self.attachmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala(value: Option[Boolean]): InstanceNetworkInterfaceAttachment.Builder = {
    value.fold(self) { v => self.deleteOnTermination(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceIndexAsScala(value: Option[Int]): InstanceNetworkInterfaceAttachment.Builder = {
    value.fold(self) { v => self.deviceIndex(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[AttachmentStatus]): InstanceNetworkInterfaceAttachment.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class InstanceNetworkInterfaceAttachmentOps(val self: InstanceNetworkInterfaceAttachment) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachTimeAsScala: Option[java.time.Instant] = Option(self.attachTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentIdAsScala: Option[String] = Option(self.attachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceIndexAsScala: Option[Int] = Option(self.deviceIndex)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[AttachmentStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceNetworkInterfaceAttachmentOps {

  implicit def toInstanceNetworkInterfaceAttachmentBuilderOps(
      v: InstanceNetworkInterfaceAttachment.Builder
  ): InstanceNetworkInterfaceAttachmentBuilderOps = new InstanceNetworkInterfaceAttachmentBuilderOps(v)

  implicit def toInstanceNetworkInterfaceAttachmentOps(
      v: InstanceNetworkInterfaceAttachment
  ): InstanceNetworkInterfaceAttachmentOps = new InstanceNetworkInterfaceAttachmentOps(v)

}
