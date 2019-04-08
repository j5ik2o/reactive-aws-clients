// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class MovingAddressStatusBuilderOps(val self: MovingAddressStatus.Builder) extends AnyVal {

  final def moveStatusAsScala(value: Option[MoveStatus]): MovingAddressStatus.Builder = {
    value.fold(self) { v =>
      self.moveStatus(v)
    }
  }

  final def publicIpAsScala(value: Option[String]): MovingAddressStatus.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

}

final class MovingAddressStatusOps(val self: MovingAddressStatus) extends AnyVal {

  final def moveStatusAsScala: Option[MoveStatus] = Option(self.moveStatus)

  final def publicIpAsScala: Option[String] = Option(self.publicIp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMovingAddressStatusOps {

  implicit def toMovingAddressStatusBuilderOps(v: MovingAddressStatus.Builder): MovingAddressStatusBuilderOps =
    new MovingAddressStatusBuilderOps(v)

  implicit def toMovingAddressStatusOps(v: MovingAddressStatus): MovingAddressStatusOps = new MovingAddressStatusOps(v)

}
