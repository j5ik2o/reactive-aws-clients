// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListAvailableSolutionStacksRequestBuilderOps(val self: ListAvailableSolutionStacksRequest.Builder)
    extends AnyVal {}

final class ListAvailableSolutionStacksRequestOps(val self: ListAvailableSolutionStacksRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAvailableSolutionStacksRequestOps {

  implicit def toListAvailableSolutionStacksRequestBuilderOps(
      v: ListAvailableSolutionStacksRequest.Builder
  ): ListAvailableSolutionStacksRequestBuilderOps = new ListAvailableSolutionStacksRequestBuilderOps(v)

  implicit def toListAvailableSolutionStacksRequestOps(
      v: ListAvailableSolutionStacksRequest
  ): ListAvailableSolutionStacksRequestOps = new ListAvailableSolutionStacksRequestOps(v)

}
