// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetSchemaCreationStatusRequestBuilderOps(val self: GetSchemaCreationStatusRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): GetSchemaCreationStatusRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

}

final class GetSchemaCreationStatusRequestOps(val self: GetSchemaCreationStatusRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetSchemaCreationStatusRequestOps {

  implicit def toGetSchemaCreationStatusRequestBuilderOps(
      v: GetSchemaCreationStatusRequest.Builder
  ): GetSchemaCreationStatusRequestBuilderOps = new GetSchemaCreationStatusRequestBuilderOps(v)

  implicit def toGetSchemaCreationStatusRequestOps(
      v: GetSchemaCreationStatusRequest
  ): GetSchemaCreationStatusRequestOps = new GetSchemaCreationStatusRequestOps(v)

}
