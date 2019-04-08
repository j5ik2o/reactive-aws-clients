// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CreateComputeEnvironmentRequestBuilderOps(val self: CreateComputeEnvironmentRequest.Builder)
    extends AnyVal {

  final def computeEnvironmentNameAsScala(value: Option[String]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentName(v)
    }
  } // String

  final def typeAsScala(value: Option[CEType]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // CEType

  final def stateAsScala(value: Option[CEState]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // CEState

  final def computeResourcesAsScala(value: Option[ComputeResource]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeResources(v)
    }
  } // ComputeResource

  final def serviceRoleAsScala(value: Option[String]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.serviceRole(v)
    }
  } // String

}

final class CreateComputeEnvironmentRequestOps(val self: CreateComputeEnvironmentRequest) extends AnyVal {

  final def computeEnvironmentNameAsScala: Option[String] = Option(self.computeEnvironmentName) // String

  final def typeAsScala: Option[CEType] = Option(self.`type`) // CEType

  final def stateAsScala: Option[CEState] = Option(self.state) // CEState

  final def computeResourcesAsScala: Option[ComputeResource] = Option(self.computeResources) // ComputeResource

  final def serviceRoleAsScala: Option[String] = Option(self.serviceRole) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateComputeEnvironmentRequestOps {

  implicit def toCreateComputeEnvironmentRequestBuilderOps(
      v: CreateComputeEnvironmentRequest.Builder
  ): CreateComputeEnvironmentRequestBuilderOps = new CreateComputeEnvironmentRequestBuilderOps(v)

  implicit def toCreateComputeEnvironmentRequestOps(
      v: CreateComputeEnvironmentRequest
  ): CreateComputeEnvironmentRequestOps = new CreateComputeEnvironmentRequestOps(v)

}
