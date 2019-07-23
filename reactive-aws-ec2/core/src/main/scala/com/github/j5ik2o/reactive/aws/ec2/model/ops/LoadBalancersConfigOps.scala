// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LoadBalancersConfigBuilderOps(val self: LoadBalancersConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def classicLoadBalancersConfigAsScala(
      value: Option[ClassicLoadBalancersConfig]
  ): LoadBalancersConfig.Builder = {
    value.fold(self) { v =>
      self.classicLoadBalancersConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetGroupsConfigAsScala(value: Option[TargetGroupsConfig]): LoadBalancersConfig.Builder = {
    value.fold(self) { v =>
      self.targetGroupsConfig(v)
    }
  }

}

final class LoadBalancersConfigOps(val self: LoadBalancersConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def classicLoadBalancersConfigAsScala: Option[ClassicLoadBalancersConfig] =
    Option(self.classicLoadBalancersConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetGroupsConfigAsScala: Option[TargetGroupsConfig] = Option(self.targetGroupsConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadBalancersConfigOps {

  implicit def toLoadBalancersConfigBuilderOps(v: LoadBalancersConfig.Builder): LoadBalancersConfigBuilderOps =
    new LoadBalancersConfigBuilderOps(v)

  implicit def toLoadBalancersConfigOps(v: LoadBalancersConfig): LoadBalancersConfigOps = new LoadBalancersConfigOps(v)

}
