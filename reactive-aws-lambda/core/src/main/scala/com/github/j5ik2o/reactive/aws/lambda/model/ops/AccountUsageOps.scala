// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AccountUsageBuilderOps(val self: AccountUsage.Builder) extends AnyVal {

  final def totalCodeSizeAsScala(value: Option[Long]): AccountUsage.Builder = {
    value.fold(self) { v =>
      self.totalCodeSize(v)
    }
  } // Long

  final def functionCountAsScala(value: Option[Long]): AccountUsage.Builder = {
    value.fold(self) { v =>
      self.functionCount(v)
    }
  } // Long

}

final class AccountUsageOps(val self: AccountUsage) extends AnyVal {

  final def totalCodeSizeAsScala: Option[Long] = Option(self.totalCodeSize) // Long

  final def functionCountAsScala: Option[Long] = Option(self.functionCount) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccountUsageOps {

  implicit def toAccountUsageBuilderOps(v: AccountUsage.Builder): AccountUsageBuilderOps = new AccountUsageBuilderOps(v)

  implicit def toAccountUsageOps(v: AccountUsage): AccountUsageOps = new AccountUsageOps(v)

}
