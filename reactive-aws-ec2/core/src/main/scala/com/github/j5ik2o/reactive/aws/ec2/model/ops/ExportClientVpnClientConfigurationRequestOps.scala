// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportClientVpnClientConfigurationRequestBuilderOps(
    val self: ExportClientVpnClientConfigurationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): ExportClientVpnClientConfigurationRequest.Builder = {
    value.fold(self) { v => self.clientVpnEndpointId(v) }
  }

}

final class ExportClientVpnClientConfigurationRequestOps(val self: ExportClientVpnClientConfigurationRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportClientVpnClientConfigurationRequestOps {

  implicit def toExportClientVpnClientConfigurationRequestBuilderOps(
      v: ExportClientVpnClientConfigurationRequest.Builder
  ): ExportClientVpnClientConfigurationRequestBuilderOps = new ExportClientVpnClientConfigurationRequestBuilderOps(v)

  implicit def toExportClientVpnClientConfigurationRequestOps(
      v: ExportClientVpnClientConfigurationRequest
  ): ExportClientVpnClientConfigurationRequestOps = new ExportClientVpnClientConfigurationRequestOps(v)

}
