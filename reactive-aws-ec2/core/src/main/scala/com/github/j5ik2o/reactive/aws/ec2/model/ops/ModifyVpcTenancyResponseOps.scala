// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcTenancyResponseBuilderOps(val self: ModifyVpcTenancyResponse.Builder) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): ModifyVpcTenancyResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class ModifyVpcTenancyResponseOps(val self: ModifyVpcTenancyResponse) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcTenancyResponseOps {

  implicit def toModifyVpcTenancyResponseBuilderOps(
      v: ModifyVpcTenancyResponse.Builder
  ): ModifyVpcTenancyResponseBuilderOps = new ModifyVpcTenancyResponseBuilderOps(v)

  implicit def toModifyVpcTenancyResponseOps(v: ModifyVpcTenancyResponse): ModifyVpcTenancyResponseOps =
    new ModifyVpcTenancyResponseOps(v)

}
