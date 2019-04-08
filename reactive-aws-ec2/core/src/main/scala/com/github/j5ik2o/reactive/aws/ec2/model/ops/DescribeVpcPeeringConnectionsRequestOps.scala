// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcPeeringConnectionsRequestBuilderOps(val self: DescribeVpcPeeringConnectionsRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcPeeringConnectionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def vpcPeeringConnectionIdsAsScala(value: Option[Seq[String]]): DescribeVpcPeeringConnectionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vpcPeeringConnectionIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcPeeringConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVpcPeeringConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeVpcPeeringConnectionsRequestOps(val self: DescribeVpcPeeringConnectionsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcPeeringConnectionIdsAsScala: Option[Seq[String]] = Option(self.vpcPeeringConnectionIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcPeeringConnectionsRequestOps {

  implicit def toDescribeVpcPeeringConnectionsRequestBuilderOps(
      v: DescribeVpcPeeringConnectionsRequest.Builder
  ): DescribeVpcPeeringConnectionsRequestBuilderOps = new DescribeVpcPeeringConnectionsRequestBuilderOps(v)

  implicit def toDescribeVpcPeeringConnectionsRequestOps(
      v: DescribeVpcPeeringConnectionsRequest
  ): DescribeVpcPeeringConnectionsRequestOps = new DescribeVpcPeeringConnectionsRequestOps(v)

}
