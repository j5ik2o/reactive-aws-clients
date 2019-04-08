// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcEndpointResponseBuilderOps(val self: CreateVpcEndpointResponse.Builder) extends AnyVal {

  final def vpcEndpointAsScala(value: Option[VpcEndpoint]): CreateVpcEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.vpcEndpoint(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): CreateVpcEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

}

final class CreateVpcEndpointResponseOps(val self: CreateVpcEndpointResponse) extends AnyVal {

  final def vpcEndpointAsScala: Option[VpcEndpoint] = Option(self.vpcEndpoint)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcEndpointResponseOps {

  implicit def toCreateVpcEndpointResponseBuilderOps(
      v: CreateVpcEndpointResponse.Builder
  ): CreateVpcEndpointResponseBuilderOps = new CreateVpcEndpointResponseBuilderOps(v)

  implicit def toCreateVpcEndpointResponseOps(v: CreateVpcEndpointResponse): CreateVpcEndpointResponseOps =
    new CreateVpcEndpointResponseOps(v)

}
