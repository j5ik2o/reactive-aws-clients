// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FlowLogBuilderOps(val self: FlowLog.Builder) extends AnyVal {

  final def creationTimeAsScala(value: Option[java.time.Instant]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def deliverLogsErrorMessageAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.deliverLogsErrorMessage(v)
    }
  }

  final def deliverLogsPermissionArnAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.deliverLogsPermissionArn(v)
    }
  }

  final def deliverLogsStatusAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.deliverLogsStatus(v)
    }
  }

  final def flowLogIdAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.flowLogId(v)
    }
  }

  final def flowLogStatusAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.flowLogStatus(v)
    }
  }

  final def logGroupNameAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def resourceIdAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  final def trafficTypeAsScala(value: Option[TrafficType]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.trafficType(v)
    }
  }

  final def logDestinationTypeAsScala(value: Option[LogDestinationType]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.logDestinationType(v)
    }
  }

  final def logDestinationAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.logDestination(v)
    }
  }

}

final class FlowLogOps(val self: FlowLog) extends AnyVal {

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  final def deliverLogsErrorMessageAsScala: Option[String] = Option(self.deliverLogsErrorMessage)

  final def deliverLogsPermissionArnAsScala: Option[String] = Option(self.deliverLogsPermissionArn)

  final def deliverLogsStatusAsScala: Option[String] = Option(self.deliverLogsStatus)

  final def flowLogIdAsScala: Option[String] = Option(self.flowLogId)

  final def flowLogStatusAsScala: Option[String] = Option(self.flowLogStatus)

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  final def trafficTypeAsScala: Option[TrafficType] = Option(self.trafficType)

  final def logDestinationTypeAsScala: Option[LogDestinationType] = Option(self.logDestinationType)

  final def logDestinationAsScala: Option[String] = Option(self.logDestination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFlowLogOps {

  implicit def toFlowLogBuilderOps(v: FlowLog.Builder): FlowLogBuilderOps = new FlowLogBuilderOps(v)

  implicit def toFlowLogOps(v: FlowLog): FlowLogOps = new FlowLogOps(v)

}
