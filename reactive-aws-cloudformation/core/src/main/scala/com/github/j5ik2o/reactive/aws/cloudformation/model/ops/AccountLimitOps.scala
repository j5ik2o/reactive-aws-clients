// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class AccountLimitBuilderOps(val self: AccountLimit.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Int]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class AccountLimitOps(val self: AccountLimit) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Int] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccountLimitOps {

  implicit def toAccountLimitBuilderOps(v: AccountLimit.Builder): AccountLimitBuilderOps = new AccountLimitBuilderOps(v)

  implicit def toAccountLimitOps(v: AccountLimit): AccountLimitOps = new AccountLimitOps(v)

}
