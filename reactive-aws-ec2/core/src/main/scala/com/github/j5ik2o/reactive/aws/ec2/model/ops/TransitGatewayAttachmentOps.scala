// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayAttachmentBuilderOps(val self: TransitGatewayAttachment.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayOwnerIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayOwnerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceOwnerIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.resourceOwnerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala(value: Option[String]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayAttachmentState]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala(value: Option[TransitGatewayAttachmentAssociation]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.association(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGatewayAttachment.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): TransitGatewayAttachment.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TransitGatewayAttachmentOps(val self: TransitGatewayAttachment) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayOwnerIdAsScala: Option[String] = Option(self.transitGatewayOwnerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceOwnerIdAsScala: Option[String] = Option(self.resourceOwnerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[TransitGatewayAttachmentState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala: Option[TransitGatewayAttachmentAssociation] = Option(self.association)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
