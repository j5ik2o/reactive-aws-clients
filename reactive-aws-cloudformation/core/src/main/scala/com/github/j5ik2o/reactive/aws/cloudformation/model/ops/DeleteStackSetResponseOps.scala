// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackSetResponseBuilderOps(val self: DeleteStackSetResponse.Builder) extends AnyVal {}

final class DeleteStackSetResponseOps(val self: DeleteStackSetResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackSetResponseOps {

  implicit def toDeleteStackSetResponseBuilderOps(v: DeleteStackSetResponse.Builder): DeleteStackSetResponseBuilderOps =
    new DeleteStackSetResponseBuilderOps(v)

  implicit def toDeleteStackSetResponseOps(v: DeleteStackSetResponse): DeleteStackSetResponseOps =
    new DeleteStackSetResponseOps(v)

}
