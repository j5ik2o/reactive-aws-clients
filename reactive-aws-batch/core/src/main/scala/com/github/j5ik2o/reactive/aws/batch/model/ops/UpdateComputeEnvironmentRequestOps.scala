// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class UpdateComputeEnvironmentRequestBuilderOps(val self: UpdateComputeEnvironmentRequest.Builder)
    extends AnyVal {

  final def computeEnvironmentAsScala(value: Option[String]): UpdateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeEnvironment(v)
    }
  } // String

  final def stateAsScala(value: Option[CEState]): UpdateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // CEState

  final def computeResourcesAsScala(value: Option[ComputeResourceUpdate]): UpdateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeResources(v)
    }
  } // ComputeResourceUpdate

  final def serviceRoleAsScala(value: Option[String]): UpdateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.serviceRole(v)
    }
  } // String

}

final class UpdateComputeEnvironmentRequestOps(val self: UpdateComputeEnvironmentRequest) extends AnyVal {

  final def computeEnvironmentAsScala: Option[String] = Option(self.computeEnvironment) // String

  final def stateAsScala: Option[CEState] = Option(self.state) // CEState

  final def computeResourcesAsScala: Option[ComputeResourceUpdate] =
    Option(self.computeResources) // ComputeResourceUpdate

  final def serviceRoleAsScala: Option[String] = Option(self.serviceRole) // String

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
