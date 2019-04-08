// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteResolverResponseBuilderOps(val self: DeleteResolverResponse.Builder) extends AnyVal {}

final class DeleteResolverResponseOps(val self: DeleteResolverResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteResolverResponseOps {

  implicit def toDeleteResolverResponseBuilderOps(v: DeleteResolverResponse.Builder): DeleteResolverResponseBuilderOps =
    new DeleteResolverResponseBuilderOps(v)

  implicit def toDeleteResolverResponseOps(v: DeleteResolverResponse): DeleteResolverResponseOps =
    new DeleteResolverResponseOps(v)

}
