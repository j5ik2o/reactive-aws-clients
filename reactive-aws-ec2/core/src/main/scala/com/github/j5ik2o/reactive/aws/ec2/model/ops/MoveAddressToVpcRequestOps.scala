// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class MoveAddressToVpcRequestBuilderOps(val self: MoveAddressToVpcRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpAsScala(value: Option[String]): MoveAddressToVpcRequest.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

}

final class MoveAddressToVpcRequestOps(val self: MoveAddressToVpcRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpAsScala: Option[String] = Option(self.publicIp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMoveAddressToVpcRequestOps {

  implicit def toMoveAddressToVpcRequestBuilderOps(
      v: MoveAddressToVpcRequest.Builder
  ): MoveAddressToVpcRequestBuilderOps = new MoveAddressToVpcRequestBuilderOps(v)

  implicit def toMoveAddressToVpcRequestOps(v: MoveAddressToVpcRequest): MoveAddressToVpcRequestOps =
    new MoveAddressToVpcRequestOps(v)

}
