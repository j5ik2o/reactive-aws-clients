// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRouteAttachmentBuilderOps(val self: TransitGatewayRouteAttachment.Builder) extends AnyVal {

  final def resourceIdAsScala(value: Option[String]): TransitGatewayRouteAttachment.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayRouteAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayRouteAttachment.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

}

final class TransitGatewayRouteAttachmentOps(val self: TransitGatewayRouteAttachment) extends AnyVal {

  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayRouteAttachmentOps {

  implicit def toTransitGatewayRouteAttachmentBuilderOps(
      v: TransitGatewayRouteAttachment.Builder
  ): TransitGatewayRouteAttachmentBuilderOps = new TransitGatewayRouteAttachmentBuilderOps(v)

  implicit def toTransitGatewayRouteAttachmentOps(v: TransitGatewayRouteAttachment): TransitGatewayRouteAttachmentOps =
    new TransitGatewayRouteAttachmentOps(v)

}
