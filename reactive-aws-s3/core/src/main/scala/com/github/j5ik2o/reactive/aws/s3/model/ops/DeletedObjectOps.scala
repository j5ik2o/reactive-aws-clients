// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeletedObjectBuilderOps(val self: DeletedObject.Builder) extends AnyVal {

  final def keyAsScala(value: Option[String]): DeletedObject.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): DeletedObject.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def deleteMarkerAsScala(value: Option[Boolean]): DeletedObject.Builder = {
    value.fold(self) { v =>
      self.deleteMarker(v)
    }
  }

  final def deleteMarkerVersionIdAsScala(value: Option[String]): DeletedObject.Builder = {
    value.fold(self) { v =>
      self.deleteMarkerVersionId(v)
    }
  }

}

final class DeletedObjectOps(val self: DeletedObject) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def deleteMarkerAsScala: Option[Boolean] = Option(self.deleteMarker)

  final def deleteMarkerVersionIdAsScala: Option[String] = Option(self.deleteMarkerVersionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletedObjectOps {

  implicit def toDeletedObjectBuilderOps(v: DeletedObject.Builder): DeletedObjectBuilderOps =
    new DeletedObjectBuilderOps(v)

  implicit def toDeletedObjectOps(v: DeletedObject): DeletedObjectOps = new DeletedObjectOps(v)

}
