// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceBuilderOps(val self: StackResource.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v => self.stackId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v => self.logicalResourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v => self.physicalResourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): StackResource.Builder = {
    value.fold(self) { v => self.timestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackResource.Builder = {
    value.fold(self) { v => self.resourceStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusReasonAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v => self.resourceStatusReason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala(value: Option[StackResourceDriftInformation]): StackResource.Builder = {
    value.fold(self) { v => self.driftInformation(v) }
  }

}

final class StackResourceOps(val self: StackResource) extends AnyVal {

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
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala: Option[StackResourceDriftInformation] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceOps {

  implicit def toStackResourceBuilderOps(v: StackResource.Builder): StackResourceBuilderOps =
    new StackResourceBuilderOps(v)

  implicit def toStackResourceOps(v: StackResource): StackResourceOps = new StackResourceOps(v)

}
