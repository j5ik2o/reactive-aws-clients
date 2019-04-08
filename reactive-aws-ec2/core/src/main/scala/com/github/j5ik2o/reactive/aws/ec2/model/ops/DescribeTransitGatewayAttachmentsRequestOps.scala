// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayAttachmentsRequestBuilderOps(
    val self: DescribeTransitGatewayAttachmentsRequest.Builder
) extends AnyVal {

  final def transitGatewayAttachmentIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeTransitGatewayAttachmentsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.transitGatewayAttachmentIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTransitGatewayAttachmentsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeTransitGatewayAttachmentsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayAttachmentsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewayAttachmentsRequestOps(val self: DescribeTransitGatewayAttachmentsRequest)
    extends AnyVal {

  final def transitGatewayAttachmentIdsAsScala: Option[Seq[String]] = Option(self.transitGatewayAttachmentIds).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayAttachmentsRequestOps {

  implicit def toDescribeTransitGatewayAttachmentsRequestBuilderOps(
      v: DescribeTransitGatewayAttachmentsRequest.Builder
  ): DescribeTransitGatewayAttachmentsRequestBuilderOps = new DescribeTransitGatewayAttachmentsRequestBuilderOps(v)

  implicit def toDescribeTransitGatewayAttachmentsRequestOps(
      v: DescribeTransitGatewayAttachmentsRequest
  ): DescribeTransitGatewayAttachmentsRequestOps = new DescribeTransitGatewayAttachmentsRequestOps(v)

}
