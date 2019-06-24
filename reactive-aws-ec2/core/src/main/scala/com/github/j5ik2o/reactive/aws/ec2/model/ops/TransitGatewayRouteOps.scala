// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRouteBuilderOps(val self: TransitGatewayRoute.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala(value: Option[String]): TransitGatewayRoute.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentsAsScala(
      value: Option[Seq[TransitGatewayRouteAttachment]]
  ): TransitGatewayRoute.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGatewayAttachments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[TransitGatewayRouteType]): TransitGatewayRoute.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayRouteState]): TransitGatewayRoute.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class TransitGatewayRouteOps(val self: TransitGatewayRoute) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentsAsScala: Option[Seq[TransitGatewayRouteAttachment]] =
    Option(self.transitGatewayAttachments).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[TransitGatewayRouteType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[TransitGatewayRouteState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayRouteOps {

  implicit def toTransitGatewayRouteBuilderOps(v: TransitGatewayRoute.Builder): TransitGatewayRouteBuilderOps =
    new TransitGatewayRouteBuilderOps(v)

  implicit def toTransitGatewayRouteOps(v: TransitGatewayRoute): TransitGatewayRouteOps = new TransitGatewayRouteOps(v)

}
