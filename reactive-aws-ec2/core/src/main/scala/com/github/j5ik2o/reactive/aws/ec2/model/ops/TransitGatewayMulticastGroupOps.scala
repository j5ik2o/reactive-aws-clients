// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayMulticastGroupBuilderOps(val self: TransitGatewayMulticastGroup.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala(value: Option[String]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.groupIpAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala(value: Option[String]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupMemberAsScala(value: Option[Boolean]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.groupMember(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupSourceAsScala(value: Option[Boolean]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.groupSource(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memberTypeAsScala(value: Option[MembershipType]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.memberType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTypeAsScala(value: Option[MembershipType]): TransitGatewayMulticastGroup.Builder = {
    value.fold(self) { v =>
      self.sourceType(v)
    }
  }

}

final class TransitGatewayMulticastGroupOps(val self: TransitGatewayMulticastGroup) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala: Option[String] = Option(self.groupIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupMemberAsScala: Option[Boolean] = Option(self.groupMember)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupSourceAsScala: Option[Boolean] = Option(self.groupSource)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memberTypeAsScala: Option[MembershipType] = Option(self.memberType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTypeAsScala: Option[MembershipType] = Option(self.sourceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayMulticastGroupOps {

  implicit def toTransitGatewayMulticastGroupBuilderOps(
      v: TransitGatewayMulticastGroup.Builder
  ): TransitGatewayMulticastGroupBuilderOps = new TransitGatewayMulticastGroupBuilderOps(v)

  implicit def toTransitGatewayMulticastGroupOps(v: TransitGatewayMulticastGroup): TransitGatewayMulticastGroupOps =
    new TransitGatewayMulticastGroupOps(v)

}
