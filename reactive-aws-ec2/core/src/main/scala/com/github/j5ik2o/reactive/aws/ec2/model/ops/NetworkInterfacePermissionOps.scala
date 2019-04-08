// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfacePermissionBuilderOps(val self: NetworkInterfacePermission.Builder) extends AnyVal {

  final def networkInterfacePermissionIdAsScala(value: Option[String]): NetworkInterfacePermission.Builder = {
    value.fold(self) { v =>
      self.networkInterfacePermissionId(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): NetworkInterfacePermission.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def awsAccountIdAsScala(value: Option[String]): NetworkInterfacePermission.Builder = {
    value.fold(self) { v =>
      self.awsAccountId(v)
    }
  }

  final def awsServiceAsScala(value: Option[String]): NetworkInterfacePermission.Builder = {
    value.fold(self) { v =>
      self.awsService(v)
    }
  }

  final def permissionAsScala(value: Option[InterfacePermissionType]): NetworkInterfacePermission.Builder = {
    value.fold(self) { v =>
      self.permission(v)
    }
  }

  final def permissionStateAsScala(
      value: Option[NetworkInterfacePermissionState]
  ): NetworkInterfacePermission.Builder = {
    value.fold(self) { v =>
      self.permissionState(v)
    }
  }

}

final class NetworkInterfacePermissionOps(val self: NetworkInterfacePermission) extends AnyVal {

  final def networkInterfacePermissionIdAsScala: Option[String] = Option(self.networkInterfacePermissionId)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def awsAccountIdAsScala: Option[String] = Option(self.awsAccountId)

  final def awsServiceAsScala: Option[String] = Option(self.awsService)

  final def permissionAsScala: Option[InterfacePermissionType] = Option(self.permission)

  final def permissionStateAsScala: Option[NetworkInterfacePermissionState] = Option(self.permissionState)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfacePermissionOps {

  implicit def toNetworkInterfacePermissionBuilderOps(
      v: NetworkInterfacePermission.Builder
  ): NetworkInterfacePermissionBuilderOps = new NetworkInterfacePermissionBuilderOps(v)

  implicit def toNetworkInterfacePermissionOps(v: NetworkInterfacePermission): NetworkInterfacePermissionOps =
    new NetworkInterfacePermissionOps(v)

}
