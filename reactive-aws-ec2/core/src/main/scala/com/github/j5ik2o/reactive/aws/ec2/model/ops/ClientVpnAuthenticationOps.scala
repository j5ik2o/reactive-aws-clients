// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnAuthenticationBuilderOps(val self: ClientVpnAuthentication.Builder) extends AnyVal {

  final def typeAsScala(value: Option[ClientVpnAuthenticationType]): ClientVpnAuthentication.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def activeDirectoryAsScala(value: Option[DirectoryServiceAuthentication]): ClientVpnAuthentication.Builder = {
    value.fold(self) { v =>
      self.activeDirectory(v)
    }
  }

  final def mutualAuthenticationAsScala(value: Option[CertificateAuthentication]): ClientVpnAuthentication.Builder = {
    value.fold(self) { v =>
      self.mutualAuthentication(v)
    }
  }

}

final class ClientVpnAuthenticationOps(val self: ClientVpnAuthentication) extends AnyVal {

  final def typeAsScala: Option[ClientVpnAuthenticationType] = Option(self.`type`)

  final def activeDirectoryAsScala: Option[DirectoryServiceAuthentication] = Option(self.activeDirectory)

  final def mutualAuthenticationAsScala: Option[CertificateAuthentication] = Option(self.mutualAuthentication)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnAuthenticationOps {

  implicit def toClientVpnAuthenticationBuilderOps(
      v: ClientVpnAuthentication.Builder
  ): ClientVpnAuthenticationBuilderOps = new ClientVpnAuthenticationBuilderOps(v)

  implicit def toClientVpnAuthenticationOps(v: ClientVpnAuthentication): ClientVpnAuthenticationOps =
    new ClientVpnAuthenticationOps(v)

}
