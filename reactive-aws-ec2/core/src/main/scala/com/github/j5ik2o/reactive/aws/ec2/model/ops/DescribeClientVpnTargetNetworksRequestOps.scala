// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnTargetNetworksRequestBuilderOps(val self: DescribeClientVpnTargetNetworksRequest.Builder)
    extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): DescribeClientVpnTargetNetworksRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def associationIdsAsScala(value: Option[Seq[String]]): DescribeClientVpnTargetNetworksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.associationIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeClientVpnTargetNetworksRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnTargetNetworksRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeClientVpnTargetNetworksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

}

final class DescribeClientVpnTargetNetworksRequestOps(val self: DescribeClientVpnTargetNetworksRequest) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def associationIdsAsScala: Option[Seq[String]] = Option(self.associationIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnTargetNetworksRequestOps {

  implicit def toDescribeClientVpnTargetNetworksRequestBuilderOps(
      v: DescribeClientVpnTargetNetworksRequest.Builder
  ): DescribeClientVpnTargetNetworksRequestBuilderOps = new DescribeClientVpnTargetNetworksRequestBuilderOps(v)

  implicit def toDescribeClientVpnTargetNetworksRequestOps(
      v: DescribeClientVpnTargetNetworksRequest
  ): DescribeClientVpnTargetNetworksRequestOps = new DescribeClientVpnTargetNetworksRequestOps(v)

}
