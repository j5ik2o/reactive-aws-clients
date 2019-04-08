// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopySnapshotRequestBuilderOps(val self: CopySnapshotRequest.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def destinationRegionAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.destinationRegion(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def presignedUrlAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.presignedUrl(v)
    }
  }

  final def sourceRegionAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.sourceRegion(v)
    }
  }

  final def sourceSnapshotIdAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.sourceSnapshotId(v)
    }
  }

}

final class CopySnapshotRequestOps(val self: CopySnapshotRequest) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def destinationRegionAsScala: Option[String] = Option(self.destinationRegion)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def presignedUrlAsScala: Option[String] = Option(self.presignedUrl)

  final def sourceRegionAsScala: Option[String] = Option(self.sourceRegion)

  final def sourceSnapshotIdAsScala: Option[String] = Option(self.sourceSnapshotId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopySnapshotRequestOps {

  implicit def toCopySnapshotRequestBuilderOps(v: CopySnapshotRequest.Builder): CopySnapshotRequestBuilderOps =
    new CopySnapshotRequestBuilderOps(v)

  implicit def toCopySnapshotRequestOps(v: CopySnapshotRequest): CopySnapshotRequestOps = new CopySnapshotRequestOps(v)

}
