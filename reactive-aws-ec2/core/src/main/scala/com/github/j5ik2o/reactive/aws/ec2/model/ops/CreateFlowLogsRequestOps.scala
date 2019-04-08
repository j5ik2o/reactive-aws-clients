// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFlowLogsRequestBuilderOps(val self: CreateFlowLogsRequest.Builder) extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def deliverLogsPermissionArnAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.deliverLogsPermissionArn(v)
    }
  }

  final def logGroupNameAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def resourceIdsAsScala(value: Option[Seq[String]]): CreateFlowLogsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceIds(v.asJava)
    }
  }

  final def resourceTypeAsScala(value: Option[FlowLogsResourceType]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def trafficTypeAsScala(value: Option[TrafficType]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.trafficType(v)
    }
  }

  final def logDestinationTypeAsScala(value: Option[LogDestinationType]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.logDestinationType(v)
    }
  }

  final def logDestinationAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.logDestination(v)
    }
  }

}

final class CreateFlowLogsRequestOps(val self: CreateFlowLogsRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def deliverLogsPermissionArnAsScala: Option[String] = Option(self.deliverLogsPermissionArn)

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def resourceIdsAsScala: Option[Seq[String]] = Option(self.resourceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def resourceTypeAsScala: Option[FlowLogsResourceType] = Option(self.resourceType)

  final def trafficTypeAsScala: Option[TrafficType] = Option(self.trafficType)

  final def logDestinationTypeAsScala: Option[LogDestinationType] = Option(self.logDestinationType)

  final def logDestinationAsScala: Option[String] = Option(self.logDestination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFlowLogsRequestOps {

  implicit def toCreateFlowLogsRequestBuilderOps(v: CreateFlowLogsRequest.Builder): CreateFlowLogsRequestBuilderOps =
    new CreateFlowLogsRequestBuilderOps(v)

  implicit def toCreateFlowLogsRequestOps(v: CreateFlowLogsRequest): CreateFlowLogsRequestOps =
    new CreateFlowLogsRequestOps(v)

}
