// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcAttributeRequestBuilderOps(val self: ModifyVpcAttributeRequest.Builder) extends AnyVal {

  final def enableDnsHostnamesAsScala(value: Option[AttributeBooleanValue]): ModifyVpcAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.enableDnsHostnames(v)
    }
  }

  final def enableDnsSupportAsScala(value: Option[AttributeBooleanValue]): ModifyVpcAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.enableDnsSupport(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): ModifyVpcAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class ModifyVpcAttributeRequestOps(val self: ModifyVpcAttributeRequest) extends AnyVal {

  final def enableDnsHostnamesAsScala: Option[AttributeBooleanValue] = Option(self.enableDnsHostnames)

  final def enableDnsSupportAsScala: Option[AttributeBooleanValue] = Option(self.enableDnsSupport)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcAttributeRequestOps {

  implicit def toModifyVpcAttributeRequestBuilderOps(
      v: ModifyVpcAttributeRequest.Builder
  ): ModifyVpcAttributeRequestBuilderOps = new ModifyVpcAttributeRequestBuilderOps(v)

  implicit def toModifyVpcAttributeRequestOps(v: ModifyVpcAttributeRequest): ModifyVpcAttributeRequestOps =
    new ModifyVpcAttributeRequestOps(v)

}
