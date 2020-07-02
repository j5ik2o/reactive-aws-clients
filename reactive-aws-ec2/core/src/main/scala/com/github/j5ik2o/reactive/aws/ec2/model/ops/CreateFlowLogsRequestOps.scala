// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFlowLogsRequestBuilderOps(val self: CreateFlowLogsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deliverLogsPermissionArnAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.deliverLogsPermissionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdsAsScala(value: Option[Seq[String]]): CreateFlowLogsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[FlowLogsResourceType]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficTypeAsScala(value: Option[TrafficType]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.trafficType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logDestinationTypeAsScala(value: Option[LogDestinationType]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.logDestinationType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logDestinationAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.logDestination(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logFormatAsScala(value: Option[String]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.logFormat(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateFlowLogsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxAggregationIntervalAsScala(value: Option[Int]): CreateFlowLogsRequest.Builder = {
    value.fold(self) { v => self.maxAggregationInterval(v) }
  }

}

final class CreateFlowLogsRequestOps(val self: CreateFlowLogsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deliverLogsPermissionArnAsScala: Option[String] = Option(self.deliverLogsPermissionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdsAsScala: Option[Seq[String]] =
    Option(self.resourceIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[FlowLogsResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficTypeAsScala: Option[TrafficType] = Option(self.trafficType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logDestinationTypeAsScala: Option[LogDestinationType] = Option(self.logDestinationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logDestinationAsScala: Option[String] = Option(self.logDestination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logFormatAsScala: Option[String] = Option(self.logFormat)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxAggregationIntervalAsScala: Option[Int] = Option(self.maxAggregationInterval)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFlowLogsRequestOps {

  implicit def toCreateFlowLogsRequestBuilderOps(v: CreateFlowLogsRequest.Builder): CreateFlowLogsRequestBuilderOps =
    new CreateFlowLogsRequestBuilderOps(v)

  implicit def toCreateFlowLogsRequestOps(v: CreateFlowLogsRequest): CreateFlowLogsRequestOps =
    new CreateFlowLogsRequestOps(v)

}
