// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportClientVpnClientConfigurationResponseBuilderOps(
    val self: ExportClientVpnClientConfigurationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientConfigurationAsScala(value: Option[String]): ExportClientVpnClientConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.clientConfiguration(v)
    }
  }

}

final class ExportClientVpnClientConfigurationResponseOps(val self: ExportClientVpnClientConfigurationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientConfigurationAsScala: Option[String] = Option(self.clientConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportClientVpnClientConfigurationResponseOps {

  implicit def toExportClientVpnClientConfigurationResponseBuilderOps(
      v: ExportClientVpnClientConfigurationResponse.Builder
  ): ExportClientVpnClientConfigurationResponseBuilderOps = new ExportClientVpnClientConfigurationResponseBuilderOps(v)

  implicit def toExportClientVpnClientConfigurationResponseOps(
      v: ExportClientVpnClientConfigurationResponse
  ): ExportClientVpnClientConfigurationResponseOps = new ExportClientVpnClientConfigurationResponseOps(v)

}
