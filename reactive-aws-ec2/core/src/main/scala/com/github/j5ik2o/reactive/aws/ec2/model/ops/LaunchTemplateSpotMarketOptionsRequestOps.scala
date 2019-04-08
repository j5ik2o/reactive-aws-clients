// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateSpotMarketOptionsRequestBuilderOps(val self: LaunchTemplateSpotMarketOptionsRequest.Builder)
    extends AnyVal {

  final def maxPriceAsScala(value: Option[String]): LaunchTemplateSpotMarketOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxPrice(v)
    }
  }

  final def spotInstanceTypeAsScala(value: Option[SpotInstanceType]): LaunchTemplateSpotMarketOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.spotInstanceType(v)
    }
  }

  final def blockDurationMinutesAsScala(value: Option[Int]): LaunchTemplateSpotMarketOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.blockDurationMinutes(v)
    }
  }

  final def validUntilAsScala(value: Option[java.time.Instant]): LaunchTemplateSpotMarketOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): LaunchTemplateSpotMarketOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

}

final class LaunchTemplateSpotMarketOptionsRequestOps(val self: LaunchTemplateSpotMarketOptionsRequest) extends AnyVal {

  final def maxPriceAsScala: Option[String] = Option(self.maxPrice)

  final def spotInstanceTypeAsScala: Option[SpotInstanceType] = Option(self.spotInstanceType)

  final def blockDurationMinutesAsScala: Option[Int] = Option(self.blockDurationMinutes)

  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateSpotMarketOptionsRequestOps {

  implicit def toLaunchTemplateSpotMarketOptionsRequestBuilderOps(
      v: LaunchTemplateSpotMarketOptionsRequest.Builder
  ): LaunchTemplateSpotMarketOptionsRequestBuilderOps = new LaunchTemplateSpotMarketOptionsRequestBuilderOps(v)

  implicit def toLaunchTemplateSpotMarketOptionsRequestOps(
      v: LaunchTemplateSpotMarketOptionsRequest
  ): LaunchTemplateSpotMarketOptionsRequestOps = new LaunchTemplateSpotMarketOptionsRequestOps(v)

}
