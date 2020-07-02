// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class AccountGateResultBuilderOps(val self: AccountGateResult.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[AccountGateStatus]): AccountGateResult.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): AccountGateResult.Builder = {
    value.fold(self) { v => self.statusReason(v) }
  }

}

final class AccountGateResultOps(val self: AccountGateResult) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[AccountGateStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccountGateResultOps {

  implicit def toAccountGateResultBuilderOps(v: AccountGateResult.Builder): AccountGateResultBuilderOps =
    new AccountGateResultBuilderOps(v)

  implicit def toAccountGateResultOps(v: AccountGateResult): AccountGateResultOps = new AccountGateResultOps(v)

}
