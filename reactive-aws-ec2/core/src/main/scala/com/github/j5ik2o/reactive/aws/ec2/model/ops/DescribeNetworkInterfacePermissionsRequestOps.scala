// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkInterfacePermissionsRequestBuilderOps(
    val self: DescribeNetworkInterfacePermissionsRequest.Builder
) extends AnyVal {

  final def networkInterfacePermissionIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeNetworkInterfacePermissionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfacePermissionIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeNetworkInterfacePermissionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeNetworkInterfacePermissionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeNetworkInterfacePermissionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeNetworkInterfacePermissionsRequestOps(val self: DescribeNetworkInterfacePermissionsRequest)
    extends AnyVal {

  final def networkInterfacePermissionIdsAsScala: Option[Seq[String]] = Option(self.networkInterfacePermissionIds).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkInterfacePermissionsRequestOps {

  implicit def toDescribeNetworkInterfacePermissionsRequestBuilderOps(
      v: DescribeNetworkInterfacePermissionsRequest.Builder
  ): DescribeNetworkInterfacePermissionsRequestBuilderOps = new DescribeNetworkInterfacePermissionsRequestBuilderOps(v)

  implicit def toDescribeNetworkInterfacePermissionsRequestOps(
      v: DescribeNetworkInterfacePermissionsRequest
  ): DescribeNetworkInterfacePermissionsRequestOps = new DescribeNetworkInterfacePermissionsRequestOps(v)

}
