// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFleetRequestBuilderOps(val self: CreateFleetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotOptionsAsScala(value: Option[SpotOptionsRequest]): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.spotOptions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandOptionsAsScala(value: Option[OnDemandOptionsRequest]): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.onDemandOptions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excessCapacityTerminationPolicyAsScala(
      value: Option[FleetExcessCapacityTerminationPolicy]
  ): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.excessCapacityTerminationPolicy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateConfigsAsScala(
      value: Option[Seq[FleetLaunchTemplateConfigRequest]]
  ): CreateFleetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchTemplateConfigs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetCapacitySpecificationAsScala(
      value: Option[TargetCapacitySpecificationRequest]
  ): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.targetCapacitySpecification(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def terminateInstancesWithExpirationAsScala(value: Option[Boolean]): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.terminateInstancesWithExpiration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[FleetType]): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validFromAsScala(value: Option[java.time.Instant]): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.validFrom(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validUntilAsScala(value: Option[java.time.Instant]): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.validUntil(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replaceUnhealthyInstancesAsScala(value: Option[Boolean]): CreateFleetRequest.Builder = {
    value.fold(self) { v => self.replaceUnhealthyInstances(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateFleetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateFleetRequestOps(val self: CreateFleetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotOptionsAsScala: Option[SpotOptionsRequest] = Option(self.spotOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandOptionsAsScala: Option[OnDemandOptionsRequest] = Option(self.onDemandOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excessCapacityTerminationPolicyAsScala: Option[FleetExcessCapacityTerminationPolicy] =
    Option(self.excessCapacityTerminationPolicy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateConfigsAsScala: Option[Seq[FleetLaunchTemplateConfigRequest]] =
    Option(self.launchTemplateConfigs).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetCapacitySpecificationAsScala: Option[TargetCapacitySpecificationRequest] =
    Option(self.targetCapacitySpecification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def terminateInstancesWithExpirationAsScala: Option[Boolean] = Option(self.terminateInstancesWithExpiration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[FleetType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replaceUnhealthyInstancesAsScala: Option[Boolean] = Option(self.replaceUnhealthyInstances)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFleetRequestOps {

  implicit def toCreateFleetRequestBuilderOps(v: CreateFleetRequest.Builder): CreateFleetRequestBuilderOps =
    new CreateFleetRequestBuilderOps(v)

  implicit def toCreateFleetRequestOps(v: CreateFleetRequest): CreateFleetRequestOps = new CreateFleetRequestOps(v)

}
