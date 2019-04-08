// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayAttachmentPropagationsRequestBuilderOps(
    val self: GetTransitGatewayAttachmentPropagationsRequest.Builder
) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): GetTransitGatewayAttachmentPropagationsRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): GetTransitGatewayAttachmentPropagationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): GetTransitGatewayAttachmentPropagationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetTransitGatewayAttachmentPropagationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetTransitGatewayAttachmentPropagationsRequestOps(val self: GetTransitGatewayAttachmentPropagationsRequest)
    extends AnyVal {

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayAttachmentPropagationsRequestOps {

  implicit def toGetTransitGatewayAttachmentPropagationsRequestBuilderOps(
      v: GetTransitGatewayAttachmentPropagationsRequest.Builder
  ): GetTransitGatewayAttachmentPropagationsRequestBuilderOps =
    new GetTransitGatewayAttachmentPropagationsRequestBuilderOps(v)

  implicit def toGetTransitGatewayAttachmentPropagationsRequestOps(
      v: GetTransitGatewayAttachmentPropagationsRequest
  ): GetTransitGatewayAttachmentPropagationsRequestOps = new GetTransitGatewayAttachmentPropagationsRequestOps(v)

}
