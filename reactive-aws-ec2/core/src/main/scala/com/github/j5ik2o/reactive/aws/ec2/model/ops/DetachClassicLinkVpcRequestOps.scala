// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DetachClassicLinkVpcRequestBuilderOps(val self: DetachClassicLinkVpcRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): DetachClassicLinkVpcRequest.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): DetachClassicLinkVpcRequest.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

}

final class DetachClassicLinkVpcRequestOps(val self: DetachClassicLinkVpcRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetachClassicLinkVpcRequestOps {

  implicit def toDetachClassicLinkVpcRequestBuilderOps(
      v: DetachClassicLinkVpcRequest.Builder
  ): DetachClassicLinkVpcRequestBuilderOps = new DetachClassicLinkVpcRequestBuilderOps(v)

  implicit def toDetachClassicLinkVpcRequestOps(v: DetachClassicLinkVpcRequest): DetachClassicLinkVpcRequestOps =
    new DetachClassicLinkVpcRequestOps(v)

}
