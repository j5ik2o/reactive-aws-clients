// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class RemoveLayerVersionPermissionRequestBuilderOps(val self: RemoveLayerVersionPermissionRequest.Builder)
    extends AnyVal {

  final def layerNameAsScala(value: Option[String]): RemoveLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  } // String

  final def versionNumberAsScala(value: Option[Long]): RemoveLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  } // Long

  final def statementIdAsScala(value: Option[String]): RemoveLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.statementId(v)
    }
  } // String

  final def revisionIdAsScala(value: Option[String]): RemoveLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

}

final class RemoveLayerVersionPermissionRequestOps(val self: RemoveLayerVersionPermissionRequest) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName) // String

  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber) // Long

  final def statementIdAsScala: Option[String] = Option(self.statementId) // String

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemoveLayerVersionPermissionRequestOps {

  implicit def toRemoveLayerVersionPermissionRequestBuilderOps(
      v: RemoveLayerVersionPermissionRequest.Builder
  ): RemoveLayerVersionPermissionRequestBuilderOps = new RemoveLayerVersionPermissionRequestBuilderOps(v)

  implicit def toRemoveLayerVersionPermissionRequestOps(
      v: RemoveLayerVersionPermissionRequest
  ): RemoveLayerVersionPermissionRequestOps = new RemoveLayerVersionPermissionRequestOps(v)

}
