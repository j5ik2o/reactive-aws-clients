// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CertificateAuthenticationBuilderOps(val self: CertificateAuthentication.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientRootCertificateChainAsScala(value: Option[String]): CertificateAuthentication.Builder = {
            value.fold(self){ v => self.clientRootCertificateChain(v) }
            } 


}

final class CertificateAuthenticationOps(val self: CertificateAuthentication) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientRootCertificateChainAsScala: Option[String] = Option(self.clientRootCertificateChain) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCertificateAuthenticationOps {

implicit def toCertificateAuthenticationBuilderOps(v: CertificateAuthentication.Builder): CertificateAuthenticationBuilderOps = new CertificateAuthenticationBuilderOps(v)

implicit def toCertificateAuthenticationOps(v: CertificateAuthentication): CertificateAuthenticationOps = new CertificateAuthenticationOps(v)

}

