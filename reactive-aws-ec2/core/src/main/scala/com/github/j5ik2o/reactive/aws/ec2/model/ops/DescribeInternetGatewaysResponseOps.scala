// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInternetGatewaysResponseBuilderOps(val self: DescribeInternetGatewaysResponse.Builder)
    extends AnyVal {

  final def internetGatewaysAsScala(value: Option[Seq[InternetGateway]]): DescribeInternetGatewaysResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.internetGateways(v.asJava)
    }
  }

}

final class DescribeInternetGatewaysResponseOps(val self: DescribeInternetGatewaysResponse) extends AnyVal {

  final def internetGatewaysAsScala: Option[Seq[InternetGateway]] = Option(self.internetGateways).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInternetGatewaysResponseOps {

  implicit def toDescribeInternetGatewaysResponseBuilderOps(
      v: DescribeInternetGatewaysResponse.Builder
  ): DescribeInternetGatewaysResponseBuilderOps = new DescribeInternetGatewaysResponseBuilderOps(v)

  implicit def toDescribeInternetGatewaysResponseOps(
      v: DescribeInternetGatewaysResponse
  ): DescribeInternetGatewaysResponseOps = new DescribeInternetGatewaysResponseOps(v)

}
