// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFleetRequestBuilderOps(val self: CreateFleetRequest.Builder) extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def spotOptionsAsScala(value: Option[SpotOptionsRequest]): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.spotOptions(v)
    }
  }

  final def onDemandOptionsAsScala(value: Option[OnDemandOptionsRequest]): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.onDemandOptions(v)
    }
  }

  final def excessCapacityTerminationPolicyAsScala(
      value: Option[FleetExcessCapacityTerminationPolicy]
  ): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.excessCapacityTerminationPolicy(v)
    }
  }

  final def launchTemplateConfigsAsScala(
      value: Option[Seq[FleetLaunchTemplateConfigRequest]]
  ): CreateFleetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.launchTemplateConfigs(v.asJava)
    }
  }

  final def targetCapacitySpecificationAsScala(
      value: Option[TargetCapacitySpecificationRequest]
  ): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.targetCapacitySpecification(v)
    }
  }

  final def terminateInstancesWithExpirationAsScala(value: Option[Boolean]): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.terminateInstancesWithExpiration(v)
    }
  }

  final def typeAsScala(value: Option[FleetType]): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def validFromAsScala(value: Option[java.time.Instant]): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.validFrom(v)
    }
  }

  final def validUntilAsScala(value: Option[java.time.Instant]): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  final def replaceUnhealthyInstancesAsScala(value: Option[Boolean]): CreateFleetRequest.Builder = {
    value.fold(self) { v =>
      self.replaceUnhealthyInstances(v)
    }
  }

  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateFleetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateFleetRequestOps(val self: CreateFleetRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def spotOptionsAsScala: Option[SpotOptionsRequest] = Option(self.spotOptions)

  final def onDemandOptionsAsScala: Option[OnDemandOptionsRequest] = Option(self.onDemandOptions)

  final def excessCapacityTerminationPolicyAsScala: Option[FleetExcessCapacityTerminationPolicy] =
    Option(self.excessCapacityTerminationPolicy)

  final def launchTemplateConfigsAsScala: Option[Seq[FleetLaunchTemplateConfigRequest]] =
    Option(self.launchTemplateConfigs).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def targetCapacitySpecificationAsScala: Option[TargetCapacitySpecificationRequest] =
    Option(self.targetCapacitySpecification)

  final def terminateInstancesWithExpirationAsScala: Option[Boolean] = Option(self.terminateInstancesWithExpiration)

  final def typeAsScala: Option[FleetType] = Option(self.`type`)

  final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom)

  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  final def replaceUnhealthyInstancesAsScala: Option[Boolean] = Option(self.replaceUnhealthyInstances)

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFleetRequestOps {

  implicit def toCreateFleetRequestBuilderOps(v: CreateFleetRequest.Builder): CreateFleetRequestBuilderOps =
    new CreateFleetRequestBuilderOps(v)

  implicit def toCreateFleetRequestOps(v: CreateFleetRequest): CreateFleetRequestOps = new CreateFleetRequestOps(v)

}
