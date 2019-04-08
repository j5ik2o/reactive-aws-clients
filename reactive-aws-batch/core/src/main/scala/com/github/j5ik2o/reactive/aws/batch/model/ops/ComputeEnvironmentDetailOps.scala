// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeEnvironmentDetailBuilderOps(val self: ComputeEnvironmentDetail.Builder) extends AnyVal {

  final def computeEnvironmentNameAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentName(v)
    }
  }

  final def computeEnvironmentArnAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentArn(v)
    }
  }

  final def ecsClusterArnAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.ecsClusterArn(v)
    }
  }

  final def typeAsScala(value: Option[CEType]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def stateAsScala(value: Option[CEState]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def statusAsScala(value: Option[CEStatus]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusReasonAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  final def computeResourcesAsScala(value: Option[ComputeResource]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.computeResources(v)
    }
  }

  final def serviceRoleAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.serviceRole(v)
    }
  }

}

final class ComputeEnvironmentDetailOps(val self: ComputeEnvironmentDetail) extends AnyVal {

  final def computeEnvironmentNameAsScala: Option[String] = Option(self.computeEnvironmentName)

  final def computeEnvironmentArnAsScala: Option[String] = Option(self.computeEnvironmentArn)

  final def ecsClusterArnAsScala: Option[String] = Option(self.ecsClusterArn)

  final def typeAsScala: Option[CEType] = Option(self.`type`)

  final def stateAsScala: Option[CEState] = Option(self.state)

  final def statusAsScala: Option[CEStatus] = Option(self.status)

  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  final def computeResourcesAsScala: Option[ComputeResource] = Option(self.computeResources)

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
