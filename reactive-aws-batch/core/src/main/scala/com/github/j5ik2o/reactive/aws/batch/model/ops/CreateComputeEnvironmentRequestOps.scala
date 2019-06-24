// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CreateComputeEnvironmentRequestBuilderOps(val self: CreateComputeEnvironmentRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentNameAsScala(value: Option[String]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[CEType]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[CEState]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeResourcesAsScala(value: Option[ComputeResource]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeResources(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRoleAsScala(value: Option[String]): CreateComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.serviceRole(v)
    }
  }

}

final class CreateComputeEnvironmentRequestOps(val self: CreateComputeEnvironmentRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentNameAsScala: Option[String] = Option(self.computeEnvironmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[CEType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[CEState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeResourcesAsScala: Option[ComputeResource] = Option(self.computeResources)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
