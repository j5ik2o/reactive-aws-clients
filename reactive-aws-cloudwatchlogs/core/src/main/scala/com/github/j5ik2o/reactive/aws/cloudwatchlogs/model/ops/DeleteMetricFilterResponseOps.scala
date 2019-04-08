// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteMetricFilterResponseBuilderOps(val self: DeleteMetricFilterResponse.Builder) extends AnyVal {}

final class DeleteMetricFilterResponseOps(val self: DeleteMetricFilterResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMetricFilterResponseOps {

  implicit def toDeleteMetricFilterResponseBuilderOps(
      v: DeleteMetricFilterResponse.Builder
  ): DeleteMetricFilterResponseBuilderOps = new DeleteMetricFilterResponseBuilderOps(v)

  implicit def toDeleteMetricFilterResponseOps(v: DeleteMetricFilterResponse): DeleteMetricFilterResponseOps =
    new DeleteMetricFilterResponseOps(v)

}
