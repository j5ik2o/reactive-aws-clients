// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotInstanceRequestsResponseBuilderOps(val self: DescribeSpotInstanceRequestsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotInstanceRequestsAsScala(
      value: Option[Seq[SpotInstanceRequest]]
  ): DescribeSpotInstanceRequestsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.spotInstanceRequests(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeSpotInstanceRequestsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeSpotInstanceRequestsResponseOps(val self: DescribeSpotInstanceRequestsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotInstanceRequestsAsScala: Option[Seq[SpotInstanceRequest]] =
    Option(self.spotInstanceRequests).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotInstanceRequestsResponseOps {

  implicit def toDescribeSpotInstanceRequestsResponseBuilderOps(
      v: DescribeSpotInstanceRequestsResponse.Builder
  ): DescribeSpotInstanceRequestsResponseBuilderOps = new DescribeSpotInstanceRequestsResponseBuilderOps(v)

  implicit def toDescribeSpotInstanceRequestsResponseOps(
      v: DescribeSpotInstanceRequestsResponse
  ): DescribeSpotInstanceRequestsResponseOps = new DescribeSpotInstanceRequestsResponseOps(v)

}
