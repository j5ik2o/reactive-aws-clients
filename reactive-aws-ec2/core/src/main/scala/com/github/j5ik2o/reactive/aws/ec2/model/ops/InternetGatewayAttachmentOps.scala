// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InternetGatewayAttachmentBuilderOps(val self: InternetGatewayAttachment.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[AttachmentStatus]): InternetGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): InternetGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class InternetGatewayAttachmentOps(val self: InternetGatewayAttachment) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[AttachmentStatus] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInternetGatewayAttachmentOps {

  implicit def toInternetGatewayAttachmentBuilderOps(
      v: InternetGatewayAttachment.Builder
  ): InternetGatewayAttachmentBuilderOps = new InternetGatewayAttachmentBuilderOps(v)

  implicit def toInternetGatewayAttachmentOps(v: InternetGatewayAttachment): InternetGatewayAttachmentOps =
    new InternetGatewayAttachmentOps(v)

}
