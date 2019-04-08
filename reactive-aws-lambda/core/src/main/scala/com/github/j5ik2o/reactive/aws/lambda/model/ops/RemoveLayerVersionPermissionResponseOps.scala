// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class RemoveLayerVersionPermissionResponseBuilderOps(val self: RemoveLayerVersionPermissionResponse.Builder)
    extends AnyVal {}

final class RemoveLayerVersionPermissionResponseOps(val self: RemoveLayerVersionPermissionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemoveLayerVersionPermissionResponseOps {

  implicit def toRemoveLayerVersionPermissionResponseBuilderOps(
      v: RemoveLayerVersionPermissionResponse.Builder
  ): RemoveLayerVersionPermissionResponseBuilderOps = new RemoveLayerVersionPermissionResponseBuilderOps(v)

  implicit def toRemoveLayerVersionPermissionResponseOps(
      v: RemoveLayerVersionPermissionResponse
  ): RemoveLayerVersionPermissionResponseOps = new RemoveLayerVersionPermissionResponseOps(v)

}
