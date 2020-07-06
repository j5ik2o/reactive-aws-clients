// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class AssociateEnvironmentOperationsRoleRequestBuilderOps(
    val self: AssociateEnvironmentOperationsRoleRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): AssociateEnvironmentOperationsRoleRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationsRoleAsScala(value: Option[String]): AssociateEnvironmentOperationsRoleRequest.Builder = {
    value.fold(self) { v => self.operationsRole(v) }
  }

}

final class AssociateEnvironmentOperationsRoleRequestOps(val self: AssociateEnvironmentOperationsRoleRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationsRoleAsScala: Option[String] = Option(self.operationsRole)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateEnvironmentOperationsRoleRequestOps {

  implicit def toAssociateEnvironmentOperationsRoleRequestBuilderOps(
      v: AssociateEnvironmentOperationsRoleRequest.Builder
  ): AssociateEnvironmentOperationsRoleRequestBuilderOps = new AssociateEnvironmentOperationsRoleRequestBuilderOps(v)

  implicit def toAssociateEnvironmentOperationsRoleRequestOps(
      v: AssociateEnvironmentOperationsRoleRequest
  ): AssociateEnvironmentOperationsRoleRequestOps = new AssociateEnvironmentOperationsRoleRequestOps(v)

}
