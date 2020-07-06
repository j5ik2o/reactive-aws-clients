// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DisassociateEnvironmentOperationsRoleRequestBuilderOps(
    val self: DisassociateEnvironmentOperationsRoleRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): DisassociateEnvironmentOperationsRoleRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

}

final class DisassociateEnvironmentOperationsRoleRequestOps(val self: DisassociateEnvironmentOperationsRoleRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateEnvironmentOperationsRoleRequestOps {

  implicit def toDisassociateEnvironmentOperationsRoleRequestBuilderOps(
      v: DisassociateEnvironmentOperationsRoleRequest.Builder
  ): DisassociateEnvironmentOperationsRoleRequestBuilderOps =
    new DisassociateEnvironmentOperationsRoleRequestBuilderOps(v)

  implicit def toDisassociateEnvironmentOperationsRoleRequestOps(
      v: DisassociateEnvironmentOperationsRoleRequest
  ): DisassociateEnvironmentOperationsRoleRequestOps = new DisassociateEnvironmentOperationsRoleRequestOps(v)

}
