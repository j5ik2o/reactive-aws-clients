// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteGraphqlApiRequestBuilderOps(val self: DeleteGraphqlApiRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): DeleteGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

}

final class DeleteGraphqlApiRequestOps(val self: DeleteGraphqlApiRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteGraphqlApiRequestOps {

  implicit def toDeleteGraphqlApiRequestBuilderOps(
      v: DeleteGraphqlApiRequest.Builder
  ): DeleteGraphqlApiRequestBuilderOps = new DeleteGraphqlApiRequestBuilderOps(v)

  implicit def toDeleteGraphqlApiRequestOps(v: DeleteGraphqlApiRequest): DeleteGraphqlApiRequestOps =
    new DeleteGraphqlApiRequestOps(v)

}
