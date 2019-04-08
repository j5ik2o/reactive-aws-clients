// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotFleetInstancesResponseBuilderOps(val self: DescribeSpotFleetInstancesResponse.Builder)
    extends AnyVal {

  final def activeInstancesAsScala(value: Option[Seq[ActiveInstance]]): DescribeSpotFleetInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.activeInstances(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSpotFleetInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def spotFleetRequestIdAsScala(value: Option[String]): DescribeSpotFleetInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

}

final class DescribeSpotFleetInstancesResponseOps(val self: DescribeSpotFleetInstancesResponse) extends AnyVal {

  final def activeInstancesAsScala: Option[Seq[ActiveInstance]] = Option(self.activeInstances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotFleetInstancesResponseOps {

  implicit def toDescribeSpotFleetInstancesResponseBuilderOps(
      v: DescribeSpotFleetInstancesResponse.Builder
  ): DescribeSpotFleetInstancesResponseBuilderOps = new DescribeSpotFleetInstancesResponseBuilderOps(v)

  implicit def toDescribeSpotFleetInstancesResponseOps(
      v: DescribeSpotFleetInstancesResponse
  ): DescribeSpotFleetInstancesResponseOps = new DescribeSpotFleetInstancesResponseOps(v)

}
