// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SearchTransitGatewayRoutesResponseBuilderOps(val self: SearchTransitGatewayRoutesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routesAsScala(value: Option[Seq[TransitGatewayRoute]]): SearchTransitGatewayRoutesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.routes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def additionalRoutesAvailableAsScala(value: Option[Boolean]): SearchTransitGatewayRoutesResponse.Builder = {
    value.fold(self) { v => self.additionalRoutesAvailable(v) }
  }

}

final class SearchTransitGatewayRoutesResponseOps(val self: SearchTransitGatewayRoutesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routesAsScala: Option[Seq[TransitGatewayRoute]] =
    Option(self.routes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def additionalRoutesAvailableAsScala: Option[Boolean] = Option(self.additionalRoutesAvailable)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchTransitGatewayRoutesResponseOps {

  implicit def toSearchTransitGatewayRoutesResponseBuilderOps(
      v: SearchTransitGatewayRoutesResponse.Builder
  ): SearchTransitGatewayRoutesResponseBuilderOps = new SearchTransitGatewayRoutesResponseBuilderOps(v)

  implicit def toSearchTransitGatewayRoutesResponseOps(
      v: SearchTransitGatewayRoutesResponse
  ): SearchTransitGatewayRoutesResponseOps = new SearchTransitGatewayRoutesResponseOps(v)

}
