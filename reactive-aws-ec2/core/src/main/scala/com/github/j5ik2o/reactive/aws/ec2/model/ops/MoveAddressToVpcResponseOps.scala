// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class MoveAddressToVpcResponseBuilderOps(val self: MoveAddressToVpcResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationIdAsScala(value: Option[String]): MoveAddressToVpcResponse.Builder = {
    value.fold(self) { v => self.allocationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[Status]): MoveAddressToVpcResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class MoveAddressToVpcResponseOps(val self: MoveAddressToVpcResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[Status] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMoveAddressToVpcResponseOps {

  implicit def toMoveAddressToVpcResponseBuilderOps(
      v: MoveAddressToVpcResponse.Builder
  ): MoveAddressToVpcResponseBuilderOps = new MoveAddressToVpcResponseBuilderOps(v)

  implicit def toMoveAddressToVpcResponseOps(v: MoveAddressToVpcResponse): MoveAddressToVpcResponseOps =
    new MoveAddressToVpcResponseOps(v)

}
