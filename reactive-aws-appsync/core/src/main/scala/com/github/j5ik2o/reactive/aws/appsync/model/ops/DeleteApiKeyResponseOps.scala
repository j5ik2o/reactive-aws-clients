// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteApiKeyResponseBuilderOps(val self: DeleteApiKeyResponse.Builder) extends AnyVal {}

final class DeleteApiKeyResponseOps(val self: DeleteApiKeyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteApiKeyResponseOps {

  implicit def toDeleteApiKeyResponseBuilderOps(v: DeleteApiKeyResponse.Builder): DeleteApiKeyResponseBuilderOps =
    new DeleteApiKeyResponseBuilderOps(v)

  implicit def toDeleteApiKeyResponseOps(v: DeleteApiKeyResponse): DeleteApiKeyResponseOps =
    new DeleteApiKeyResponseOps(v)

}
