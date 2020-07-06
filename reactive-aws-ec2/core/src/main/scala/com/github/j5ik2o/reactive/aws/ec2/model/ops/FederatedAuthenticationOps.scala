// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FederatedAuthenticationBuilderOps(val self: FederatedAuthentication.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def samlProviderArnAsScala(value: Option[String]): FederatedAuthentication.Builder = {
    value.fold(self) { v => self.samlProviderArn(v) }
  }

}

final class FederatedAuthenticationOps(val self: FederatedAuthentication) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def samlProviderArnAsScala: Option[String] = Option(self.samlProviderArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFederatedAuthenticationOps {

  implicit def toFederatedAuthenticationBuilderOps(
      v: FederatedAuthentication.Builder
  ): FederatedAuthenticationBuilderOps = new FederatedAuthenticationBuilderOps(v)

  implicit def toFederatedAuthenticationOps(v: FederatedAuthentication): FederatedAuthenticationOps =
    new FederatedAuthenticationOps(v)

}
