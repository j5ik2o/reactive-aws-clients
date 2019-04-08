// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotInstanceRequestsRequestBuilderOps(val self: DescribeSpotInstanceRequestsRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeSpotInstanceRequestsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def spotInstanceRequestIdsAsScala(value: Option[Seq[String]]): DescribeSpotInstanceRequestsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.spotInstanceRequestIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSpotInstanceRequestsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeSpotInstanceRequestsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeSpotInstanceRequestsRequestOps(val self: DescribeSpotInstanceRequestsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def spotInstanceRequestIdsAsScala: Option[Seq[String]] = Option(self.spotInstanceRequestIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotInstanceRequestsRequestOps {

  implicit def toDescribeSpotInstanceRequestsRequestBuilderOps(
      v: DescribeSpotInstanceRequestsRequest.Builder
  ): DescribeSpotInstanceRequestsRequestBuilderOps = new DescribeSpotInstanceRequestsRequestBuilderOps(v)

  implicit def toDescribeSpotInstanceRequestsRequestOps(
      v: DescribeSpotInstanceRequestsRequest
  ): DescribeSpotInstanceRequestsRequestOps = new DescribeSpotInstanceRequestsRequestOps(v)

}
