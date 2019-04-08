// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayVpcAttachmentRequestBuilderOps(
    val self: CreateTransitGatewayVpcAttachmentRequest.Builder
) extends AnyVal {

  final def transitGatewayIdAsScala(value: Option[String]): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def subnetIdsAsScala(value: Option[Seq[String]]): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    }
  }

  final def optionsAsScala(
      value: Option[CreateTransitGatewayVpcAttachmentRequestOptions]
  ): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  final def tagSpecificationsAsScala(
      value: Option[Seq[TagSpecification]]
  ): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateTransitGatewayVpcAttachmentRequestOps(val self: CreateTransitGatewayVpcAttachmentRequest)
    extends AnyVal {

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def optionsAsScala: Option[CreateTransitGatewayVpcAttachmentRequestOptions] = Option(self.options)

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayVpcAttachmentRequestOps {

  implicit def toCreateTransitGatewayVpcAttachmentRequestBuilderOps(
      v: CreateTransitGatewayVpcAttachmentRequest.Builder
  ): CreateTransitGatewayVpcAttachmentRequestBuilderOps = new CreateTransitGatewayVpcAttachmentRequestBuilderOps(v)

  implicit def toCreateTransitGatewayVpcAttachmentRequestOps(
      v: CreateTransitGatewayVpcAttachmentRequest
  ): CreateTransitGatewayVpcAttachmentRequestOps = new CreateTransitGatewayVpcAttachmentRequestOps(v)

}
