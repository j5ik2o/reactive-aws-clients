// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableVpcClassicLinkDnsSupportRequestBuilderOps(val self: EnableVpcClassicLinkDnsSupportRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): EnableVpcClassicLinkDnsSupportRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class EnableVpcClassicLinkDnsSupportRequestOps(val self: EnableVpcClassicLinkDnsSupportRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableVpcClassicLinkDnsSupportRequestOps {

  implicit def toEnableVpcClassicLinkDnsSupportRequestBuilderOps(
      v: EnableVpcClassicLinkDnsSupportRequest.Builder
  ): EnableVpcClassicLinkDnsSupportRequestBuilderOps = new EnableVpcClassicLinkDnsSupportRequestBuilderOps(v)

  implicit def toEnableVpcClassicLinkDnsSupportRequestOps(
      v: EnableVpcClassicLinkDnsSupportRequest
  ): EnableVpcClassicLinkDnsSupportRequestOps = new EnableVpcClassicLinkDnsSupportRequestOps(v)

}
