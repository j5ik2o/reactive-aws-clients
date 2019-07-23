// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SubnetCidrBlockStateBuilderOps(val self: SubnetCidrBlockState.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[SubnetCidrBlockStateCode]): SubnetCidrBlockState.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): SubnetCidrBlockState.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

}

final class SubnetCidrBlockStateOps(val self: SubnetCidrBlockState) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[SubnetCidrBlockStateCode] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubnetCidrBlockStateOps {

  implicit def toSubnetCidrBlockStateBuilderOps(v: SubnetCidrBlockState.Builder): SubnetCidrBlockStateBuilderOps =
    new SubnetCidrBlockStateBuilderOps(v)

  implicit def toSubnetCidrBlockStateOps(v: SubnetCidrBlockState): SubnetCidrBlockStateOps =
    new SubnetCidrBlockStateOps(v)

}
