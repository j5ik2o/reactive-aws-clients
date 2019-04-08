// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DisableAlarmActionsRequestBuilderOps(val self: DisableAlarmActionsRequest.Builder) extends AnyVal {

  final def alarmNamesAsScala(value: Option[Seq[String]]): DisableAlarmActionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.alarmNames(v.asJava)
    } // Seq[String]
  }

}

final class DisableAlarmActionsRequestOps(val self: DisableAlarmActionsRequest) extends AnyVal {

  final def alarmNamesAsScala: Option[Seq[String]] = Option(self.alarmNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableAlarmActionsRequestOps {

  implicit def toDisableAlarmActionsRequestBuilderOps(
      v: DisableAlarmActionsRequest.Builder
  ): DisableAlarmActionsRequestBuilderOps = new DisableAlarmActionsRequestBuilderOps(v)

  implicit def toDisableAlarmActionsRequestOps(v: DisableAlarmActionsRequest): DisableAlarmActionsRequestOps =
    new DisableAlarmActionsRequestOps(v)

}
