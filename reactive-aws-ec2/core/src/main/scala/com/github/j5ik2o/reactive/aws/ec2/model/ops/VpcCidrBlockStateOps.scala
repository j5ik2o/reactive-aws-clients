// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcCidrBlockStateBuilderOps(val self: VpcCidrBlockState.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[VpcCidrBlockStateCode]): VpcCidrBlockState.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): VpcCidrBlockState.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

}

final class VpcCidrBlockStateOps(val self: VpcCidrBlockState) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[VpcCidrBlockStateCode] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcCidrBlockStateOps {

  implicit def toVpcCidrBlockStateBuilderOps(v: VpcCidrBlockState.Builder): VpcCidrBlockStateBuilderOps =
    new VpcCidrBlockStateBuilderOps(v)

  implicit def toVpcCidrBlockStateOps(v: VpcCidrBlockState): VpcCidrBlockStateOps = new VpcCidrBlockStateOps(v)

}
