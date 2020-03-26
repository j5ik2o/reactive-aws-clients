// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StartVpcEndpointServicePrivateDnsVerificationResponseBuilderOps(
    val self: StartVpcEndpointServicePrivateDnsVerificationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(
      value: Option[Boolean]
  ): StartVpcEndpointServicePrivateDnsVerificationResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class StartVpcEndpointServicePrivateDnsVerificationResponseOps(
    val self: StartVpcEndpointServicePrivateDnsVerificationResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartVpcEndpointServicePrivateDnsVerificationResponseOps {

  implicit def toStartVpcEndpointServicePrivateDnsVerificationResponseBuilderOps(
      v: StartVpcEndpointServicePrivateDnsVerificationResponse.Builder
  ): StartVpcEndpointServicePrivateDnsVerificationResponseBuilderOps =
    new StartVpcEndpointServicePrivateDnsVerificationResponseBuilderOps(v)

  implicit def toStartVpcEndpointServicePrivateDnsVerificationResponseOps(
      v: StartVpcEndpointServicePrivateDnsVerificationResponse
  ): StartVpcEndpointServicePrivateDnsVerificationResponseOps =
    new StartVpcEndpointServicePrivateDnsVerificationResponseOps(v)

}
