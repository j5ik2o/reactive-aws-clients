// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class RollbackTriggerBuilderOps(val self: RollbackTrigger.Builder) extends AnyVal {

  final def arnAsScala(value: Option[String]): RollbackTrigger.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  } // String

  final def typeAsScala(value: Option[String]): RollbackTrigger.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // String

}

final class RollbackTriggerOps(val self: RollbackTrigger) extends AnyVal {

  final def arnAsScala: Option[String] = Option(self.arn) // String

  final def typeAsScala: Option[String] = Option(self.`type`) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRollbackTriggerOps {

  implicit def toRollbackTriggerBuilderOps(v: RollbackTrigger.Builder): RollbackTriggerBuilderOps =
    new RollbackTriggerBuilderOps(v)

  implicit def toRollbackTriggerOps(v: RollbackTrigger): RollbackTriggerOps = new RollbackTriggerOps(v)

}
