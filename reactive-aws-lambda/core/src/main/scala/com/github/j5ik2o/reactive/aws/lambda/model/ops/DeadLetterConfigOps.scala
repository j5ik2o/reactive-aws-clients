// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeadLetterConfigBuilderOps(val self: DeadLetterConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetArnAsScala(value: Option[String]): DeadLetterConfig.Builder = {
    value.fold(self) { v =>
      self.targetArn(v)
    }
  }

}

final class DeadLetterConfigOps(val self: DeadLetterConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetArnAsScala: Option[String] = Option(self.targetArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeadLetterConfigOps {

  implicit def toDeadLetterConfigBuilderOps(v: DeadLetterConfig.Builder): DeadLetterConfigBuilderOps =
    new DeadLetterConfigBuilderOps(v)

  implicit def toDeadLetterConfigOps(v: DeadLetterConfig): DeadLetterConfigOps = new DeadLetterConfigOps(v)

}
