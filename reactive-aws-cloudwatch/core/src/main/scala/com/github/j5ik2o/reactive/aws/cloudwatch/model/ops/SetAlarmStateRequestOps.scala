// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class SetAlarmStateRequestBuilderOps(val self: SetAlarmStateRequest.Builder) extends AnyVal {

  final def alarmNameAsScala(value: Option[String]): SetAlarmStateRequest.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  }

  final def stateValueAsScala(value: Option[StateValue]): SetAlarmStateRequest.Builder = {
    value.fold(self) { v =>
      self.stateValue(v)
    }
  }

  final def stateReasonAsScala(value: Option[String]): SetAlarmStateRequest.Builder = {
    value.fold(self) { v =>
      self.stateReason(v)
    }
  }

  final def stateReasonDataAsScala(value: Option[String]): SetAlarmStateRequest.Builder = {
    value.fold(self) { v =>
      self.stateReasonData(v)
    }
  }

}

final class SetAlarmStateRequestOps(val self: SetAlarmStateRequest) extends AnyVal {

  final def alarmNameAsScala: Option[String] = Option(self.alarmName)

  final def stateValueAsScala: Option[StateValue] = Option(self.stateValue)

  final def stateReasonAsScala: Option[String] = Option(self.stateReason)

  final def stateReasonDataAsScala: Option[String] = Option(self.stateReasonData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetAlarmStateRequestOps {

  implicit def toSetAlarmStateRequestBuilderOps(v: SetAlarmStateRequest.Builder): SetAlarmStateRequestBuilderOps =
    new SetAlarmStateRequestBuilderOps(v)

  implicit def toSetAlarmStateRequestOps(v: SetAlarmStateRequest): SetAlarmStateRequestOps =
    new SetAlarmStateRequestOps(v)

}
