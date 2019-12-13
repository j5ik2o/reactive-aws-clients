// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayPeeringAttachmentsResponseBuilderOps(
    val self: DescribeTransitGatewayPeeringAttachmentsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentsAsScala(
      value: Option[Seq[TransitGatewayPeeringAttachment]]
  ): DescribeTransitGatewayPeeringAttachmentsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.transitGatewayPeeringAttachments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayPeeringAttachmentsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewayPeeringAttachmentsResponseOps(
    val self: DescribeTransitGatewayPeeringAttachmentsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentsAsScala: Option[Seq[TransitGatewayPeeringAttachment]] =
    Option(self.transitGatewayPeeringAttachments).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayPeeringAttachmentsResponseOps {

  implicit def toDescribeTransitGatewayPeeringAttachmentsResponseBuilderOps(
      v: DescribeTransitGatewayPeeringAttachmentsResponse.Builder
  ): DescribeTransitGatewayPeeringAttachmentsResponseBuilderOps =
    new DescribeTransitGatewayPeeringAttachmentsResponseBuilderOps(v)

  implicit def toDescribeTransitGatewayPeeringAttachmentsResponseOps(
      v: DescribeTransitGatewayPeeringAttachmentsResponse
  ): DescribeTransitGatewayPeeringAttachmentsResponseOps = new DescribeTransitGatewayPeeringAttachmentsResponseOps(v)

}
