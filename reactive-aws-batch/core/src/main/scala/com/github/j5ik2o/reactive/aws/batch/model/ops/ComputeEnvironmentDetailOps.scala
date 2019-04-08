// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeEnvironmentDetailBuilderOps(val self: ComputeEnvironmentDetail.Builder) extends AnyVal {

  final def computeEnvironmentNameAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentName(v)
    }
  } // String

  final def computeEnvironmentArnAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentArn(v)
    }
  } // String

  final def ecsClusterArnAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.ecsClusterArn(v)
    }
  } // String

  final def typeAsScala(value: Option[CEType]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // String

  final def stateAsScala(value: Option[CEState]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // String

  final def statusAsScala(value: Option[CEStatus]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def statusReasonAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  } // String

  final def computeResourcesAsScala(value: Option[ComputeResource]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.computeResources(v)
    }
  } // ComputeResource

  final def serviceRoleAsScala(value: Option[String]): ComputeEnvironmentDetail.Builder = {
    value.fold(self) { v =>
      self.serviceRole(v)
    }
  } // String

}

final class ComputeEnvironmentDetailOps(val self: ComputeEnvironmentDetail) extends AnyVal {

  final def computeEnvironmentNameAsScala: Option[String] = Option(self.computeEnvironmentName) // String

  final def computeEnvironmentArnAsScala: Option[String] = Option(self.computeEnvironmentArn) // String

  final def ecsClusterArnAsScala: Option[String] = Option(self.ecsClusterArn) // String

  final def typeAsScala: Option[CEType] = Option(self.`type`) // String

  final def stateAsScala: Option[CEState] = Option(self.state) // String

  final def statusAsScala: Option[CEStatus] = Option(self.status) // String

  final def statusReasonAsScala: Option[String] = Option(self.statusReason) // String

  final def computeResourcesAsScala: Option[ComputeResource] = Option(self.computeResources) // ComputeResource

  final def serviceRoleAsScala: Option[String] = Option(self.serviceRole) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComputeEnvironmentDetailOps {

  implicit def toComputeEnvironmentDetailBuilderOps(
      v: ComputeEnvironmentDetail.Builder
  ): ComputeEnvironmentDetailBuilderOps = new ComputeEnvironmentDetailBuilderOps(v)

  implicit def toComputeEnvironmentDetailOps(v: ComputeEnvironmentDetail): ComputeEnvironmentDetailOps =
    new ComputeEnvironmentDetailOps(v)

}
