// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNetworkInterfacePermissionRequestBuilderOps(val self: CreateNetworkInterfacePermissionRequest.Builder)
    extends AnyVal {

  final def networkInterfaceIdAsScala(value: Option[String]): CreateNetworkInterfacePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def awsAccountIdAsScala(value: Option[String]): CreateNetworkInterfacePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.awsAccountId(v)
    }
  }

  final def awsServiceAsScala(value: Option[String]): CreateNetworkInterfacePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.awsService(v)
    }
  }

  final def permissionAsScala(
      value: Option[InterfacePermissionType]
  ): CreateNetworkInterfacePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.permission(v)
    }
  }

}

final class CreateNetworkInterfacePermissionRequestOps(val self: CreateNetworkInterfacePermissionRequest)
    extends AnyVal {

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def awsAccountIdAsScala: Option[String] = Option(self.awsAccountId)

  final def awsServiceAsScala: Option[String] = Option(self.awsService)

  final def permissionAsScala: Option[InterfacePermissionType] = Option(self.permission)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNetworkInterfacePermissionRequestOps {

  implicit def toCreateNetworkInterfacePermissionRequestBuilderOps(
      v: CreateNetworkInterfacePermissionRequest.Builder
  ): CreateNetworkInterfacePermissionRequestBuilderOps = new CreateNetworkInterfacePermissionRequestBuilderOps(v)

  implicit def toCreateNetworkInterfacePermissionRequestOps(
      v: CreateNetworkInterfacePermissionRequest
  ): CreateNetworkInterfacePermissionRequestOps = new CreateNetworkInterfacePermissionRequestOps(v)

}
