// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcPeeringConnectionStateReasonBuilderOps(val self: VpcPeeringConnectionStateReason.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[VpcPeeringConnectionStateReasonCode]): VpcPeeringConnectionStateReason.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): VpcPeeringConnectionStateReason.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class VpcPeeringConnectionStateReasonOps(val self: VpcPeeringConnectionStateReason) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[VpcPeeringConnectionStateReasonCode] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcPeeringConnectionStateReasonOps {

  implicit def toVpcPeeringConnectionStateReasonBuilderOps(
      v: VpcPeeringConnectionStateReason.Builder
  ): VpcPeeringConnectionStateReasonBuilderOps = new VpcPeeringConnectionStateReasonBuilderOps(v)

  implicit def toVpcPeeringConnectionStateReasonOps(
      v: VpcPeeringConnectionStateReason
  ): VpcPeeringConnectionStateReasonOps = new VpcPeeringConnectionStateReasonOps(v)

}
