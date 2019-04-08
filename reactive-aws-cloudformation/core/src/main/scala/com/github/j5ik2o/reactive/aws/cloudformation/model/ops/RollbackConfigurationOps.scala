// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class RollbackConfigurationBuilderOps(val self: RollbackConfiguration.Builder) extends AnyVal {

  final def rollbackTriggersAsScala(value: Option[Seq[RollbackTrigger]]): RollbackConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.rollbackTriggers(v.asJava)
    }
  }

  final def monitoringTimeInMinutesAsScala(value: Option[Int]): RollbackConfiguration.Builder = {
    value.fold(self) { v =>
      self.monitoringTimeInMinutes(v)
    }
  }

}

final class RollbackConfigurationOps(val self: RollbackConfiguration) extends AnyVal {

  final def rollbackTriggersAsScala: Option[Seq[RollbackTrigger]] = Option(self.rollbackTriggers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def monitoringTimeInMinutesAsScala: Option[Int] = Option(self.monitoringTimeInMinutes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRollbackConfigurationOps {

  implicit def toRollbackConfigurationBuilderOps(v: RollbackConfiguration.Builder): RollbackConfigurationBuilderOps =
    new RollbackConfigurationBuilderOps(v)

  implicit def toRollbackConfigurationOps(v: RollbackConfiguration): RollbackConfigurationOps =
    new RollbackConfigurationOps(v)

}
