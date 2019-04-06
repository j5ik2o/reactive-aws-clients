// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteGraphqlApiRequestBuilderOps(val self: DeleteGraphqlApiRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): DeleteGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

}

final class DeleteGraphqlApiRequestOps(val self: DeleteGraphqlApiRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteGraphqlApiRequestOps {

  implicit def toDeleteGraphqlApiRequestBuilderOps(
      v: DeleteGraphqlApiRequest.Builder
  ): DeleteGraphqlApiRequestBuilderOps = new DeleteGraphqlApiRequestBuilderOps(v)

  implicit def toDeleteGraphqlApiRequestOps(v: DeleteGraphqlApiRequest): DeleteGraphqlApiRequestOps =
    new DeleteGraphqlApiRequestOps(v)

}
