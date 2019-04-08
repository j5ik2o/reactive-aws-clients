// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointServicesResponseBuilderOps(val self: DescribeVpcEndpointServicesResponse.Builder)
    extends AnyVal {

  final def serviceNamesAsScala(value: Option[Seq[String]]): DescribeVpcEndpointServicesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceNames(v.asJava)
    }
  }

  final def serviceDetailsAsScala(value: Option[Seq[ServiceDetail]]): DescribeVpcEndpointServicesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceDetails(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointServicesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointServicesResponseOps(val self: DescribeVpcEndpointServicesResponse) extends AnyVal {

  final def serviceNamesAsScala: Option[Seq[String]] = Option(self.serviceNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def serviceDetailsAsScala: Option[Seq[ServiceDetail]] = Option(self.serviceDetails).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointServicesResponseOps {

  implicit def toDescribeVpcEndpointServicesResponseBuilderOps(
      v: DescribeVpcEndpointServicesResponse.Builder
  ): DescribeVpcEndpointServicesResponseBuilderOps = new DescribeVpcEndpointServicesResponseBuilderOps(v)

  implicit def toDescribeVpcEndpointServicesResponseOps(
      v: DescribeVpcEndpointServicesResponse
  ): DescribeVpcEndpointServicesResponseOps = new DescribeVpcEndpointServicesResponseOps(v)

}
