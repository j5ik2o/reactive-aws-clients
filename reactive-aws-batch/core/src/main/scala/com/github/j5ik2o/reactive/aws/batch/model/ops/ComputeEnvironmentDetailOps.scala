// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeEnvironmentDetailBuilderOps(val self: ComputeEnvironmentDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentNameAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.computeEnvironmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentArnAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.computeEnvironmentArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ecsClusterArnAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.ecsClusterArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[CEType]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[CEState]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[CEStatus]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.statusReason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeResourcesAsScala(value: Option[ComputeResource]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.computeResources(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRoleAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v => self.serviceRole(v) }
  }

}

final class ComputeEnvironmentDetailOps(val self: ComputeEnvironmentDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentNameAsScala: Option[String] = Option(self.computeEnvironmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentArnAsScala: Option[String] = Option(self.computeEnvironmentArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ecsClusterArnAsScala: Option[String] = Option(self.ecsClusterArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[CEType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[CEState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[CEStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeResourcesAsScala: Option[ComputeResource] = Option(self.computeResources)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRoleAsScala: Option[String] = Option(self.serviceRole)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComputeEnvironmentDetailOps {

  implicit def toComputeEnvironmentDetailBuilderOps(
      v: ComputeEnvironmentDetail.Builder
  ): ComputeEnvironmentDetailBuilderOps = new ComputeEnvironmentDetailBuilderOps(v)

  implicit def toComputeEnvironmentDetailOps(v: ComputeEnvironmentDetail): ComputeEnvironmentDetailOps =
    new ComputeEnvironmentDetailOps(v)

}
