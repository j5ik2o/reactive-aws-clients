// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportTransitGatewayRoutesRequestBuilderOps(val self: ExportTransitGatewayRoutesRequest.Builder)
    extends AnyVal {

  final def transitGatewayRouteTableIdAsScala(value: Option[String]): ExportTransitGatewayRoutesRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): ExportTransitGatewayRoutesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def s3BucketAsScala(value: Option[String]): ExportTransitGatewayRoutesRequest.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  }

}

final class ExportTransitGatewayRoutesRequestOps(val self: ExportTransitGatewayRoutesRequest) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTransitGatewayRoutesRequestOps {

  implicit def toExportTransitGatewayRoutesRequestBuilderOps(
      v: ExportTransitGatewayRoutesRequest.Builder
  ): ExportTransitGatewayRoutesRequestBuilderOps = new ExportTransitGatewayRoutesRequestBuilderOps(v)

  implicit def toExportTransitGatewayRoutesRequestOps(
      v: ExportTransitGatewayRoutesRequest
  ): ExportTransitGatewayRoutesRequestOps = new ExportTransitGatewayRoutesRequestOps(v)

}
