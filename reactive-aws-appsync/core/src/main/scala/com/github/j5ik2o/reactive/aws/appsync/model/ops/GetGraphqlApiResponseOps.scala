// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetGraphqlApiResponseBuilderOps(val self: GetGraphqlApiResponse.Builder) extends AnyVal {

  final def graphqlApiAsScala(value: Option[GraphqlApi]): GetGraphqlApiResponse.Builder = {
    value.fold(self) { v =>
      self.graphqlApi(v)
    }
  }

}

final class GetGraphqlApiResponseOps(val self: GetGraphqlApiResponse) extends AnyVal {

  final def graphqlApiAsScala: Option[GraphqlApi] = Option(self.graphqlApi)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetGraphqlApiResponseOps {

  implicit def toGetGraphqlApiResponseBuilderOps(v: GetGraphqlApiResponse.Builder): GetGraphqlApiResponseBuilderOps =
    new GetGraphqlApiResponseBuilderOps(v)

  implicit def toGetGraphqlApiResponseOps(v: GetGraphqlApiResponse): GetGraphqlApiResponseOps =
    new GetGraphqlApiResponseOps(v)

}
