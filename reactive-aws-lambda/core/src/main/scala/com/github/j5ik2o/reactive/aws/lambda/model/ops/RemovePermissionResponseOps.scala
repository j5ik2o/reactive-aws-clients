// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class RemovePermissionResponseBuilderOps(val self: RemovePermissionResponse.Builder) extends AnyVal {}

final class RemovePermissionResponseOps(val self: RemovePermissionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemovePermissionResponseOps {

  implicit def toRemovePermissionResponseBuilderOps(
      v: RemovePermissionResponse.Builder
  ): RemovePermissionResponseBuilderOps = new RemovePermissionResponseBuilderOps(v)

  implicit def toRemovePermissionResponseOps(v: RemovePermissionResponse): RemovePermissionResponseOps =
    new RemovePermissionResponseOps(v)

}
