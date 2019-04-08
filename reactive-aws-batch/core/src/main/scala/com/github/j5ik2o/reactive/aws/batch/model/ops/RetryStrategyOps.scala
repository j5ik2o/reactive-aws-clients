// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class RetryStrategyBuilderOps(val self: RetryStrategy.Builder) extends AnyVal {

  final def attemptsAsScala(value: Option[Int]): RetryStrategy.Builder = {
    value.fold(self) { v =>
      self.attempts(v)
    }
  }

}

final class RetryStrategyOps(val self: RetryStrategy) extends AnyVal {

  final def attemptsAsScala: Option[Int] = Option(self.attempts)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRetryStrategyOps {

  implicit def toRetryStrategyBuilderOps(v: RetryStrategy.Builder): RetryStrategyBuilderOps =
    new RetryStrategyBuilderOps(v)

  implicit def toRetryStrategyOps(v: RetryStrategy): RetryStrategyOps = new RetryStrategyOps(v)

}
