// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeClusterResponseBuilderOps(val self: DescribeClusterResponse.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[Cluster]): DescribeClusterResponse.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

}

final class DescribeClusterResponseOps(val self: DescribeClusterResponse) extends AnyVal {

  final def clusterAsScala: Option[Cluster] = Option(self.cluster)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClusterResponseOps {

  implicit def toDescribeClusterResponseBuilderOps(
      v: DescribeClusterResponse.Builder
  ): DescribeClusterResponseBuilderOps = new DescribeClusterResponseBuilderOps(v)

  implicit def toDescribeClusterResponseOps(v: DescribeClusterResponse): DescribeClusterResponseOps =
    new DescribeClusterResponseOps(v)

}
