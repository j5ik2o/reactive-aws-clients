// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetSchemaCreationStatusResponseBuilderOps(val self: GetSchemaCreationStatusResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[SchemaStatus]): GetSchemaCreationStatusResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detailsAsScala(value: Option[String]): GetSchemaCreationStatusResponse.Builder = {
    value.fold(self) { v => self.details(v) }
  }

}

final class GetSchemaCreationStatusResponseOps(val self: GetSchemaCreationStatusResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[SchemaStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detailsAsScala: Option[String] = Option(self.details)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetSchemaCreationStatusResponseOps {

  implicit def toGetSchemaCreationStatusResponseBuilderOps(
      v: GetSchemaCreationStatusResponse.Builder
  ): GetSchemaCreationStatusResponseBuilderOps = new GetSchemaCreationStatusResponseBuilderOps(v)

  implicit def toGetSchemaCreationStatusResponseOps(
      v: GetSchemaCreationStatusResponse
  ): GetSchemaCreationStatusResponseOps = new GetSchemaCreationStatusResponseOps(v)

}
