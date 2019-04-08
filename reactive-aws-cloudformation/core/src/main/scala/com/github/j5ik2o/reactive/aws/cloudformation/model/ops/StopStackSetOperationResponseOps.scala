// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StopStackSetOperationResponseBuilderOps(val self: StopStackSetOperationResponse.Builder) extends AnyVal {}

final class StopStackSetOperationResponseOps(val self: StopStackSetOperationResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopStackSetOperationResponseOps {

  implicit def toStopStackSetOperationResponseBuilderOps(
      v: StopStackSetOperationResponse.Builder
  ): StopStackSetOperationResponseBuilderOps = new StopStackSetOperationResponseBuilderOps(v)

  implicit def toStopStackSetOperationResponseOps(v: StopStackSetOperationResponse): StopStackSetOperationResponseOps =
    new StopStackSetOperationResponseOps(v)

}
