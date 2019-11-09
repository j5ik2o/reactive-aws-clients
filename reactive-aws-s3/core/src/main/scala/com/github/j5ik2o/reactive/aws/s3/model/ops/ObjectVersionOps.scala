// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectVersionBuilderOps(val self: ObjectVersion.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala(value: Option[Long]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala(value: Option[ObjectVersionStorageClass]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isLatestAsScala(value: Option[Boolean]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.isLatest(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[java.time.Instant]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala(value: Option[Owner]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

}

final class ObjectVersionOps(val self: ObjectVersion) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala: Option[String] = Option(self.eTag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala: Option[Long] = Option(self.size)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala: Option[ObjectVersionStorageClass] = Option(self.storageClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isLatestAsScala: Option[Boolean] = Option(self.isLatest)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala: Option[Owner] = Option(self.owner)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectVersionOps {

  implicit def toObjectVersionBuilderOps(v: ObjectVersion.Builder): ObjectVersionBuilderOps =
    new ObjectVersionBuilderOps(v)

  implicit def toObjectVersionOps(v: ObjectVersion): ObjectVersionOps = new ObjectVersionOps(v)

}
