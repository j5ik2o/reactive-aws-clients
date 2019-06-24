// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResetNetworkInterfaceAttributeRequestBuilderOps(val self: ResetNetworkInterfaceAttributeRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): ResetNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala(value: Option[String]): ResetNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

}

final class ResetNetworkInterfaceAttributeRequestOps(val self: ResetNetworkInterfaceAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala: Option[String] = Option(self.sourceDestCheck)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResetNetworkInterfaceAttributeRequestOps {

  implicit def toResetNetworkInterfaceAttributeRequestBuilderOps(
      v: ResetNetworkInterfaceAttributeRequest.Builder
  ): ResetNetworkInterfaceAttributeRequestBuilderOps = new ResetNetworkInterfaceAttributeRequestBuilderOps(v)

  implicit def toResetNetworkInterfaceAttributeRequestOps(
      v: ResetNetworkInterfaceAttributeRequest
  ): ResetNetworkInterfaceAttributeRequestOps = new ResetNetworkInterfaceAttributeRequestOps(v)

}
