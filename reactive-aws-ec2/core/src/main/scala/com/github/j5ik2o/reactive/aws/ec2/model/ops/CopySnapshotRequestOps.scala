// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopySnapshotRequestBuilderOps(val self: CopySnapshotRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationRegionAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.destinationRegion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala(value: Option[Boolean]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def presignedUrlAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.presignedUrl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceRegionAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.sourceRegion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceSnapshotIdAsScala(value: Option[String]): CopySnapshotRequest.Builder = {
    value.fold(self) { v =>
      self.sourceSnapshotId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CopySnapshotRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CopySnapshotRequestOps(val self: CopySnapshotRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationRegionAsScala: Option[String] = Option(self.destinationRegion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def presignedUrlAsScala: Option[String] = Option(self.presignedUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceRegionAsScala: Option[String] = Option(self.sourceRegion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceSnapshotIdAsScala: Option[String] = Option(self.sourceSnapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopySnapshotRequestOps {

  implicit def toCopySnapshotRequestBuilderOps(v: CopySnapshotRequest.Builder): CopySnapshotRequestBuilderOps =
    new CopySnapshotRequestBuilderOps(v)

  implicit def toCopySnapshotRequestOps(v: CopySnapshotRequest): CopySnapshotRequestOps = new CopySnapshotRequestOps(v)

}
