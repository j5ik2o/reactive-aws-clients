// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportTransitGatewayRoutesResponseBuilderOps(val self: ExportTransitGatewayRoutesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3LocationAsScala(value: Option[String]): ExportTransitGatewayRoutesResponse.Builder = {
    value.fold(self) { v => self.s3Location(v) }
  }

}

final class ExportTransitGatewayRoutesResponseOps(val self: ExportTransitGatewayRoutesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3LocationAsScala: Option[String] = Option(self.s3Location)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTransitGatewayRoutesResponseOps {

  implicit def toExportTransitGatewayRoutesResponseBuilderOps(
      v: ExportTransitGatewayRoutesResponse.Builder
  ): ExportTransitGatewayRoutesResponseBuilderOps = new ExportTransitGatewayRoutesResponseBuilderOps(v)

  implicit def toExportTransitGatewayRoutesResponseOps(
      v: ExportTransitGatewayRoutesResponse
  ): ExportTransitGatewayRoutesResponseOps = new ExportTransitGatewayRoutesResponseOps(v)

}
