// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class SetAlarmStateRequestBuilderOps(val self: SetAlarmStateRequest.Builder) extends AnyVal {

  final def alarmNameAsScala(value: Option[String]): SetAlarmStateRequest.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  } // String

  final def stateValueAsScala(value: Option[StateValue]): SetAlarmStateRequest.Builder = {
    value.fold(self) { v =>
      self.stateValue(v)
    }
  } // StateValue

  final def stateReasonAsScala(value: Option[String]): SetAlarmStateRequest.Builder = {
    value.fold(self) { v =>
      self.stateReason(v)
    }
  } // String

  final def stateReasonDataAsScala(value: Option[String]): SetAlarmStateRequest.Builder = {
    value.fold(self) { v =>
      self.stateReasonData(v)
    }
  } // String

}

final class SetAlarmStateRequestOps(val self: SetAlarmStateRequest) extends AnyVal {

  final def alarmNameAsScala: Option[String] = Option(self.alarmName) // String

  final def stateValueAsScala: Option[StateValue] = Option(self.stateValue) // StateValue

  final def stateReasonAsScala: Option[String] = Option(self.stateReason) // String

  final def stateReasonDataAsScala: Option[String] = Option(self.stateReasonData) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetAlarmStateRequestOps {

  implicit def toSetAlarmStateRequestBuilderOps(v: SetAlarmStateRequest.Builder): SetAlarmStateRequestBuilderOps =
    new SetAlarmStateRequestBuilderOps(v)

  implicit def toSetAlarmStateRequestOps(v: SetAlarmStateRequest): SetAlarmStateRequestOps =
    new SetAlarmStateRequestOps(v)

}
