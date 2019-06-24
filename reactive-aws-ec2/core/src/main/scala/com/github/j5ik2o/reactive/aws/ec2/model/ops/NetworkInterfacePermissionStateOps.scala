// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfacePermissionStateBuilderOps(val self: NetworkInterfacePermissionState.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(
      value: Option[NetworkInterfacePermissionStateCode]
  ): NetworkInterfacePermissionState.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): NetworkInterfacePermissionState.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

}

final class NetworkInterfacePermissionStateOps(val self: NetworkInterfacePermissionState) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[NetworkInterfacePermissionStateCode] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfacePermissionStateOps {

  implicit def toNetworkInterfacePermissionStateBuilderOps(
      v: NetworkInterfacePermissionState.Builder
  ): NetworkInterfacePermissionStateBuilderOps = new NetworkInterfacePermissionStateBuilderOps(v)

  implicit def toNetworkInterfacePermissionStateOps(
      v: NetworkInterfacePermissionState
  ): NetworkInterfacePermissionStateOps = new NetworkInterfacePermissionStateOps(v)

}
