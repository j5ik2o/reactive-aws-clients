// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AccountLimitBuilderOps(val self: AccountLimit.Builder) extends AnyVal {

  final def totalCodeSizeAsScala(value: Option[Long]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.totalCodeSize(v)
    }
  }

  final def codeSizeUnzippedAsScala(value: Option[Long]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.codeSizeUnzipped(v)
    }
  }

  final def codeSizeZippedAsScala(value: Option[Long]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.codeSizeZipped(v)
    }
  }

  final def concurrentExecutionsAsScala(value: Option[Int]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.concurrentExecutions(v)
    }
  }

  final def unreservedConcurrentExecutionsAsScala(value: Option[Int]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.unreservedConcurrentExecutions(v)
    }
  }

}

final class AccountLimitOps(val self: AccountLimit) extends AnyVal {

  final def totalCodeSizeAsScala: Option[Long] = Option(self.totalCodeSize)

  final def codeSizeUnzippedAsScala: Option[Long] = Option(self.codeSizeUnzipped)

  final def codeSizeZippedAsScala: Option[Long] = Option(self.codeSizeZipped)

  final def concurrentExecutionsAsScala: Option[Int] = Option(self.concurrentExecutions)

  final def unreservedConcurrentExecutionsAsScala: Option[Int] = Option(self.unreservedConcurrentExecutions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccountLimitOps {

  implicit def toAccountLimitBuilderOps(v: AccountLimit.Builder): AccountLimitBuilderOps = new AccountLimitBuilderOps(v)

  implicit def toAccountLimitOps(v: AccountLimit): AccountLimitOps = new AccountLimitOps(v)

}
