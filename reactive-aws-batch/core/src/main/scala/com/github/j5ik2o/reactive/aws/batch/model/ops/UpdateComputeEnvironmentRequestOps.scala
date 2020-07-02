// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class UpdateComputeEnvironmentRequestBuilderOps(val self: UpdateComputeEnvironmentRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentAsScala(value: Option[String]): UpdateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v => self.computeEnvironment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[CEState]): UpdateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeResourcesAsScala(value: Option[ComputeResourceUpdate]): UpdateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v => self.computeResources(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRoleAsScala(value: Option[String]): UpdateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v => self.serviceRole(v) }
  }

}

final class UpdateComputeEnvironmentRequestOps(val self: UpdateComputeEnvironmentRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentAsScala: Option[String] = Option(self.computeEnvironment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[CEState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeResourcesAsScala: Option[ComputeResourceUpdate] = Option(self.computeResources)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRoleAsScala: Option[String] = Option(self.serviceRole)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateComputeEnvironmentRequestOps {

  implicit def toUpdateComputeEnvironmentRequestBuilderOps(
      v: UpdateComputeEnvironmentRequest.Builder
  ): UpdateComputeEnvironmentRequestBuilderOps = new UpdateComputeEnvironmentRequestBuilderOps(v)

  implicit def toUpdateComputeEnvironmentRequestOps(
      v: UpdateComputeEnvironmentRequest
  ): UpdateComputeEnvironmentRequestOps = new UpdateComputeEnvironmentRequestOps(v)

}
