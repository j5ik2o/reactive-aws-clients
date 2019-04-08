// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayVpcAttachmentBuilderOps(val self: TransitGatewayVpcAttachment.Builder) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayVpcAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def transitGatewayIdAsScala(value: Option[String]): TransitGatewayVpcAttachment.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): TransitGatewayVpcAttachment.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def vpcOwnerIdAsScala(value: Option[String]): TransitGatewayVpcAttachment.Builder = {
    value.fold(self) { v =>
      self.vpcOwnerId(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayAttachmentState]): TransitGatewayVpcAttachment.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def subnetIdsAsScala(value: Option[Seq[String]]): TransitGatewayVpcAttachment.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    }
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGatewayVpcAttachment.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def optionsAsScala(value: Option[TransitGatewayVpcAttachmentOptions]): TransitGatewayVpcAttachment.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): TransitGatewayVpcAttachment.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class TransitGatewayVpcAttachmentOps(val self: TransitGatewayVpcAttachment) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def vpcOwnerIdAsScala: Option[String] = Option(self.vpcOwnerId)

  final def stateAsScala: Option[TransitGatewayAttachmentState] = Option(self.state)

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  final def optionsAsScala: Option[TransitGatewayVpcAttachmentOptions] = Option(self.options)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayVpcAttachmentOps {

  implicit def toTransitGatewayVpcAttachmentBuilderOps(
      v: TransitGatewayVpcAttachment.Builder
  ): TransitGatewayVpcAttachmentBuilderOps = new TransitGatewayVpcAttachmentBuilderOps(v)

  implicit def toTransitGatewayVpcAttachmentOps(v: TransitGatewayVpcAttachment): TransitGatewayVpcAttachmentOps =
    new TransitGatewayVpcAttachmentOps(v)

}
