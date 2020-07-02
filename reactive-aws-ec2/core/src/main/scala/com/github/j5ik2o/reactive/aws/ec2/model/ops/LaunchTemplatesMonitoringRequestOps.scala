// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplatesMonitoringRequestBuilderOps(val self: LaunchTemplatesMonitoringRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): LaunchTemplatesMonitoringRequest.Builder = {
    value.fold(self) { v => self.enabled(v) }
  }

}

final class LaunchTemplatesMonitoringRequestOps(val self: LaunchTemplatesMonitoringRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplatesMonitoringRequestOps {

  implicit def toLaunchTemplatesMonitoringRequestBuilderOps(
      v: LaunchTemplatesMonitoringRequest.Builder
  ): LaunchTemplatesMonitoringRequestBuilderOps = new LaunchTemplatesMonitoringRequestBuilderOps(v)

  implicit def toLaunchTemplatesMonitoringRequestOps(
      v: LaunchTemplatesMonitoringRequest
  ): LaunchTemplatesMonitoringRequestOps = new LaunchTemplatesMonitoringRequestOps(v)

}
