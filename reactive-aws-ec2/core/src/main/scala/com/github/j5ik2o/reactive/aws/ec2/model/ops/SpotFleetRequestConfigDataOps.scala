// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotFleetRequestConfigDataBuilderOps(val self: SpotFleetRequestConfigData.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala(value: Option[AllocationStrategy]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.allocationStrategy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandAllocationStrategyAsScala(
      value: Option[OnDemandAllocationStrategy]
  ): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.onDemandAllocationStrategy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excessCapacityTerminationPolicyAsScala(
      value: Option[ExcessCapacityTerminationPolicy]
  ): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.excessCapacityTerminationPolicy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fulfilledCapacityAsScala(value: Option[Double]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.fulfilledCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandFulfilledCapacityAsScala(value: Option[Double]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.onDemandFulfilledCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamFleetRoleAsScala(value: Option[String]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.iamFleetRole(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchSpecificationsAsScala(
      value: Option[Seq[SpotFleetLaunchSpecification]]
  ): SpotFleetRequestConfigData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateConfigsAsScala(
      value: Option[Seq[LaunchTemplateConfig]]
  ): SpotFleetRequestConfigData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchTemplateConfigs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceAsScala(value: Option[String]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetCapacityAsScala(value: Option[Int]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.targetCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandTargetCapacityAsScala(value: Option[Int]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.onDemandTargetCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def terminateInstancesWithExpirationAsScala(value: Option[Boolean]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.terminateInstancesWithExpiration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[FleetType]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validFromAsScala(value: Option[java.time.Instant]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.validFrom(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validUntilAsScala(value: Option[java.time.Instant]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replaceUnhealthyInstancesAsScala(value: Option[Boolean]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.replaceUnhealthyInstances(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersConfigAsScala(value: Option[LoadBalancersConfig]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.loadBalancersConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancePoolsToUseCountAsScala(value: Option[Int]): SpotFleetRequestConfigData.Builder = {
    value.fold(self) { v =>
      self.instancePoolsToUseCount(v)
    }
  }

}

final class SpotFleetRequestConfigDataOps(val self: SpotFleetRequestConfigData) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala: Option[AllocationStrategy] = Option(self.allocationStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandAllocationStrategyAsScala: Option[OnDemandAllocationStrategy] =
    Option(self.onDemandAllocationStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excessCapacityTerminationPolicyAsScala: Option[ExcessCapacityTerminationPolicy] =
    Option(self.excessCapacityTerminationPolicy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fulfilledCapacityAsScala: Option[Double] = Option(self.fulfilledCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandFulfilledCapacityAsScala: Option[Double] = Option(self.onDemandFulfilledCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamFleetRoleAsScala: Option[String] = Option(self.iamFleetRole)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchSpecificationsAsScala: Option[Seq[SpotFleetLaunchSpecification]] =
    Option(self.launchSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateConfigsAsScala: Option[Seq[LaunchTemplateConfig]] = Option(self.launchTemplateConfigs).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetCapacityAsScala: Option[Int] = Option(self.targetCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandTargetCapacityAsScala: Option[Int] = Option(self.onDemandTargetCapacity)

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
  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersConfigAsScala: Option[LoadBalancersConfig] = Option(self.loadBalancersConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
