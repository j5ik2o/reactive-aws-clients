// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotFleetRequestsRequestBuilderOps(val self: DescribeSpotFleetRequestsRequest.Builder)
    extends AnyVal {

  final def maxResultsAsScala(value: Option[Int]): DescribeSpotFleetRequestsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSpotFleetRequestsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def spotFleetRequestIdsAsScala(value: Option[Seq[String]]): DescribeSpotFleetRequestsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.spotFleetRequestIds(v.asJava)
    }
  }

}

final class DescribeSpotFleetRequestsRequestOps(val self: DescribeSpotFleetRequestsRequest) extends AnyVal {

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def spotFleetRequestIdsAsScala: Option[Seq[String]] = Option(self.spotFleetRequestIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotFleetRequestsRequestOps {

  implicit def toDescribeSpotFleetRequestsRequestBuilderOps(
      v: DescribeSpotFleetRequestsRequest.Builder
  ): DescribeSpotFleetRequestsRequestBuilderOps = new DescribeSpotFleetRequestsRequestBuilderOps(v)

  implicit def toDescribeSpotFleetRequestsRequestOps(
      v: DescribeSpotFleetRequestsRequest
  ): DescribeSpotFleetRequestsRequestOps = new DescribeSpotFleetRequestsRequestOps(v)

}
