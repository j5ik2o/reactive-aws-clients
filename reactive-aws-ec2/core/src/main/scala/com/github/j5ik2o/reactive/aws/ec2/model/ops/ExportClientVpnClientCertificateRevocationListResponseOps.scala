// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportClientVpnClientCertificateRevocationListResponseBuilderOps(
    val self: ExportClientVpnClientCertificateRevocationListResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateRevocationListAsScala(
      value: Option[String]
  ): ExportClientVpnClientCertificateRevocationListResponse.Builder = {
    value.fold(self) { v => self.certificateRevocationList(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(
      value: Option[ClientCertificateRevocationListStatus]
  ): ExportClientVpnClientCertificateRevocationListResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class ExportClientVpnClientCertificateRevocationListResponseOps(
    val self: ExportClientVpnClientCertificateRevocationListResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateRevocationListAsScala: Option[String] = Option(self.certificateRevocationList)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ClientCertificateRevocationListStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportClientVpnClientCertificateRevocationListResponseOps {

  implicit def toExportClientVpnClientCertificateRevocationListResponseBuilderOps(
      v: ExportClientVpnClientCertificateRevocationListResponse.Builder
  ): ExportClientVpnClientCertificateRevocationListResponseBuilderOps =
    new ExportClientVpnClientCertificateRevocationListResponseBuilderOps(v)

  implicit def toExportClientVpnClientCertificateRevocationListResponseOps(
      v: ExportClientVpnClientCertificateRevocationListResponse
  ): ExportClientVpnClientCertificateRevocationListResponseOps =
    new ExportClientVpnClientCertificateRevocationListResponseOps(v)

}
