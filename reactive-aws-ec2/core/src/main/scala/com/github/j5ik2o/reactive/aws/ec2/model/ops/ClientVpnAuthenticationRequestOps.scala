// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnAuthenticationRequestBuilderOps(val self: ClientVpnAuthenticationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[ClientVpnAuthenticationType]): ClientVpnAuthenticationRequest.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeDirectoryAsScala(
      value: Option[DirectoryServiceAuthenticationRequest]
  ): ClientVpnAuthenticationRequest.Builder = {
    value.fold(self) { v => self.activeDirectory(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mutualAuthenticationAsScala(
      value: Option[CertificateAuthenticationRequest]
  ): ClientVpnAuthenticationRequest.Builder = {
    value.fold(self) { v => self.mutualAuthentication(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def federatedAuthenticationAsScala(
      value: Option[FederatedAuthenticationRequest]
  ): ClientVpnAuthenticationRequest.Builder = {
    value.fold(self) { v => self.federatedAuthentication(v) }
  }

}

final class ClientVpnAuthenticationRequestOps(val self: ClientVpnAuthenticationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[ClientVpnAuthenticationType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeDirectoryAsScala: Option[DirectoryServiceAuthenticationRequest] = Option(self.activeDirectory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mutualAuthenticationAsScala: Option[CertificateAuthenticationRequest] = Option(self.mutualAuthentication)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def federatedAuthenticationAsScala: Option[FederatedAuthenticationRequest] =
    Option(self.federatedAuthentication)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnAuthenticationRequestOps {

  implicit def toClientVpnAuthenticationRequestBuilderOps(
      v: ClientVpnAuthenticationRequest.Builder
  ): ClientVpnAuthenticationRequestBuilderOps = new ClientVpnAuthenticationRequestBuilderOps(v)

  implicit def toClientVpnAuthenticationRequestOps(
      v: ClientVpnAuthenticationRequest
  ): ClientVpnAuthenticationRequestOps = new ClientVpnAuthenticationRequestOps(v)

}
