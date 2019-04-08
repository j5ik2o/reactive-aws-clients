// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteChangeSetResponseBuilderOps(val self: DeleteChangeSetResponse.Builder) extends AnyVal {}

final class DeleteChangeSetResponseOps(val self: DeleteChangeSetResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteChangeSetResponseOps {

  implicit def toDeleteChangeSetResponseBuilderOps(
      v: DeleteChangeSetResponse.Builder
  ): DeleteChangeSetResponseBuilderOps = new DeleteChangeSetResponseBuilderOps(v)

  implicit def toDeleteChangeSetResponseOps(v: DeleteChangeSetResponse): DeleteChangeSetResponseOps =
    new DeleteChangeSetResponseOps(v)

}
