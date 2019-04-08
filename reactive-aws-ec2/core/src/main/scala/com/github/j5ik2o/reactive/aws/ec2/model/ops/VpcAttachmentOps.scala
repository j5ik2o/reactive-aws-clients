// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcAttachmentBuilderOps(val self: VpcAttachment.Builder) extends AnyVal {

  final def stateAsScala(value: Option[AttachmentStatus]): VpcAttachment.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): VpcAttachment.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class VpcAttachmentOps(val self: VpcAttachment) extends AnyVal {

  final def stateAsScala: Option[AttachmentStatus] = Option(self.state)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcAttachmentOps {

  implicit def toVpcAttachmentBuilderOps(v: VpcAttachment.Builder): VpcAttachmentBuilderOps =
    new VpcAttachmentBuilderOps(v)

  implicit def toVpcAttachmentOps(v: VpcAttachment): VpcAttachmentOps = new VpcAttachmentOps(v)

}
