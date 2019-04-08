// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class FailureBuilderOps(val self: Failure.Builder) extends AnyVal {

  final def arnAsScala(value: Option[String]): Failure.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def reasonAsScala(value: Option[String]): Failure.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

}

final class FailureOps(val self: Failure) extends AnyVal {

  final def arnAsScala: Option[String] = Option(self.arn)

  final def reasonAsScala: Option[String] = Option(self.reason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFailureOps {

  implicit def toFailureBuilderOps(v: Failure.Builder): FailureBuilderOps = new FailureBuilderOps(v)

  implicit def toFailureOps(v: Failure): FailureOps = new FailureOps(v)

}
