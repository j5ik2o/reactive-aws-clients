// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateGraphqlApiResponseBuilderOps(val self: CreateGraphqlApiResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def graphqlApiAsScala(value: Option[GraphqlApi]): CreateGraphqlApiResponse.Builder = {
    value.fold(self) { v =>
      self.graphqlApi(v)
    }
  }

}

final class CreateGraphqlApiResponseOps(val self: CreateGraphqlApiResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def graphqlApiAsScala: Option[GraphqlApi] = Option(self.graphqlApi)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGraphqlApiResponseOps {

  implicit def toCreateGraphqlApiResponseBuilderOps(
      v: CreateGraphqlApiResponse.Builder
  ): CreateGraphqlApiResponseBuilderOps = new CreateGraphqlApiResponseBuilderOps(v)

  implicit def toCreateGraphqlApiResponseOps(v: CreateGraphqlApiResponse): CreateGraphqlApiResponseOps =
    new CreateGraphqlApiResponseOps(v)

}
