// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class AutoScalingGroupProviderBuilderOps(val self: AutoScalingGroupProvider.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupArnAsScala(value: Option[String]): AutoScalingGroupProvider.Builder = {
    value.fold(self) { v => self.autoScalingGroupArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managedScalingAsScala(value: Option[ManagedScaling]): AutoScalingGroupProvider.Builder = {
    value.fold(self) { v => self.managedScaling(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managedTerminationProtectionAsScala(
      value: Option[ManagedTerminationProtection]
  ): AutoScalingGroupProvider.Builder = {
    value.fold(self) { v => self.managedTerminationProtection(v) }
  }

}

final class AutoScalingGroupProviderOps(val self: AutoScalingGroupProvider) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupArnAsScala: Option[String] = Option(self.autoScalingGroupArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managedScalingAsScala: Option[ManagedScaling] = Option(self.managedScaling)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managedTerminationProtectionAsScala: Option[ManagedTerminationProtection] =
    Option(self.managedTerminationProtection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingGroupProviderOps {

  implicit def toAutoScalingGroupProviderBuilderOps(
      v: AutoScalingGroupProvider.Builder
  ): AutoScalingGroupProviderBuilderOps = new AutoScalingGroupProviderBuilderOps(v)

  implicit def toAutoScalingGroupProviderOps(v: AutoScalingGroupProvider): AutoScalingGroupProviderOps =
    new AutoScalingGroupProviderOps(v)

}
