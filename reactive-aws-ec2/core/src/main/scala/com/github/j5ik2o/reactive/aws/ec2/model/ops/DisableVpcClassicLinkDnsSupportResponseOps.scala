// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableVpcClassicLinkDnsSupportResponseBuilderOps(val self: DisableVpcClassicLinkDnsSupportResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): DisableVpcClassicLinkDnsSupportResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class DisableVpcClassicLinkDnsSupportResponseOps(val self: DisableVpcClassicLinkDnsSupportResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableVpcClassicLinkDnsSupportResponseOps {

  implicit def toDisableVpcClassicLinkDnsSupportResponseBuilderOps(
      v: DisableVpcClassicLinkDnsSupportResponse.Builder
  ): DisableVpcClassicLinkDnsSupportResponseBuilderOps = new DisableVpcClassicLinkDnsSupportResponseBuilderOps(v)

  implicit def toDisableVpcClassicLinkDnsSupportResponseOps(
      v: DisableVpcClassicLinkDnsSupportResponse
  ): DisableVpcClassicLinkDnsSupportResponseOps = new DisableVpcClassicLinkDnsSupportResponseOps(v)

}
