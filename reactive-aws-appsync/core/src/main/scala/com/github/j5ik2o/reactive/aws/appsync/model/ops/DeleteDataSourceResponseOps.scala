// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteDataSourceResponseBuilderOps(val self: DeleteDataSourceResponse.Builder) extends AnyVal {}

final class DeleteDataSourceResponseOps(val self: DeleteDataSourceResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteDataSourceResponseOps {

  implicit def toDeleteDataSourceResponseBuilderOps(
      v: DeleteDataSourceResponse.Builder
  ): DeleteDataSourceResponseBuilderOps = new DeleteDataSourceResponseBuilderOps(v)

  implicit def toDeleteDataSourceResponseOps(v: DeleteDataSourceResponse): DeleteDataSourceResponseOps =
    new DeleteDataSourceResponseOps(v)

}
