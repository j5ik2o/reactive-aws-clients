// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetGraphqlApiRequestBuilderOps(val self: GetGraphqlApiRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): GetGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

}

final class GetGraphqlApiRequestOps(val self: GetGraphqlApiRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetGraphqlApiRequestOps {

  implicit def toGetGraphqlApiRequestBuilderOps(v: GetGraphqlApiRequest.Builder): GetGraphqlApiRequestBuilderOps =
    new GetGraphqlApiRequestBuilderOps(v)

  implicit def toGetGraphqlApiRequestOps(v: GetGraphqlApiRequest): GetGraphqlApiRequestOps =
    new GetGraphqlApiRequestOps(v)

}
