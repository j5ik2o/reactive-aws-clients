// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateDefaultVpcResponseBuilderOps(val self: CreateDefaultVpcResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcAsScala(value: Option[Vpc]): CreateDefaultVpcResponse.Builder = {
    value.fold(self) { v =>
      self.vpc(v)
    }
  }

}

final class CreateDefaultVpcResponseOps(val self: CreateDefaultVpcResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcAsScala: Option[Vpc] = Option(self.vpc)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateDefaultVpcResponseOps {

  implicit def toCreateDefaultVpcResponseBuilderOps(
      v: CreateDefaultVpcResponse.Builder
  ): CreateDefaultVpcResponseBuilderOps = new CreateDefaultVpcResponseBuilderOps(v)

  implicit def toCreateDefaultVpcResponseOps(v: CreateDefaultVpcResponse): CreateDefaultVpcResponseOps =
    new CreateDefaultVpcResponseOps(v)

}
