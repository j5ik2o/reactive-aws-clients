// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteMarkerEntryBuilderOps(val self: DeleteMarkerEntry.Builder) extends AnyVal {

  final def withOwnerAsScala(value: Option[Owner]): DeleteMarkerEntry.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // Owner

  final def withKeyAsScala(value: Option[String]): DeleteMarkerEntry.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): DeleteMarkerEntry.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withIsLatestAsScala(value: Option[Boolean]): DeleteMarkerEntry.Builder = {
    value.fold(self) { v =>
      self.isLatest(v)
    }
  } // Boolean

  final def withLastModifiedAsScala(value: Option[java.time.Instant]): DeleteMarkerEntry.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

}

final class DeleteMarkerEntryOps(val self: DeleteMarkerEntry) extends AnyVal {

  final def ownerAsScala: Option[Owner] = Option(self.owner) // Owner

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def isLatestAsScala: Option[Boolean] = Option(self.isLatest) // Boolean

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMarkerEntryOps {

  implicit def toDeleteMarkerEntryBuilderOps(v: DeleteMarkerEntry.Builder): DeleteMarkerEntryBuilderOps =
    new DeleteMarkerEntryBuilderOps(v)

  implicit def toDeleteMarkerEntryOps(v: DeleteMarkerEntry): DeleteMarkerEntryOps = new DeleteMarkerEntryOps(v)

}
