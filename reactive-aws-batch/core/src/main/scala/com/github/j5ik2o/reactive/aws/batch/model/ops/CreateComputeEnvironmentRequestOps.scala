// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CreateComputeEnvironmentRequestBuilderOps(val self: CreateComputeEnvironmentRequest.Builder)
    extends AnyVal {

  final def computeEnvironmentNameAsScala(value: Option[String]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentName(v)
    }
  }

  final def typeAsScala(value: Option[CEType]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def stateAsScala(value: Option[CEState]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def computeResourcesAsScala(value: Option[ComputeResource]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeResources(v)
    }
  }

  final def serviceRoleAsScala(value: Option[String]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.serviceRole(v)
    }
  }

}

final class CreateComputeEnvironmentRequestOps(val self: CreateComputeEnvironmentRequest) extends AnyVal {

  final def computeEnvironmentNameAsScala: Option[String] = Option(self.computeEnvironmentName)

  final def typeAsScala: Option[CEType] = Option(self.`type`)

  final def stateAsScala: Option[CEState] = Option(self.state)

  final def computeResourcesAsScala: Option[ComputeResource] = Option(self.computeResources)

  final def serviceRoleAsScala: Option[String] = Option(self.serviceRole)

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
