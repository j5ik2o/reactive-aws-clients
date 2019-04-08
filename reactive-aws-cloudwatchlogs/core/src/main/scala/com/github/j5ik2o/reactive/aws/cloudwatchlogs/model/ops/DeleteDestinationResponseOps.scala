// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteDestinationResponseBuilderOps(val self: DeleteDestinationResponse.Builder) extends AnyVal {}

final class DeleteDestinationResponseOps(val self: DeleteDestinationResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteDestinationResponseOps {

  implicit def toDeleteDestinationResponseBuilderOps(
      v: DeleteDestinationResponse.Builder
  ): DeleteDestinationResponseBuilderOps = new DeleteDestinationResponseBuilderOps(v)

  implicit def toDeleteDestinationResponseOps(v: DeleteDestinationResponse): DeleteDestinationResponseOps =
    new DeleteDestinationResponseOps(v)

}
