// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkInterfacesResponseBuilderOps(val self: DescribeNetworkInterfacesResponse.Builder)
    extends AnyVal {

  final def networkInterfacesAsScala(
      value: Option[Seq[NetworkInterface]]
  ): DescribeNetworkInterfacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeNetworkInterfacesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeNetworkInterfacesResponseOps(val self: DescribeNetworkInterfacesResponse) extends AnyVal {

  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] = Option(self.networkInterfaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkInterfacesResponseOps {

  implicit def toDescribeNetworkInterfacesResponseBuilderOps(
      v: DescribeNetworkInterfacesResponse.Builder
  ): DescribeNetworkInterfacesResponseBuilderOps = new DescribeNetworkInterfacesResponseBuilderOps(v)

  implicit def toDescribeNetworkInterfacesResponseOps(
      v: DescribeNetworkInterfacesResponse
  ): DescribeNetworkInterfacesResponseOps = new DescribeNetworkInterfacesResponseOps(v)

}
