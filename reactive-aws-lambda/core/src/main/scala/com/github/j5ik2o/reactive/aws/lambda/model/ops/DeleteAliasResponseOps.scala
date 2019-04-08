// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteAliasResponseBuilderOps(val self: DeleteAliasResponse.Builder) extends AnyVal {}

final class DeleteAliasResponseOps(val self: DeleteAliasResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAliasResponseOps {

  implicit def toDeleteAliasResponseBuilderOps(v: DeleteAliasResponse.Builder): DeleteAliasResponseBuilderOps =
    new DeleteAliasResponseBuilderOps(v)

  implicit def toDeleteAliasResponseOps(v: DeleteAliasResponse): DeleteAliasResponseOps = new DeleteAliasResponseOps(v)

}
