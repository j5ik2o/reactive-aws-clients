// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CertificateAuthenticationRequestBuilderOps(val self: CertificateAuthenticationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRootCertificateChainArnAsScala(value: Option[String]): CertificateAuthenticationRequest.Builder = {
    value.fold(self) { v => self.clientRootCertificateChainArn(v) }
  }

}

final class CertificateAuthenticationRequestOps(val self: CertificateAuthenticationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRootCertificateChainArnAsScala: Option[String] = Option(self.clientRootCertificateChainArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCertificateAuthenticationRequestOps {

  implicit def toCertificateAuthenticationRequestBuilderOps(
      v: CertificateAuthenticationRequest.Builder
  ): CertificateAuthenticationRequestBuilderOps = new CertificateAuthenticationRequestBuilderOps(v)

  implicit def toCertificateAuthenticationRequestOps(
      v: CertificateAuthenticationRequest
  ): CertificateAuthenticationRequestOps = new CertificateAuthenticationRequestOps(v)

}
