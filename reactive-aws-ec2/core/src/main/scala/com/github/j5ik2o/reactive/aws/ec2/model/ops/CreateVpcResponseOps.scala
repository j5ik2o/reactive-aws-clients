// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcResponseBuilderOps(val self: CreateVpcResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcAsScala(value: Option[Vpc]): CreateVpcResponse.Builder = {
    value.fold(self) { v => self.vpc(v) }
  }

}

final class CreateVpcResponseOps(val self: CreateVpcResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcAsScala: Option[Vpc] = Option(self.vpc)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcResponseOps {

  implicit def toCreateVpcResponseBuilderOps(v: CreateVpcResponse.Builder): CreateVpcResponseBuilderOps =
    new CreateVpcResponseBuilderOps(v)

  implicit def toCreateVpcResponseOps(v: CreateVpcResponse): CreateVpcResponseOps = new CreateVpcResponseOps(v)

}
