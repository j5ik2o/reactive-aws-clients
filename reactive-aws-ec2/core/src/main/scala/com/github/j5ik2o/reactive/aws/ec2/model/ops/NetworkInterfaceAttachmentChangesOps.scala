// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfaceAttachmentChangesBuilderOps(val self: NetworkInterfaceAttachmentChanges.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentIdAsScala(value: Option[String]): NetworkInterfaceAttachmentChanges.Builder = {
    value.fold(self) { v =>
      self.attachmentId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala(value: Option[Boolean]): NetworkInterfaceAttachmentChanges.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

}

final class NetworkInterfaceAttachmentChangesOps(val self: NetworkInterfaceAttachmentChanges) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentIdAsScala: Option[String] = Option(self.attachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceAttachmentChangesOps {

  implicit def toNetworkInterfaceAttachmentChangesBuilderOps(
      v: NetworkInterfaceAttachmentChanges.Builder
  ): NetworkInterfaceAttachmentChangesBuilderOps = new NetworkInterfaceAttachmentChangesBuilderOps(v)

  implicit def toNetworkInterfaceAttachmentChangesOps(
      v: NetworkInterfaceAttachmentChanges
  ): NetworkInterfaceAttachmentChangesOps = new NetworkInterfaceAttachmentChangesOps(v)

}
