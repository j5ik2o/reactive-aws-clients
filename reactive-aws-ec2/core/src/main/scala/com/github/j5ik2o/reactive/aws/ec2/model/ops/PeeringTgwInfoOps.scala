// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PeeringTgwInfoBuilderOps(val self: PeeringTgwInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala(value: Option[String]): PeeringTgwInfo.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): PeeringTgwInfo.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala(value: Option[String]): PeeringTgwInfo.Builder = {
    value.fold(self) { v =>
      self.region(v)
    }
  }

}

final class PeeringTgwInfoOps(val self: PeeringTgwInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala: Option[String] = Option(self.region)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPeeringTgwInfoOps {

  implicit def toPeeringTgwInfoBuilderOps(v: PeeringTgwInfo.Builder): PeeringTgwInfoBuilderOps =
    new PeeringTgwInfoBuilderOps(v)

  implicit def toPeeringTgwInfoOps(v: PeeringTgwInfo): PeeringTgwInfoOps = new PeeringTgwInfoOps(v)

}
