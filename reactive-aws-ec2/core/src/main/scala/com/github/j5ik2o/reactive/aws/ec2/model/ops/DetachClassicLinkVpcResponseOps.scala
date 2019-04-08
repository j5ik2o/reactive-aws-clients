// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DetachClassicLinkVpcResponseBuilderOps(val self: DetachClassicLinkVpcResponse.Builder) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): DetachClassicLinkVpcResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class DetachClassicLinkVpcResponseOps(val self: DetachClassicLinkVpcResponse) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetachClassicLinkVpcResponseOps {

  implicit def toDetachClassicLinkVpcResponseBuilderOps(
      v: DetachClassicLinkVpcResponse.Builder
  ): DetachClassicLinkVpcResponseBuilderOps = new DetachClassicLinkVpcResponseBuilderOps(v)

  implicit def toDetachClassicLinkVpcResponseOps(v: DetachClassicLinkVpcResponse): DetachClassicLinkVpcResponseOps =
    new DetachClassicLinkVpcResponseOps(v)

}
