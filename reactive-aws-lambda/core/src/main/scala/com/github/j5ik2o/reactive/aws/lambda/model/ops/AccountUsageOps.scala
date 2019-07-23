// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AccountUsageBuilderOps(val self: AccountUsage.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalCodeSizeAsScala(value: Option[Long]): AccountUsage.Builder = {
    value.fold(self) { v =>
      self.totalCodeSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionCountAsScala(value: Option[Long]): AccountUsage.Builder = {
    value.fold(self) { v =>
      self.functionCount(v)
    }
  }

}

final class AccountUsageOps(val self: AccountUsage) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalCodeSizeAsScala: Option[Long] = Option(self.totalCodeSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionCountAsScala: Option[Long] = Option(self.functionCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccountUsageOps {

  implicit def toAccountUsageBuilderOps(v: AccountUsage.Builder): AccountUsageBuilderOps = new AccountUsageBuilderOps(v)

  implicit def toAccountUsageOps(v: AccountUsage): AccountUsageOps = new AccountUsageOps(v)

}
