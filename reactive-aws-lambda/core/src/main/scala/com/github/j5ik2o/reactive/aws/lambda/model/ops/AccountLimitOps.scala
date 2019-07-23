// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AccountLimitBuilderOps(val self: AccountLimit.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalCodeSizeAsScala(value: Option[Long]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.totalCodeSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeUnzippedAsScala(value: Option[Long]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.codeSizeUnzipped(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeZippedAsScala(value: Option[Long]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.codeSizeZipped(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def concurrentExecutionsAsScala(value: Option[Int]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.concurrentExecutions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unreservedConcurrentExecutionsAsScala(value: Option[Int]): AccountLimit.Builder = {
    value.fold(self) { v =>
      self.unreservedConcurrentExecutions(v)
    }
  }

}

final class AccountLimitOps(val self: AccountLimit) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalCodeSizeAsScala: Option[Long] = Option(self.totalCodeSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeUnzippedAsScala: Option[Long] = Option(self.codeSizeUnzipped)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeZippedAsScala: Option[Long] = Option(self.codeSizeZipped)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def concurrentExecutionsAsScala: Option[Int] = Option(self.concurrentExecutions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unreservedConcurrentExecutionsAsScala: Option[Int] = Option(self.unreservedConcurrentExecutions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccountLimitOps {

  implicit def toAccountLimitBuilderOps(v: AccountLimit.Builder): AccountLimitBuilderOps = new AccountLimitBuilderOps(v)

  implicit def toAccountLimitOps(v: AccountLimit): AccountLimitOps = new AccountLimitOps(v)

}
