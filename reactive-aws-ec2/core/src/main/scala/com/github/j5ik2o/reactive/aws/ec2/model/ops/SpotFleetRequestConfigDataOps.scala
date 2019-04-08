// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotFleetRequestConfigDataBuilderOps(val self: SpotFleetRequestConfigData.Builder) extends AnyVal {

  final def allocationStrategyAsScala(value: Option[AllocationStrategy]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.allocationStrategy(v)
    }
  }

  final def onDemandAllocationStrategyAsScala(
      value: Option[OnDemandAllocationStrategy]
  ): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.onDemandAllocationStrategy(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def excessCapacityTerminationPolicyAsScala(
      value: Option[ExcessCapacityTerminationPolicy]
  ): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.excessCapacityTerminationPolicy(v)
    }
  }

  final def fulfilledCapacityAsScala(value: Option[Double]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.fulfilledCapacity(v)
    }
  }

  final def onDemandFulfilledCapacityAsScala(value: Option[Double]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.onDemandFulfilledCapacity(v)
    }
  }

  final def iamFleetRoleAsScala(value: Option[String]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.iamFleetRole(v)
    }
  }

  final def launchSpecificationsAsScala(
      value: Option[Seq[SpotFleetLaunchSpecification]]
  ): SpotFleetRequestConfigData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.launchSpecifications(v.asJava)
    }
  }

  final def launchTemplateConfigsAsScala(
      value: Option[Seq[LaunchTemplateConfig]]
  ): SpotFleetRequestConfigData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.launchTemplateConfigs(v.asJava)
    }
  }

  final def spotPriceAsScala(value: Option[String]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  final def targetCapacityAsScala(value: Option[Int]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.targetCapacity(v)
    }
  }

  final def onDemandTargetCapacityAsScala(value: Option[Int]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.onDemandTargetCapacity(v)
    }
  }

  final def terminateInstancesWithExpirationAsScala(value: Option[Boolean]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.terminateInstancesWithExpiration(v)
    }
  }

  final def typeAsScala(value: Option[FleetType]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def validFromAsScala(value: Option[java.time.Instant]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.validFrom(v)
    }
  }

  final def validUntilAsScala(value: Option[java.time.Instant]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  final def replaceUnhealthyInstancesAsScala(value: Option[Boolean]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.replaceUnhealthyInstances(v)
    }
  }

  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

  final def loadBalancersConfigAsScala(value: Option[LoadBalancersConfig]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.loadBalancersConfig(v)
    }
  }

  final def instancePoolsToUseCountAsScala(value: Option[Int]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.instancePoolsToUseCount(v)
    }
  }

}

final class SpotFleetRequestConfigDataOps(val self: SpotFleetRequestConfigData) extends AnyVal {

  final def allocationStrategyAsScala: Option[AllocationStrategy] = Option(self.allocationStrategy)

  final def onDemandAllocationStrategyAsScala: Option[OnDemandAllocationStrategy] =
    Option(self.onDemandAllocationStrategy)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def excessCapacityTerminationPolicyAsScala: Option[ExcessCapacityTerminationPolicy] =
    Option(self.excessCapacityTerminationPolicy)

  final def fulfilledCapacityAsScala: Option[Double] = Option(self.fulfilledCapacity)

  final def onDemandFulfilledCapacityAsScala: Option[Double] = Option(self.onDemandFulfilledCapacity)

  final def iamFleetRoleAsScala: Option[String] = Option(self.iamFleetRole)

  final def launchSpecificationsAsScala: Option[Seq[SpotFleetLaunchSpecification]] =
    Option(self.launchSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def launchTemplateConfigsAsScala: Option[Seq[LaunchTemplateConfig]] = Option(self.launchTemplateConfigs).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  final def targetCapacityAsScala: Option[Int] = Option(self.targetCapacity)

  final def onDemandTargetCapacityAsScala: Option[Int] = Option(self.onDemandTargetCapacity)

  final def terminateInstancesWithExpirationAsScala: Option[Boolean] = Option(self.terminateInstancesWithExpiration)

  final def typeAsScala: Option[FleetType] = Option(self.`type`)

  final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom)

  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  final def replaceUnhealthyInstancesAsScala: Option[Boolean] = Option(self.replaceUnhealthyInstances)

  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

  final def loadBalancersConfigAsScala: Option[LoadBalancersConfig] = Option(self.loadBalancersConfig)

  final def instancePoolsToUseCountAsScala: Option[Int] = Option(self.instancePoolsToUseCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotFleetRequestConfigDataOps {

  implicit def toSpotFleetRequestConfigDataBuilderOps(
      v: SpotFleetRequestConfigData.Builder
  ): SpotFleetRequestConfigDataBuilderOps = new SpotFleetRequestConfigDataBuilderOps(v)

  implicit def toSpotFleetRequestConfigDataOps(v: SpotFleetRequestConfigData): SpotFleetRequestConfigDataOps =
    new SpotFleetRequestConfigDataOps(v)

}
