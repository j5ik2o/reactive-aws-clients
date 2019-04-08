// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DiskImageDetailBuilderOps(val self: DiskImageDetail.Builder) extends AnyVal {

  final def bytesAsScala(value: Option[Long]): DiskImageDetail.Builder = {
    value.fold(self) { v =>
      self.bytes(v)
    }
  }

  final def formatAsScala(value: Option[DiskImageFormat]): DiskImageDetail.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  final def importManifestUrlAsScala(value: Option[String]): DiskImageDetail.Builder = {
    value.fold(self) { v =>
      self.importManifestUrl(v)
    }
  }

}

final class DiskImageDetailOps(val self: DiskImageDetail) extends AnyVal {

  final def bytesAsScala: Option[Long] = Option(self.bytes)

  final def formatAsScala: Option[DiskImageFormat] = Option(self.format)

  final def importManifestUrlAsScala: Option[String] = Option(self.importManifestUrl)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDiskImageDetailOps {

  implicit def toDiskImageDetailBuilderOps(v: DiskImageDetail.Builder): DiskImageDetailBuilderOps =
    new DiskImageDetailBuilderOps(v)

  implicit def toDiskImageDetailOps(v: DiskImageDetail): DiskImageDetailOps = new DiskImageDetailOps(v)

}
