// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkInterfacePermissionsResponseBuilderOps(
    val self: DescribeNetworkInterfacePermissionsResponse.Builder
) extends AnyVal {

  final def networkInterfacePermissionsAsScala(
      value: Option[Seq[NetworkInterfacePermission]]
  ): DescribeNetworkInterfacePermissionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfacePermissions(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeNetworkInterfacePermissionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeNetworkInterfacePermissionsResponseOps(val self: DescribeNetworkInterfacePermissionsResponse)
    extends AnyVal {

  final def networkInterfacePermissionsAsScala: Option[Seq[NetworkInterfacePermission]] =
    Option(self.networkInterfacePermissions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkInterfacePermissionsResponseOps {

  implicit def toDescribeNetworkInterfacePermissionsResponseBuilderOps(
      v: DescribeNetworkInterfacePermissionsResponse.Builder
  ): DescribeNetworkInterfacePermissionsResponseBuilderOps =
    new DescribeNetworkInterfacePermissionsResponseBuilderOps(v)

  implicit def toDescribeNetworkInterfacePermissionsResponseOps(
      v: DescribeNetworkInterfacePermissionsResponse
  ): DescribeNetworkInterfacePermissionsResponseOps = new DescribeNetworkInterfacePermissionsResponseOps(v)

}
