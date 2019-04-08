// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackResponseBuilderOps(val self: DeleteStackResponse.Builder) extends AnyVal {}

final class DeleteStackResponseOps(val self: DeleteStackResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackResponseOps {

  implicit def toDeleteStackResponseBuilderOps(v: DeleteStackResponse.Builder): DeleteStackResponseBuilderOps =
    new DeleteStackResponseBuilderOps(v)

  implicit def toDeleteStackResponseOps(v: DeleteStackResponse): DeleteStackResponseOps = new DeleteStackResponseOps(v)

}
