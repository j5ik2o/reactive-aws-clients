// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SetQueueAttributesResponseBuilderOps(val self: SetQueueAttributesResponse.Builder) extends AnyVal {}

final class SetQueueAttributesResponseOps(val self: SetQueueAttributesResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetQueueAttributesResponseOps {

  implicit def toSetQueueAttributesResponseBuilderOps(
      v: SetQueueAttributesResponse.Builder
  ): SetQueueAttributesResponseBuilderOps = new SetQueueAttributesResponseBuilderOps(v)

  implicit def toSetQueueAttributesResponseOps(v: SetQueueAttributesResponse): SetQueueAttributesResponseOps =
    new SetQueueAttributesResponseOps(v)

}
