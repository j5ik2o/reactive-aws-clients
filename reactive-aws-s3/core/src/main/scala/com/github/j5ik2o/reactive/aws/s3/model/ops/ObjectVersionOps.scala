// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectVersionBuilderOps(val self: ObjectVersion.Builder) extends AnyVal {

  final def withETagAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def withSizeAsScala(value: Option[Int]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  } // Int

  final def withStorageClassAsScala(value: Option[ObjectVersionStorageClass]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withIsLatestAsScala(value: Option[Boolean]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.isLatest(v)
    }
  } // Boolean

  final def withLastModifiedAsScala(value: Option[java.time.Instant]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

  final def withOwnerAsScala(value: Option[Owner]): ObjectVersion.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // Owner

}

final class ObjectVersionOps(val self: ObjectVersion) extends AnyVal {

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def sizeAsScala: Option[Int] = Option(self.size) // Int

  final def storageClassAsScala: Option[ObjectVersionStorageClass] = Option(self.storageClass) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def isLatestAsScala: Option[Boolean] = Option(self.isLatest) // Boolean

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // Instant

  final def ownerAsScala: Option[Owner] = Option(self.owner) // Owner

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectVersionOps {

  implicit def toObjectVersionBuilderOps(v: ObjectVersion.Builder): ObjectVersionBuilderOps =
    new ObjectVersionBuilderOps(v)

  implicit def toObjectVersionOps(v: ObjectVersion): ObjectVersionOps = new ObjectVersionOps(v)

}
