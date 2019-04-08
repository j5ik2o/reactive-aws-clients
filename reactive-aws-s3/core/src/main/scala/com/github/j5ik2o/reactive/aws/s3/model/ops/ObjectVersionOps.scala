// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectVersionBuilderOps(val self: ObjectVersion.Builder) extends AnyVal {

  final def eTagAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  }

  final def sizeAsScala(value: Option[Int]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

  final def storageClassAsScala(value: Option[ObjectVersionStorageClass]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  final def keyAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def isLatestAsScala(value: Option[Boolean]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.isLatest(v)
    }
  }

  final def lastModifiedAsScala(value: Option[java.time.Instant]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  final def ownerAsScala(value: Option[Owner]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

}

final class ObjectVersionOps(val self: ObjectVersion) extends AnyVal {

  final def eTagAsScala: Option[String] = Option(self.eTag)

  final def sizeAsScala: Option[Int] = Option(self.size)

  final def storageClassAsScala: Option[ObjectVersionStorageClass] = Option(self.storageClass)

  final def keyAsScala: Option[String] = Option(self.key)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def isLatestAsScala: Option[Boolean] = Option(self.isLatest)

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  final def ownerAsScala: Option[Owner] = Option(self.owner)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectVersionOps {

  implicit def toObjectVersionBuilderOps(v: ObjectVersion.Builder): ObjectVersionBuilderOps =
    new ObjectVersionBuilderOps(v)

  implicit def toObjectVersionOps(v: ObjectVersion): ObjectVersionOps = new ObjectVersionOps(v)

}
