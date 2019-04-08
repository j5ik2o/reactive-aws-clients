// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteLayerVersionResponseBuilderOps(val self: DeleteLayerVersionResponse.Builder) extends AnyVal {}

final class DeleteLayerVersionResponseOps(val self: DeleteLayerVersionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLayerVersionResponseOps {

  implicit def toDeleteLayerVersionResponseBuilderOps(
      v: DeleteLayerVersionResponse.Builder
  ): DeleteLayerVersionResponseBuilderOps = new DeleteLayerVersionResponseBuilderOps(v)

  implicit def toDeleteLayerVersionResponseOps(v: DeleteLayerVersionResponse): DeleteLayerVersionResponseOps =
    new DeleteLayerVersionResponseOps(v)

}
