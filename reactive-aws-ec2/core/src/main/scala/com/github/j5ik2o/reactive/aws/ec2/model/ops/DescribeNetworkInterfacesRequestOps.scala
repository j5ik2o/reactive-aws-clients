// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkInterfacesRequestBuilderOps(val self: DescribeNetworkInterfacesRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeNetworkInterfacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def networkInterfaceIdsAsScala(value: Option[Seq[String]]): DescribeNetworkInterfacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaceIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeNetworkInterfacesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeNetworkInterfacesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeNetworkInterfacesRequestOps(val self: DescribeNetworkInterfacesRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def networkInterfaceIdsAsScala: Option[Seq[String]] = Option(self.networkInterfaceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkInterfacesRequestOps {

  implicit def toDescribeNetworkInterfacesRequestBuilderOps(
      v: DescribeNetworkInterfacesRequest.Builder
  ): DescribeNetworkInterfacesRequestBuilderOps = new DescribeNetworkInterfacesRequestBuilderOps(v)

  implicit def toDescribeNetworkInterfacesRequestOps(
      v: DescribeNetworkInterfacesRequest
  ): DescribeNetworkInterfacesRequestOps = new DescribeNetworkInterfacesRequestOps(v)

}
