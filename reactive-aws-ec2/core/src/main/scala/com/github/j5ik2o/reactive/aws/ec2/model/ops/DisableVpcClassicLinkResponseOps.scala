// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableVpcClassicLinkResponseBuilderOps(val self: DisableVpcClassicLinkResponse.Builder) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): DisableVpcClassicLinkResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class DisableVpcClassicLinkResponseOps(val self: DisableVpcClassicLinkResponse) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableVpcClassicLinkResponseOps {

  implicit def toDisableVpcClassicLinkResponseBuilderOps(
      v: DisableVpcClassicLinkResponse.Builder
  ): DisableVpcClassicLinkResponseBuilderOps = new DisableVpcClassicLinkResponseBuilderOps(v)

  implicit def toDisableVpcClassicLinkResponseOps(v: DisableVpcClassicLinkResponse): DisableVpcClassicLinkResponseOps =
    new DisableVpcClassicLinkResponseOps(v)

}
