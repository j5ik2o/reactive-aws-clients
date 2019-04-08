// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcTenancyRequestBuilderOps(val self: ModifyVpcTenancyRequest.Builder) extends AnyVal {

  final def vpcIdAsScala(value: Option[String]): ModifyVpcTenancyRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def instanceTenancyAsScala(value: Option[VpcTenancy]): ModifyVpcTenancyRequest.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

}

final class ModifyVpcTenancyRequestOps(val self: ModifyVpcTenancyRequest) extends AnyVal {

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def instanceTenancyAsScala: Option[VpcTenancy] = Option(self.instanceTenancy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcTenancyRequestOps {

  implicit def toModifyVpcTenancyRequestBuilderOps(
      v: ModifyVpcTenancyRequest.Builder
  ): ModifyVpcTenancyRequestBuilderOps = new ModifyVpcTenancyRequestBuilderOps(v)

  implicit def toModifyVpcTenancyRequestOps(v: ModifyVpcTenancyRequest): ModifyVpcTenancyRequestOps =
    new ModifyVpcTenancyRequestOps(v)

}
