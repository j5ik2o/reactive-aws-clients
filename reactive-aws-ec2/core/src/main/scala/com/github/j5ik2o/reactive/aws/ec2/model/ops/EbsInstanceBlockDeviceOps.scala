// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EbsInstanceBlockDeviceBuilderOps(val self: EbsInstanceBlockDevice.Builder) extends AnyVal {

  final def attachTimeAsScala(value: Option[java.time.Instant]): EbsInstanceBlockDevice.Builder = {
    value.fold(self) { v =>
      self.attachTime(v)
    }
  }

  final def deleteOnTerminationAsScala(value: Option[Boolean]): EbsInstanceBlockDevice.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

  final def statusAsScala(value: Option[AttachmentStatus]): EbsInstanceBlockDevice.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def volumeIdAsScala(value: Option[String]): EbsInstanceBlockDevice.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

}

final class EbsInstanceBlockDeviceOps(val self: EbsInstanceBlockDevice) extends AnyVal {

  final def attachTimeAsScala: Option[java.time.Instant] = Option(self.attachTime)

  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  final def statusAsScala: Option[AttachmentStatus] = Option(self.status)

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEbsInstanceBlockDeviceOps {

  implicit def toEbsInstanceBlockDeviceBuilderOps(v: EbsInstanceBlockDevice.Builder): EbsInstanceBlockDeviceBuilderOps =
    new EbsInstanceBlockDeviceBuilderOps(v)

  implicit def toEbsInstanceBlockDeviceOps(v: EbsInstanceBlockDevice): EbsInstanceBlockDeviceOps =
    new EbsInstanceBlockDeviceOps(v)

}
