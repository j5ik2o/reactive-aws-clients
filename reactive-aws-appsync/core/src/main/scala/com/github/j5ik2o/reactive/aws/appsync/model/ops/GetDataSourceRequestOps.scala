// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetDataSourceRequestBuilderOps(val self: GetDataSourceRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): GetDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withNameAsScala(value: Option[String]): GetDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

}

final class GetDataSourceRequestOps(val self: GetDataSourceRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDataSourceRequestOps {

  implicit def toGetDataSourceRequestBuilderOps(v: GetDataSourceRequest.Builder): GetDataSourceRequestBuilderOps =
    new GetDataSourceRequestBuilderOps(v)

  implicit def toGetDataSourceRequestOps(v: GetDataSourceRequest): GetDataSourceRequestOps =
    new GetDataSourceRequestOps(v)

}
