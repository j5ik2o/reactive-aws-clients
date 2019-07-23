// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotFleetRequestsRequestBuilderOps(val self: DescribeSpotFleetRequestsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeSpotFleetRequestsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeSpotFleetRequestsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdsAsScala(value: Option[Seq[String]]): DescribeSpotFleetRequestsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.spotFleetRequestIds(v.asJava)
    }
  }

}

final class DescribeSpotFleetRequestsRequestOps(val self: DescribeSpotFleetRequestsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdsAsScala: Option[Seq[String]] = Option(self.spotFleetRequestIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
