// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FlowLogBuilderOps(val self: FlowLog.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[java.time.Instant]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deliverLogsErrorMessageAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.deliverLogsErrorMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deliverLogsPermissionArnAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.deliverLogsPermissionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deliverLogsStatusAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.deliverLogsStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def flowLogIdAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.flowLogId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def flowLogStatusAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.flowLogStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficTypeAsScala(value: Option[TrafficType]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.trafficType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logDestinationTypeAsScala(value: Option[LogDestinationType]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.logDestinationType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logDestinationAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.logDestination(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logFormatAsScala(value: Option[String]): FlowLog.Builder = {
    value.fold(self) { v =>
      self.logFormat(v)
    }
  }

}

final class FlowLogOps(val self: FlowLog) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deliverLogsErrorMessageAsScala: Option[String] = Option(self.deliverLogsErrorMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deliverLogsPermissionArnAsScala: Option[String] = Option(self.deliverLogsPermissionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deliverLogsStatusAsScala: Option[String] = Option(self.deliverLogsStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def flowLogIdAsScala: Option[String] = Option(self.flowLogId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def flowLogStatusAsScala: Option[String] = Option(self.flowLogStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficTypeAsScala: Option[TrafficType] = Option(self.trafficType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logDestinationTypeAsScala: Option[LogDestinationType] = Option(self.logDestinationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logDestinationAsScala: Option[String] = Option(self.logDestination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logFormatAsScala: Option[String] = Option(self.logFormat)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFlowLogOps {

  implicit def toFlowLogBuilderOps(v: FlowLog.Builder): FlowLogBuilderOps = new FlowLogBuilderOps(v)

  implicit def toFlowLogOps(v: FlowLog): FlowLogOps = new FlowLogOps(v)

}
