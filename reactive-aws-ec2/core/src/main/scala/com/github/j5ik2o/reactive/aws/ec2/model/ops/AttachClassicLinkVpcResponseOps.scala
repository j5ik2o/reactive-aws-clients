// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachClassicLinkVpcResponseBuilderOps(val self: AttachClassicLinkVpcResponse.Builder) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): AttachClassicLinkVpcResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class AttachClassicLinkVpcResponseOps(val self: AttachClassicLinkVpcResponse) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachClassicLinkVpcResponseOps {

  implicit def toAttachClassicLinkVpcResponseBuilderOps(
      v: AttachClassicLinkVpcResponse.Builder
  ): AttachClassicLinkVpcResponseBuilderOps = new AttachClassicLinkVpcResponseBuilderOps(v)

  implicit def toAttachClassicLinkVpcResponseOps(v: AttachClassicLinkVpcResponse): AttachClassicLinkVpcResponseOps =
    new AttachClassicLinkVpcResponseOps(v)

}
