// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteGraphqlApiResponseBuilderOps(val self: DeleteGraphqlApiResponse.Builder) extends AnyVal {}

final class DeleteGraphqlApiResponseOps(val self: DeleteGraphqlApiResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteGraphqlApiResponseOps {

  implicit def toDeleteGraphqlApiResponseBuilderOps(
      v: DeleteGraphqlApiResponse.Builder
  ): DeleteGraphqlApiResponseBuilderOps = new DeleteGraphqlApiResponseBuilderOps(v)

  implicit def toDeleteGraphqlApiResponseOps(v: DeleteGraphqlApiResponse): DeleteGraphqlApiResponseOps =
    new DeleteGraphqlApiResponseOps(v)

}
