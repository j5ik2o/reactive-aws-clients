// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotFleetRequestsResponseBuilderOps(val self: DescribeSpotFleetRequestsResponse.Builder)
    extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeSpotFleetRequestsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def spotFleetRequestConfigsAsScala(
      value: Option[Seq[SpotFleetRequestConfig]]
  ): DescribeSpotFleetRequestsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.spotFleetRequestConfigs(v.asJava)
    }
  }

}

final class DescribeSpotFleetRequestsResponseOps(val self: DescribeSpotFleetRequestsResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def spotFleetRequestConfigsAsScala: Option[Seq[SpotFleetRequestConfig]] =
    Option(self.spotFleetRequestConfigs).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotFleetRequestsResponseOps {

  implicit def toDescribeSpotFleetRequestsResponseBuilderOps(
      v: DescribeSpotFleetRequestsResponse.Builder
  ): DescribeSpotFleetRequestsResponseBuilderOps = new DescribeSpotFleetRequestsResponseBuilderOps(v)

  implicit def toDescribeSpotFleetRequestsResponseOps(
      v: DescribeSpotFleetRequestsResponse
  ): DescribeSpotFleetRequestsResponseOps = new DescribeSpotFleetRequestsResponseOps(v)

}
