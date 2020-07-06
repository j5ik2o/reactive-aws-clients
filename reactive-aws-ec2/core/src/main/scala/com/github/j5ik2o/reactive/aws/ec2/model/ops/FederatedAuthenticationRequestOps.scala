// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FederatedAuthenticationRequestBuilderOps(val self: FederatedAuthenticationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def samlProviderArnAsScala(value: Option[String]): FederatedAuthenticationRequest.Builder = {
    value.fold(self) { v => self.samlProviderArn(v) }
  }

}

final class FederatedAuthenticationRequestOps(val self: FederatedAuthenticationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def samlProviderArnAsScala: Option[String] = Option(self.samlProviderArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFederatedAuthenticationRequestOps {

  implicit def toFederatedAuthenticationRequestBuilderOps(
      v: FederatedAuthenticationRequest.Builder
  ): FederatedAuthenticationRequestBuilderOps = new FederatedAuthenticationRequestBuilderOps(v)

  implicit def toFederatedAuthenticationRequestOps(
      v: FederatedAuthenticationRequest
  ): FederatedAuthenticationRequestOps = new FederatedAuthenticationRequestOps(v)

}
