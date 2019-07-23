// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class RollbackTriggerBuilderOps(val self: RollbackTrigger.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): RollbackTrigger.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): RollbackTrigger.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class RollbackTriggerOps(val self: RollbackTrigger) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRollbackTriggerOps {

  implicit def toRollbackTriggerBuilderOps(v: RollbackTrigger.Builder): RollbackTriggerBuilderOps =
    new RollbackTriggerBuilderOps(v)

  implicit def toRollbackTriggerOps(v: RollbackTrigger): RollbackTriggerOps = new RollbackTriggerOps(v)

}
