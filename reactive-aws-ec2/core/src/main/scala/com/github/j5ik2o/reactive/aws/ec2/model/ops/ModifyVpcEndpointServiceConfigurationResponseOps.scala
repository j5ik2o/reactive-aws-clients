// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointServiceConfigurationResponseBuilderOps(
    val self: ModifyVpcEndpointServiceConfigurationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ModifyVpcEndpointServiceConfigurationResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class ModifyVpcEndpointServiceConfigurationResponseOps(val self: ModifyVpcEndpointServiceConfigurationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcEndpointServiceConfigurationResponseOps {

  implicit def toModifyVpcEndpointServiceConfigurationResponseBuilderOps(
      v: ModifyVpcEndpointServiceConfigurationResponse.Builder
  ): ModifyVpcEndpointServiceConfigurationResponseBuilderOps =
    new ModifyVpcEndpointServiceConfigurationResponseBuilderOps(v)

  implicit def toModifyVpcEndpointServiceConfigurationResponseOps(
      v: ModifyVpcEndpointServiceConfigurationResponse
  ): ModifyVpcEndpointServiceConfigurationResponseOps = new ModifyVpcEndpointServiceConfigurationResponseOps(v)

}
