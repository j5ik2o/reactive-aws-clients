// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DeleteDashboardsResponseBuilderOps(val self: DeleteDashboardsResponse.Builder) extends AnyVal {}

final class DeleteDashboardsResponseOps(val self: DeleteDashboardsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteDashboardsResponseOps {

  implicit def toDeleteDashboardsResponseBuilderOps(
      v: DeleteDashboardsResponse.Builder
  ): DeleteDashboardsResponseBuilderOps = new DeleteDashboardsResponseBuilderOps(v)

  implicit def toDeleteDashboardsResponseOps(v: DeleteDashboardsResponse): DeleteDashboardsResponseOps =
    new DeleteDashboardsResponseOps(v)

}
