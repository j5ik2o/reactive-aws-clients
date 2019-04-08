// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnAuthenticationRequestBuilderOps(val self: ClientVpnAuthenticationRequest.Builder) extends AnyVal {

  final def typeAsScala(value: Option[ClientVpnAuthenticationType]): ClientVpnAuthenticationRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def activeDirectoryAsScala(
      value: Option[DirectoryServiceAuthenticationRequest]
  ): ClientVpnAuthenticationRequest.Builder = {
    value.fold(self) { v =>
      self.activeDirectory(v)
    }
  }

  final def mutualAuthenticationAsScala(
      value: Option[CertificateAuthenticationRequest]
  ): ClientVpnAuthenticationRequest.Builder = {
    value.fold(self) { v =>
      self.mutualAuthentication(v)
    }
  }

}

final class ClientVpnAuthenticationRequestOps(val self: ClientVpnAuthenticationRequest) extends AnyVal {

  final def typeAsScala: Option[ClientVpnAuthenticationType] = Option(self.`type`)

  final def activeDirectoryAsScala: Option[DirectoryServiceAuthenticationRequest] = Option(self.activeDirectory)

  final def mutualAuthenticationAsScala: Option[CertificateAuthenticationRequest] = Option(self.mutualAuthentication)

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
