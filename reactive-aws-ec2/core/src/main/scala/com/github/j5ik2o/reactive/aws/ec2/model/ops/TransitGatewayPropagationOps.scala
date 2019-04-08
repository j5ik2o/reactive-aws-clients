// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayPropagationBuilderOps(val self: TransitGatewayPropagation.Builder) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayPropagation.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def resourceIdAsScala(value: Option[String]): TransitGatewayPropagation.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayPropagation.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def transitGatewayRouteTableIdAsScala(value: Option[String]): TransitGatewayPropagation.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayPropagationState]): TransitGatewayPropagation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class TransitGatewayPropagationOps(val self: TransitGatewayPropagation) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def stateAsScala: Option[TransitGatewayPropagationState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayPropagationOps {

  implicit def toTransitGatewayPropagationBuilderOps(
      v: TransitGatewayPropagation.Builder
  ): TransitGatewayPropagationBuilderOps = new TransitGatewayPropagationBuilderOps(v)

  implicit def toTransitGatewayPropagationOps(v: TransitGatewayPropagation): TransitGatewayPropagationOps =
    new TransitGatewayPropagationOps(v)

}
