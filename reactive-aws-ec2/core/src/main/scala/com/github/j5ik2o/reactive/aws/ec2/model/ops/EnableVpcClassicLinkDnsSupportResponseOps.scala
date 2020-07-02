// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableVpcClassicLinkDnsSupportResponseBuilderOps(val self: EnableVpcClassicLinkDnsSupportResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): EnableVpcClassicLinkDnsSupportResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class EnableVpcClassicLinkDnsSupportResponseOps(val self: EnableVpcClassicLinkDnsSupportResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableVpcClassicLinkDnsSupportResponseOps {

  implicit def toEnableVpcClassicLinkDnsSupportResponseBuilderOps(
      v: EnableVpcClassicLinkDnsSupportResponse.Builder
  ): EnableVpcClassicLinkDnsSupportResponseBuilderOps = new EnableVpcClassicLinkDnsSupportResponseBuilderOps(v)

  implicit def toEnableVpcClassicLinkDnsSupportResponseOps(
      v: EnableVpcClassicLinkDnsSupportResponse
  ): EnableVpcClassicLinkDnsSupportResponseOps = new EnableVpcClassicLinkDnsSupportResponseOps(v)

}
