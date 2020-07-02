// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableVpcClassicLinkRequestBuilderOps(val self: EnableVpcClassicLinkRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): EnableVpcClassicLinkRequest.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

}

final class EnableVpcClassicLinkRequestOps(val self: EnableVpcClassicLinkRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableVpcClassicLinkRequestOps {

  implicit def toEnableVpcClassicLinkRequestBuilderOps(
      v: EnableVpcClassicLinkRequest.Builder
  ): EnableVpcClassicLinkRequestBuilderOps = new EnableVpcClassicLinkRequestBuilderOps(v)

  implicit def toEnableVpcClassicLinkRequestOps(v: EnableVpcClassicLinkRequest): EnableVpcClassicLinkRequestOps =
    new EnableVpcClassicLinkRequestOps(v)

}
