// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeletedObjectBuilderOps(val self: DeletedObject.Builder) extends AnyVal {

  final def withKeyAsScala(value: Option[String]): DeletedObject.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): DeletedObject.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withDeleteMarkerAsScala(value: Option[Boolean]): DeletedObject.Builder = {
    value.fold(self) { v =>
      self.deleteMarker(v)
    }
  } // Boolean

  final def withDeleteMarkerVersionIdAsScala(value: Option[String]): DeletedObject.Builder = {
    value.fold(self) { v =>
      self.deleteMarkerVersionId(v)
    }
  } // String

}

final class DeletedObjectOps(val self: DeletedObject) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def deleteMarkerAsScala: Option[Boolean] = Option(self.deleteMarker) // Boolean

  final def deleteMarkerVersionIdAsScala: Option[String] = Option(self.deleteMarkerVersionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletedObjectOps {

  implicit def toDeletedObjectBuilderOps(v: DeletedObject.Builder): DeletedObjectBuilderOps =
    new DeletedObjectBuilderOps(v)

  implicit def toDeletedObjectOps(v: DeletedObject): DeletedObjectOps = new DeletedObjectOps(v)

}
