// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportClientVpnClientCertificateRevocationListRequestBuilderOps(val self: ExportClientVpnClientCertificateRevocationListRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientVpnEndpointIdAsScala(value: Option[String]): ExportClientVpnClientCertificateRevocationListRequest.Builder = {
            value.fold(self){ v => self.clientVpnEndpointId(v) }
            } 


}

final class ExportClientVpnClientCertificateRevocationListRequestOps(val self: ExportClientVpnClientCertificateRevocationListRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportClientVpnClientCertificateRevocationListRequestOps {

implicit def toExportClientVpnClientCertificateRevocationListRequestBuilderOps(v: ExportClientVpnClientCertificateRevocationListRequest.Builder): ExportClientVpnClientCertificateRevocationListRequestBuilderOps = new ExportClientVpnClientCertificateRevocationListRequestBuilderOps(v)

implicit def toExportClientVpnClientCertificateRevocationListRequestOps(v: ExportClientVpnClientCertificateRevocationListRequest): ExportClientVpnClientCertificateRevocationListRequestOps = new ExportClientVpnClientCertificateRevocationListRequestOps(v)

}

