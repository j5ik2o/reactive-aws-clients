// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateInstanceMarketOptionsBuilderOps(val self: LaunchTemplateInstanceMarketOptions.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def marketTypeAsScala(value: Option[MarketType]): LaunchTemplateInstanceMarketOptions.Builder = {
    value.fold(self) { v => self.marketType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotOptionsAsScala(
      value: Option[LaunchTemplateSpotMarketOptions]
  ): LaunchTemplateInstanceMarketOptions.Builder = {
    value.fold(self) { v => self.spotOptions(v) }
  }

}

final class LaunchTemplateInstanceMarketOptionsOps(val self: LaunchTemplateInstanceMarketOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def marketTypeAsScala: Option[MarketType] = Option(self.marketType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotOptionsAsScala: Option[LaunchTemplateSpotMarketOptions] = Option(self.spotOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateInstanceMarketOptionsOps {

  implicit def toLaunchTemplateInstanceMarketOptionsBuilderOps(
      v: LaunchTemplateInstanceMarketOptions.Builder
  ): LaunchTemplateInstanceMarketOptionsBuilderOps = new LaunchTemplateInstanceMarketOptionsBuilderOps(v)

  implicit def toLaunchTemplateInstanceMarketOptionsOps(
      v: LaunchTemplateInstanceMarketOptions
  ): LaunchTemplateInstanceMarketOptionsOps = new LaunchTemplateInstanceMarketOptionsOps(v)

}
