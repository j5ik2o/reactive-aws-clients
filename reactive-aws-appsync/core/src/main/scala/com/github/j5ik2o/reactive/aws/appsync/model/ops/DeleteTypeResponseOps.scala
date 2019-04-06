// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteTypeResponseBuilderOps(val self: DeleteTypeResponse.Builder) extends AnyVal {}

final class DeleteTypeResponseOps(val self: DeleteTypeResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTypeResponseOps {

  implicit def toDeleteTypeResponseBuilderOps(v: DeleteTypeResponse.Builder): DeleteTypeResponseBuilderOps =
    new DeleteTypeResponseBuilderOps(v)

  implicit def toDeleteTypeResponseOps(v: DeleteTypeResponse): DeleteTypeResponseOps = new DeleteTypeResponseOps(v)

}
