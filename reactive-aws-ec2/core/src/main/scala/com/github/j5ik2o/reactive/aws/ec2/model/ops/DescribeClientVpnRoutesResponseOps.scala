// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnRoutesResponseBuilderOps(val self: DescribeClientVpnRoutesResponse.Builder)
    extends AnyVal {

  final def routesAsScala(value: Option[Seq[ClientVpnRoute]]): DescribeClientVpnRoutesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routes(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnRoutesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClientVpnRoutesResponseOps(val self: DescribeClientVpnRoutesResponse) extends AnyVal {

  final def routesAsScala: Option[Seq[ClientVpnRoute]] = Option(self.routes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnRoutesResponseOps {

  implicit def toDescribeClientVpnRoutesResponseBuilderOps(
      v: DescribeClientVpnRoutesResponse.Builder
  ): DescribeClientVpnRoutesResponseBuilderOps = new DescribeClientVpnRoutesResponseBuilderOps(v)

  implicit def toDescribeClientVpnRoutesResponseOps(
      v: DescribeClientVpnRoutesResponse
  ): DescribeClientVpnRoutesResponseOps = new DescribeClientVpnRoutesResponseOps(v)

}
