// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePublicIpv4PoolsRequestBuilderOps(val self: DescribePublicIpv4PoolsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdsAsScala(value: Option[Seq[String]]): DescribePublicIpv4PoolsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.poolIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribePublicIpv4PoolsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribePublicIpv4PoolsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribePublicIpv4PoolsRequestOps(val self: DescribePublicIpv4PoolsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdsAsScala: Option[Seq[String]] = Option(self.poolIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
