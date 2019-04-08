// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkInterfaceAttributeRequestBuilderOps(
    val self: DescribeNetworkInterfaceAttributeRequest.Builder
) extends AnyVal {

  final def attributeAsScala(
      value: Option[NetworkInterfaceAttribute]
  ): DescribeNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): DescribeNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

}

final class DescribeNetworkInterfaceAttributeRequestOps(val self: DescribeNetworkInterfaceAttributeRequest)
    extends AnyVal {

  final def attributeAsScala: Option[NetworkInterfaceAttribute] = Option(self.attribute)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkInterfaceAttributeRequestOps {

  implicit def toDescribeNetworkInterfaceAttributeRequestBuilderOps(
      v: DescribeNetworkInterfaceAttributeRequest.Builder
  ): DescribeNetworkInterfaceAttributeRequestBuilderOps = new DescribeNetworkInterfaceAttributeRequestBuilderOps(v)

  implicit def toDescribeNetworkInterfaceAttributeRequestOps(
      v: DescribeNetworkInterfaceAttributeRequest
  ): DescribeNetworkInterfaceAttributeRequestOps = new DescribeNetworkInterfaceAttributeRequestOps(v)

}
