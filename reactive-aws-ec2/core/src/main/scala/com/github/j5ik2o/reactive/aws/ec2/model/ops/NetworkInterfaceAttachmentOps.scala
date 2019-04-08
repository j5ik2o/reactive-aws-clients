// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfaceAttachmentBuilderOps(val self: NetworkInterfaceAttachment.Builder) extends AnyVal {

  final def attachTimeAsScala(value: Option[java.time.Instant]): NetworkInterfaceAttachment.Builder = {
    value.fold(self) { v =>
      self.attachTime(v)
    }
  }

  final def attachmentIdAsScala(value: Option[String]): NetworkInterfaceAttachment.Builder = {
    value.fold(self) { v =>
      self.attachmentId(v)
    }
  }

  final def deleteOnTerminationAsScala(value: Option[Boolean]): NetworkInterfaceAttachment.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

  final def deviceIndexAsScala(value: Option[Int]): NetworkInterfaceAttachment.Builder = {
    value.fold(self) { v =>
      self.deviceIndex(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): NetworkInterfaceAttachment.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceOwnerIdAsScala(value: Option[String]): NetworkInterfaceAttachment.Builder = {
    value.fold(self) { v =>
      self.instanceOwnerId(v)
    }
  }

  final def statusAsScala(value: Option[AttachmentStatus]): NetworkInterfaceAttachment.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class NetworkInterfaceAttachmentOps(val self: NetworkInterfaceAttachment) extends AnyVal {

  final def attachTimeAsScala: Option[java.time.Instant] = Option(self.attachTime)

  final def attachmentIdAsScala: Option[String] = Option(self.attachmentId)

  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  final def deviceIndexAsScala: Option[Int] = Option(self.deviceIndex)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceOwnerIdAsScala: Option[String] = Option(self.instanceOwnerId)

  final def statusAsScala: Option[AttachmentStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceAttachmentOps {

  implicit def toNetworkInterfaceAttachmentBuilderOps(
      v: NetworkInterfaceAttachment.Builder
  ): NetworkInterfaceAttachmentBuilderOps = new NetworkInterfaceAttachmentBuilderOps(v)

  implicit def toNetworkInterfaceAttachmentOps(v: NetworkInterfaceAttachment): NetworkInterfaceAttachmentOps =
    new NetworkInterfaceAttachmentOps(v)

}
