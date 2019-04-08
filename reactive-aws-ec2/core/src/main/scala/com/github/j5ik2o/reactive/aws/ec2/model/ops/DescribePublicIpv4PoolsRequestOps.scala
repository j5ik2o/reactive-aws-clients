// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePublicIpv4PoolsRequestBuilderOps(val self: DescribePublicIpv4PoolsRequest.Builder) extends AnyVal {

  final def poolIdsAsScala(value: Option[Seq[String]]): DescribePublicIpv4PoolsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.poolIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribePublicIpv4PoolsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribePublicIpv4PoolsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribePublicIpv4PoolsRequestOps(val self: DescribePublicIpv4PoolsRequest) extends AnyVal {

  final def poolIdsAsScala: Option[Seq[String]] = Option(self.poolIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePublicIpv4PoolsRequestOps {

  implicit def toDescribePublicIpv4PoolsRequestBuilderOps(
      v: DescribePublicIpv4PoolsRequest.Builder
  ): DescribePublicIpv4PoolsRequestBuilderOps = new DescribePublicIpv4PoolsRequestBuilderOps(v)

  implicit def toDescribePublicIpv4PoolsRequestOps(
      v: DescribePublicIpv4PoolsRequest
  ): DescribePublicIpv4PoolsRequestOps = new DescribePublicIpv4PoolsRequestOps(v)

}
