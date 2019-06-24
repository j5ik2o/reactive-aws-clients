// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayVpcAttachmentRequestBuilderOps(
    val self: CreateTransitGatewayVpcAttachmentRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala(value: Option[String]): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala(value: Option[Seq[String]]): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(
      value: Option[CreateTransitGatewayVpcAttachmentRequestOptions]
  ): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(
      value: Option[Seq[TagSpecification]]
  ): CreateTransitGatewayVpcAttachmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateTransitGatewayVpcAttachmentRequestOps(val self: CreateTransitGatewayVpcAttachmentRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[CreateTransitGatewayVpcAttachmentRequestOptions] = Option(self.options)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
