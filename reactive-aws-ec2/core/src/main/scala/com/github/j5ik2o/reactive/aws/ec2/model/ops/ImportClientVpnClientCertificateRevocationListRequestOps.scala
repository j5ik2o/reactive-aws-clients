// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportClientVpnClientCertificateRevocationListRequestBuilderOps(
    val self: ImportClientVpnClientCertificateRevocationListRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(
      value: Option[String]
  ): ImportClientVpnClientCertificateRevocationListRequest.Builder = {
    value.fold(self) { v => self.clientVpnEndpointId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateRevocationListAsScala(
      value: Option[String]
  ): ImportClientVpnClientCertificateRevocationListRequest.Builder = {
    value.fold(self) { v => self.certificateRevocationList(v) }
  }

}

final class ImportClientVpnClientCertificateRevocationListRequestOps(
    val self: ImportClientVpnClientCertificateRevocationListRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateRevocationListAsScala: Option[String] = Option(self.certificateRevocationList)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportClientVpnClientCertificateRevocationListRequestOps {

  implicit def toImportClientVpnClientCertificateRevocationListRequestBuilderOps(
      v: ImportClientVpnClientCertificateRevocationListRequest.Builder
  ): ImportClientVpnClientCertificateRevocationListRequestBuilderOps =
    new ImportClientVpnClientCertificateRevocationListRequestBuilderOps(v)

  implicit def toImportClientVpnClientCertificateRevocationListRequestOps(
      v: ImportClientVpnClientCertificateRevocationListRequest
  ): ImportClientVpnClientCertificateRevocationListRequestOps =
    new ImportClientVpnClientCertificateRevocationListRequestOps(v)

}
