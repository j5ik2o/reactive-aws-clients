// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateGraphqlApiResponseBuilderOps(val self: UpdateGraphqlApiResponse.Builder) extends AnyVal {

  final def graphqlApiAsScala(value: Option[GraphqlApi]): UpdateGraphqlApiResponse.Builder = {
    value.fold(self) { v =>
      self.graphqlApi(v)
    }
  } // GraphqlApi

}

final class UpdateGraphqlApiResponseOps(val self: UpdateGraphqlApiResponse) extends AnyVal {

  final def graphqlApiAsScala: Option[GraphqlApi] = Option(self.graphqlApi) // GraphqlApi

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateGraphqlApiResponseOps {

  implicit def toUpdateGraphqlApiResponseBuilderOps(
      v: UpdateGraphqlApiResponse.Builder
  ): UpdateGraphqlApiResponseBuilderOps = new UpdateGraphqlApiResponseBuilderOps(v)

  implicit def toUpdateGraphqlApiResponseOps(v: UpdateGraphqlApiResponse): UpdateGraphqlApiResponseOps =
    new UpdateGraphqlApiResponseOps(v)

}
