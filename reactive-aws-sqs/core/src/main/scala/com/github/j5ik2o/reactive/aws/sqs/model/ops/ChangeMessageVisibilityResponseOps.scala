// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ChangeMessageVisibilityResponseBuilderOps(val self: ChangeMessageVisibilityResponse.Builder)
    extends AnyVal {}

final class ChangeMessageVisibilityResponseOps(val self: ChangeMessageVisibilityResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeMessageVisibilityResponseOps {

  implicit def toChangeMessageVisibilityResponseBuilderOps(
      v: ChangeMessageVisibilityResponse.Builder
  ): ChangeMessageVisibilityResponseBuilderOps = new ChangeMessageVisibilityResponseBuilderOps(v)

  implicit def toChangeMessageVisibilityResponseOps(
      v: ChangeMessageVisibilityResponse
  ): ChangeMessageVisibilityResponseOps = new ChangeMessageVisibilityResponseOps(v)

}
