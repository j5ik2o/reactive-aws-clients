// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointResponseBuilderOps(val self: ModifyVpcEndpointResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ModifyVpcEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class ModifyVpcEndpointResponseOps(val self: ModifyVpcEndpointResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcEndpointResponseOps {

  implicit def toModifyVpcEndpointResponseBuilderOps(
      v: ModifyVpcEndpointResponse.Builder
  ): ModifyVpcEndpointResponseBuilderOps = new ModifyVpcEndpointResponseBuilderOps(v)

  implicit def toModifyVpcEndpointResponseOps(v: ModifyVpcEndpointResponse): ModifyVpcEndpointResponseOps =
    new ModifyVpcEndpointResponseOps(v)

}
