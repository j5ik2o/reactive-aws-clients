// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class RemoveLayerVersionPermissionRequestBuilderOps(val self: RemoveLayerVersionPermissionRequest.Builder)
    extends AnyVal {

  final def layerNameAsScala(value: Option[String]): RemoveLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  }

  final def versionNumberAsScala(value: Option[Long]): RemoveLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  }

  final def statementIdAsScala(value: Option[String]): RemoveLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.statementId(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): RemoveLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class RemoveLayerVersionPermissionRequestOps(val self: RemoveLayerVersionPermissionRequest) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName)

  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

  final def statementIdAsScala: Option[String] = Option(self.statementId)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

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
