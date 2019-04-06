// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateGraphqlApiResponseBuilderOps(val self: CreateGraphqlApiResponse.Builder) extends AnyVal {

  final def withGraphqlApiAsScala(value: Option[GraphqlApi]): CreateGraphqlApiResponse.Builder = {
    value.fold(self) { v =>
      self.graphqlApi(v)
    }
  } // GraphqlApi

}

final class CreateGraphqlApiResponseOps(val self: CreateGraphqlApiResponse) extends AnyVal {

  final def graphqlApiAsScala: Option[GraphqlApi] = Option(self.graphqlApi) // GraphqlApi

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGraphqlApiResponseOps {

  implicit def toCreateGraphqlApiResponseBuilderOps(
      v: CreateGraphqlApiResponse.Builder
  ): CreateGraphqlApiResponseBuilderOps = new CreateGraphqlApiResponseBuilderOps(v)

  implicit def toCreateGraphqlApiResponseOps(v: CreateGraphqlApiResponse): CreateGraphqlApiResponseOps =
    new CreateGraphqlApiResponseOps(v)

}
