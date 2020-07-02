// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcEndpointServiceConfigurationResponseBuilderOps(
    val self: CreateVpcEndpointServiceConfigurationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceConfigurationAsScala(
      value: Option[ServiceConfiguration]
  ): CreateVpcEndpointServiceConfigurationResponse.Builder = {
    value.fold(self) { v => self.serviceConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateVpcEndpointServiceConfigurationResponse.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

}

final class CreateVpcEndpointServiceConfigurationResponseOps(val self: CreateVpcEndpointServiceConfigurationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceConfigurationAsScala: Option[ServiceConfiguration] = Option(self.serviceConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcEndpointServiceConfigurationResponseOps {

  implicit def toCreateVpcEndpointServiceConfigurationResponseBuilderOps(
      v: CreateVpcEndpointServiceConfigurationResponse.Builder
  ): CreateVpcEndpointServiceConfigurationResponseBuilderOps =
    new CreateVpcEndpointServiceConfigurationResponseBuilderOps(v)

  implicit def toCreateVpcEndpointServiceConfigurationResponseOps(
      v: CreateVpcEndpointServiceConfigurationResponse
  ): CreateVpcEndpointServiceConfigurationResponseOps = new CreateVpcEndpointServiceConfigurationResponseOps(v)

}
