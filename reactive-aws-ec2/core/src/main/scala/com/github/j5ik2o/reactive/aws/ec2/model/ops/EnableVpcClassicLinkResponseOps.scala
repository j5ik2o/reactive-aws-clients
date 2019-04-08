// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableVpcClassicLinkResponseBuilderOps(val self: EnableVpcClassicLinkResponse.Builder) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): EnableVpcClassicLinkResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class EnableVpcClassicLinkResponseOps(val self: EnableVpcClassicLinkResponse) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableVpcClassicLinkResponseOps {

  implicit def toEnableVpcClassicLinkResponseBuilderOps(
      v: EnableVpcClassicLinkResponse.Builder
  ): EnableVpcClassicLinkResponseBuilderOps = new EnableVpcClassicLinkResponseBuilderOps(v)

  implicit def toEnableVpcClassicLinkResponseOps(v: EnableVpcClassicLinkResponse): EnableVpcClassicLinkResponseOps =
    new EnableVpcClassicLinkResponseOps(v)

}
