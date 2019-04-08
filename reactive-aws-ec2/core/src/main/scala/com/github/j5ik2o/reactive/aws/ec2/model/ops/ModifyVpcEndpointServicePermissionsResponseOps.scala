// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointServicePermissionsResponseBuilderOps(
    val self: ModifyVpcEndpointServicePermissionsResponse.Builder
) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): ModifyVpcEndpointServicePermissionsResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class ModifyVpcEndpointServicePermissionsResponseOps(val self: ModifyVpcEndpointServicePermissionsResponse)
    extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcEndpointServicePermissionsResponseOps {

  implicit def toModifyVpcEndpointServicePermissionsResponseBuilderOps(
      v: ModifyVpcEndpointServicePermissionsResponse.Builder
  ): ModifyVpcEndpointServicePermissionsResponseBuilderOps =
    new ModifyVpcEndpointServicePermissionsResponseBuilderOps(v)

  implicit def toModifyVpcEndpointServicePermissionsResponseOps(
      v: ModifyVpcEndpointServicePermissionsResponse
  ): ModifyVpcEndpointServicePermissionsResponseOps = new ModifyVpcEndpointServicePermissionsResponseOps(v)

}
