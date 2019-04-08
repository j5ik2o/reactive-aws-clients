// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportClientVpnClientCertificateRevocationListResponseBuilderOps(
    val self: ImportClientVpnClientCertificateRevocationListResponse.Builder
) extends AnyVal {

  final def returnValueAsScala(
      value: Option[Boolean]
  ): ImportClientVpnClientCertificateRevocationListResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class ImportClientVpnClientCertificateRevocationListResponseOps(
    val self: ImportClientVpnClientCertificateRevocationListResponse
) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportClientVpnClientCertificateRevocationListResponseOps {

  implicit def toImportClientVpnClientCertificateRevocationListResponseBuilderOps(
      v: ImportClientVpnClientCertificateRevocationListResponse.Builder
  ): ImportClientVpnClientCertificateRevocationListResponseBuilderOps =
    new ImportClientVpnClientCertificateRevocationListResponseBuilderOps(v)

  implicit def toImportClientVpnClientCertificateRevocationListResponseOps(
      v: ImportClientVpnClientCertificateRevocationListResponse
  ): ImportClientVpnClientCertificateRevocationListResponseOps =
    new ImportClientVpnClientCertificateRevocationListResponseOps(v)

}
