// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTransitGatewayVpcAttachmentRequestBuilderOps(
    val self: ModifyTransitGatewayVpcAttachmentRequest.Builder
) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): ModifyTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def addSubnetIdsAsScala(value: Option[Seq[String]]): ModifyTransitGatewayVpcAttachmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.addSubnetIds(v.asJava)
    }
  }

  final def removeSubnetIdsAsScala(value: Option[Seq[String]]): ModifyTransitGatewayVpcAttachmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.removeSubnetIds(v.asJava)
    }
  }

  final def optionsAsScala(
      value: Option[ModifyTransitGatewayVpcAttachmentRequestOptions]
  ): ModifyTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

}

final class ModifyTransitGatewayVpcAttachmentRequestOps(val self: ModifyTransitGatewayVpcAttachmentRequest)
    extends AnyVal {

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def addSubnetIdsAsScala: Option[Seq[String]] = Option(self.addSubnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def removeSubnetIdsAsScala: Option[Seq[String]] = Option(self.removeSubnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def optionsAsScala: Option[ModifyTransitGatewayVpcAttachmentRequestOptions] = Option(self.options)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTransitGatewayVpcAttachmentRequestOps {

  implicit def toModifyTransitGatewayVpcAttachmentRequestBuilderOps(
      v: ModifyTransitGatewayVpcAttachmentRequest.Builder
  ): ModifyTransitGatewayVpcAttachmentRequestBuilderOps = new ModifyTransitGatewayVpcAttachmentRequestBuilderOps(v)

  implicit def toModifyTransitGatewayVpcAttachmentRequestOps(
      v: ModifyTransitGatewayVpcAttachmentRequest
  ): ModifyTransitGatewayVpcAttachmentRequestOps = new ModifyTransitGatewayVpcAttachmentRequestOps(v)

}
