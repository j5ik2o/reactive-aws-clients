// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateInstanceMarketOptionsRequestBuilderOps(
    val self: LaunchTemplateInstanceMarketOptionsRequest.Builder
) extends AnyVal {

  final def marketTypeAsScala(value: Option[MarketType]): LaunchTemplateInstanceMarketOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.marketType(v)
    }
  }

  final def spotOptionsAsScala(
      value: Option[LaunchTemplateSpotMarketOptionsRequest]
  ): LaunchTemplateInstanceMarketOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.spotOptions(v)
    }
  }

}

final class LaunchTemplateInstanceMarketOptionsRequestOps(val self: LaunchTemplateInstanceMarketOptionsRequest)
    extends AnyVal {

  final def marketTypeAsScala: Option[MarketType] = Option(self.marketType)

  final def spotOptionsAsScala: Option[LaunchTemplateSpotMarketOptionsRequest] = Option(self.spotOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateInstanceMarketOptionsRequestOps {

  implicit def toLaunchTemplateInstanceMarketOptionsRequestBuilderOps(
      v: LaunchTemplateInstanceMarketOptionsRequest.Builder
  ): LaunchTemplateInstanceMarketOptionsRequestBuilderOps = new LaunchTemplateInstanceMarketOptionsRequestBuilderOps(v)

  implicit def toLaunchTemplateInstanceMarketOptionsRequestOps(
      v: LaunchTemplateInstanceMarketOptionsRequest
  ): LaunchTemplateInstanceMarketOptionsRequestOps = new LaunchTemplateInstanceMarketOptionsRequestOps(v)

}
