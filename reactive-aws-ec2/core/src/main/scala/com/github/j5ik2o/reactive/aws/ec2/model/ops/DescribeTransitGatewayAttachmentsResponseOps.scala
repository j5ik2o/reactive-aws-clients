// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayAttachmentsResponseBuilderOps(
    val self: DescribeTransitGatewayAttachmentsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentsAsScala(
      value: Option[Seq[TransitGatewayAttachment]]
  ): DescribeTransitGatewayAttachmentsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGatewayAttachments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayAttachmentsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewayAttachmentsResponseOps(val self: DescribeTransitGatewayAttachmentsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentsAsScala: Option[Seq[TransitGatewayAttachment]] =
    Option(self.transitGatewayAttachments).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayAttachmentsResponseOps {

  implicit def toDescribeTransitGatewayAttachmentsResponseBuilderOps(
      v: DescribeTransitGatewayAttachmentsResponse.Builder
  ): DescribeTransitGatewayAttachmentsResponseBuilderOps = new DescribeTransitGatewayAttachmentsResponseBuilderOps(v)

  implicit def toDescribeTransitGatewayAttachmentsResponseOps(
      v: DescribeTransitGatewayAttachmentsResponse
  ): DescribeTransitGatewayAttachmentsResponseOps = new DescribeTransitGatewayAttachmentsResponseOps(v)

}
