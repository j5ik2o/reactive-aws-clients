// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetDataBuilderOps(val self: FleetData.Builder) extends AnyVal {

  final def activityStatusAsScala(value: Option[FleetActivityStatus]): FleetData.Builder = {
    value.fold(self) { v =>
      self.activityStatus(v)
    }
  }

  final def createTimeAsScala(value: Option[java.time.Instant]): FleetData.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  final def fleetIdAsScala(value: Option[String]): FleetData.Builder = {
    value.fold(self) { v =>
      self.fleetId(v)
    }
  }

  final def fleetStateAsScala(value: Option[FleetStateCode]): FleetData.Builder = {
    value.fold(self) { v =>
      self.fleetState(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): FleetData.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def excessCapacityTerminationPolicyAsScala(
      value: Option[FleetExcessCapacityTerminationPolicy]
  ): FleetData.Builder = {
    value.fold(self) { v =>
      self.excessCapacityTerminationPolicy(v)
    }
  }

  final def fulfilledCapacityAsScala(value: Option[Double]): FleetData.Builder = {
    value.fold(self) { v =>
      self.fulfilledCapacity(v)
    }
  }

  final def fulfilledOnDemandCapacityAsScala(value: Option[Double]): FleetData.Builder = {
    value.fold(self) { v =>
      self.fulfilledOnDemandCapacity(v)
    }
  }

  final def launchTemplateConfigsAsScala(value: Option[Seq[FleetLaunchTemplateConfig]]): FleetData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.launchTemplateConfigs(v.asJava)
    }
  }

  final def targetCapacitySpecificationAsScala(value: Option[TargetCapacitySpecification]): FleetData.Builder = {
    value.fold(self) { v =>
      self.targetCapacitySpecification(v)
    }
  }

  final def terminateInstancesWithExpirationAsScala(value: Option[Boolean]): FleetData.Builder = {
    value.fold(self) { v =>
      self.terminateInstancesWithExpiration(v)
    }
  }

  final def typeAsScala(value: Option[FleetType]): FleetData.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def validFromAsScala(value: Option[java.time.Instant]): FleetData.Builder = {
    value.fold(self) { v =>
      self.validFrom(v)
    }
  }

  final def validUntilAsScala(value: Option[java.time.Instant]): FleetData.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  final def replaceUnhealthyInstancesAsScala(value: Option[Boolean]): FleetData.Builder = {
    value.fold(self) { v =>
      self.replaceUnhealthyInstances(v)
    }
  }

  final def spotOptionsAsScala(value: Option[SpotOptions]): FleetData.Builder = {
    value.fold(self) { v =>
      self.spotOptions(v)
    }
  }

  final def onDemandOptionsAsScala(value: Option[OnDemandOptions]): FleetData.Builder = {
    value.fold(self) { v =>
      self.onDemandOptions(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): FleetData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def errorsAsScala(value: Option[Seq[DescribeFleetError]]): FleetData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.errors(v.asJava)
    }
  }

  final def instancesAsScala(value: Option[Seq[DescribeFleetsInstances]]): FleetData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instances(v.asJava)
    }
  }

}

final class FleetDataOps(val self: FleetData) extends AnyVal {

  final def activityStatusAsScala: Option[FleetActivityStatus] = Option(self.activityStatus)

  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  final def fleetIdAsScala: Option[String] = Option(self.fleetId)

  final def fleetStateAsScala: Option[FleetStateCode] = Option(self.fleetState)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def excessCapacityTerminationPolicyAsScala: Option[FleetExcessCapacityTerminationPolicy] =
    Option(self.excessCapacityTerminationPolicy)

  final def fulfilledCapacityAsScala: Option[Double] = Option(self.fulfilledCapacity)

  final def fulfilledOnDemandCapacityAsScala: Option[Double] = Option(self.fulfilledOnDemandCapacity)

  final def launchTemplateConfigsAsScala: Option[Seq[FleetLaunchTemplateConfig]] =
    Option(self.launchTemplateConfigs).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def targetCapacitySpecificationAsScala: Option[TargetCapacitySpecification] =
    Option(self.targetCapacitySpecification)

  final def terminateInstancesWithExpirationAsScala: Option[Boolean] = Option(self.terminateInstancesWithExpiration)

  final def typeAsScala: Option[FleetType] = Option(self.`type`)

  final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom)

  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  final def replaceUnhealthyInstancesAsScala: Option[Boolean] = Option(self.replaceUnhealthyInstances)

  final def spotOptionsAsScala: Option[SpotOptions] = Option(self.spotOptions)

  final def onDemandOptionsAsScala: Option[OnDemandOptions] = Option(self.onDemandOptions)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def errorsAsScala: Option[Seq[DescribeFleetError]] = Option(self.errors).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instancesAsScala: Option[Seq[DescribeFleetsInstances]] = Option(self.instances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetDataOps {

  implicit def toFleetDataBuilderOps(v: FleetData.Builder): FleetDataBuilderOps = new FleetDataBuilderOps(v)

  implicit def toFleetDataOps(v: FleetData): FleetDataOps = new FleetDataOps(v)

}
