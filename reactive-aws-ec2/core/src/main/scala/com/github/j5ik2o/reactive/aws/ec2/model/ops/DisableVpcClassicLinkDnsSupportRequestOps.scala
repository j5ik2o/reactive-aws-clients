// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableVpcClassicLinkDnsSupportRequestBuilderOps(val self: DisableVpcClassicLinkDnsSupportRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): DisableVpcClassicLinkDnsSupportRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class DisableVpcClassicLinkDnsSupportRequestOps(val self: DisableVpcClassicLinkDnsSupportRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableVpcClassicLinkDnsSupportRequestOps {

  implicit def toDisableVpcClassicLinkDnsSupportRequestBuilderOps(
      v: DisableVpcClassicLinkDnsSupportRequest.Builder
  ): DisableVpcClassicLinkDnsSupportRequestBuilderOps = new DisableVpcClassicLinkDnsSupportRequestBuilderOps(v)

  implicit def toDisableVpcClassicLinkDnsSupportRequestOps(
      v: DisableVpcClassicLinkDnsSupportRequest
  ): DisableVpcClassicLinkDnsSupportRequestOps = new DisableVpcClassicLinkDnsSupportRequestOps(v)

}
