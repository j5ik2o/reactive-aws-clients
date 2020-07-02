// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetSummaryBuilderOps(val self: StackSetSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): StackSetSummary.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetIdAsScala(value: Option[String]): StackSetSummary.Builder = {
    value.fold(self) { v => self.stackSetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): StackSetSummary.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[StackSetStatus]): StackSetSummary.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoDeploymentAsScala(value: Option[AutoDeployment]): StackSetSummary.Builder = {
    value.fold(self) { v => self.autoDeployment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionModelAsScala(value: Option[PermissionModels]): StackSetSummary.Builder = {
    value.fold(self) { v => self.permissionModel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftStatusAsScala(value: Option[StackDriftStatus]): StackSetSummary.Builder = {
    value.fold(self) { v => self.driftStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastDriftCheckTimestampAsScala(value: Option[java.time.Instant]): StackSetSummary.Builder = {
    value.fold(self) { v => self.lastDriftCheckTimestamp(v) }
  }

}

final class StackSetSummaryOps(val self: StackSetSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[StackSetStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoDeploymentAsScala: Option[AutoDeployment] = Option(self.autoDeployment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionModelAsScala: Option[PermissionModels] = Option(self.permissionModel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftStatusAsScala: Option[StackDriftStatus] = Option(self.driftStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastDriftCheckTimestampAsScala: Option[java.time.Instant] = Option(self.lastDriftCheckTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetSummaryOps {

  implicit def toStackSetSummaryBuilderOps(v: StackSetSummary.Builder): StackSetSummaryBuilderOps =
    new StackSetSummaryBuilderOps(v)

  implicit def toStackSetSummaryOps(v: StackSetSummary): StackSetSummaryOps = new StackSetSummaryOps(v)

}
