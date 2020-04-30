// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplatesMonitoringBuilderOps(val self: LaunchTemplatesMonitoring.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enabledAsScala(value: Option[Boolean]): LaunchTemplatesMonitoring.Builder = {
            value.fold(self){ v => self.enabled(v) }
            } 


}

final class LaunchTemplatesMonitoringOps(val self: LaunchTemplatesMonitoring) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enabledAsScala: Option[Boolean] = Option(self.enabled) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplatesMonitoringOps {

implicit def toLaunchTemplatesMonitoringBuilderOps(v: LaunchTemplatesMonitoring.Builder): LaunchTemplatesMonitoringBuilderOps = new LaunchTemplatesMonitoringBuilderOps(v)

implicit def toLaunchTemplatesMonitoringOps(v: LaunchTemplatesMonitoring): LaunchTemplatesMonitoringOps = new LaunchTemplatesMonitoringOps(v)

}

