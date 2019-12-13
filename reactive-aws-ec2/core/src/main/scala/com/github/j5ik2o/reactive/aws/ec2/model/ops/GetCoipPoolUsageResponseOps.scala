// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetCoipPoolUsageResponseBuilderOps(val self: GetCoipPoolUsageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coipPoolIdAsScala(value: Option[String]): GetCoipPoolUsageResponse.Builder = {
    value.fold(self) { v =>
      self.coipPoolId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coipAddressUsagesAsScala(value: Option[Seq[CoipAddressUsage]]): GetCoipPoolUsageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.coipAddressUsages(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala(value: Option[String]): GetCoipPoolUsageResponse.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableId(v)
    }
  }

}

final class GetCoipPoolUsageResponseOps(val self: GetCoipPoolUsageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coipPoolIdAsScala: Option[String] = Option(self.coipPoolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coipAddressUsagesAsScala: Option[Seq[CoipAddressUsage]] = Option(self.coipAddressUsages).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCoipPoolUsageResponseOps {

  implicit def toGetCoipPoolUsageResponseBuilderOps(
      v: GetCoipPoolUsageResponse.Builder
  ): GetCoipPoolUsageResponseBuilderOps = new GetCoipPoolUsageResponseBuilderOps(v)

  implicit def toGetCoipPoolUsageResponseOps(v: GetCoipPoolUsageResponse): GetCoipPoolUsageResponseOps =
    new GetCoipPoolUsageResponseOps(v)

}
