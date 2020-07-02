// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceDetailBuilderOps(val self: StackResourceDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.stackId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.logicalResourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.physicalResourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimestampAsScala(value: Option[java.time.Instant]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.lastUpdatedTimestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.resourceStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusReasonAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.resourceStatusReason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metadataAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.metadata(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala(value: Option[StackResourceDriftInformation]): StackResourceDetail.Builder = {
    value.fold(self) { v => self.driftInformation(v) }
  }

}

final class StackResourceDetailOps(val self: StackResourceDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimestampAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metadataAsScala: Option[String] = Option(self.metadata)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala: Option[StackResourceDriftInformation] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceDetailOps {

  implicit def toStackResourceDetailBuilderOps(v: StackResourceDetail.Builder): StackResourceDetailBuilderOps =
    new StackResourceDetailBuilderOps(v)

  implicit def toStackResourceDetailOps(v: StackResourceDetail): StackResourceDetailOps = new StackResourceDetailOps(v)

}
