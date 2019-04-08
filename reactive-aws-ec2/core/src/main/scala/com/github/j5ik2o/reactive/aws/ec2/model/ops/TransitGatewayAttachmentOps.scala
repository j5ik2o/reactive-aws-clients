// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayAttachmentBuilderOps(val self: TransitGatewayAttachment.Builder) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def transitGatewayIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def transitGatewayOwnerIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayOwnerId(v)
    }
  }

  final def resourceOwnerIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.resourceOwnerId(v)
    }
  }

  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def resourceIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayAttachmentState]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def associationAsScala(value: Option[TransitGatewayAttachmentAssociation]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.association(v)
    }
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): TransitGatewayAttachment.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class TransitGatewayAttachmentOps(val self: TransitGatewayAttachment) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def transitGatewayOwnerIdAsScala: Option[String] = Option(self.transitGatewayOwnerId)

  final def resourceOwnerIdAsScala: Option[String] = Option(self.resourceOwnerId)

  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  final def stateAsScala: Option[TransitGatewayAttachmentState] = Option(self.state)

  final def associationAsScala: Option[TransitGatewayAttachmentAssociation] = Option(self.association)

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayAttachmentOps {

  implicit def toTransitGatewayAttachmentBuilderOps(
      v: TransitGatewayAttachment.Builder
  ): TransitGatewayAttachmentBuilderOps = new TransitGatewayAttachmentBuilderOps(v)

  implicit def toTransitGatewayAttachmentOps(v: TransitGatewayAttachment): TransitGatewayAttachmentOps =
    new TransitGatewayAttachmentOps(v)

}
