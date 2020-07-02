// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class AdditionalAuthenticationProviderBuilderOps(val self: AdditionalAuthenticationProvider.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authenticationTypeAsScala(value: Option[AuthenticationType]): AdditionalAuthenticationProvider.Builder = {
    value.fold(self) { v => self.authenticationType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def openIDConnectConfigAsScala(value: Option[OpenIDConnectConfig]): AdditionalAuthenticationProvider.Builder = {
    value.fold(self) { v => self.openIDConnectConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolConfigAsScala(value: Option[CognitoUserPoolConfig]): AdditionalAuthenticationProvider.Builder = {
    value.fold(self) { v => self.userPoolConfig(v) }
  }

}

final class AdditionalAuthenticationProviderOps(val self: AdditionalAuthenticationProvider) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authenticationTypeAsScala: Option[AuthenticationType] = Option(self.authenticationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def openIDConnectConfigAsScala: Option[OpenIDConnectConfig] = Option(self.openIDConnectConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolConfigAsScala: Option[CognitoUserPoolConfig] = Option(self.userPoolConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdditionalAuthenticationProviderOps {

  implicit def toAdditionalAuthenticationProviderBuilderOps(
      v: AdditionalAuthenticationProvider.Builder
  ): AdditionalAuthenticationProviderBuilderOps = new AdditionalAuthenticationProviderBuilderOps(v)

  implicit def toAdditionalAuthenticationProviderOps(
      v: AdditionalAuthenticationProvider
  ): AdditionalAuthenticationProviderOps = new AdditionalAuthenticationProviderOps(v)

}
