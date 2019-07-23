// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class LoadBalancerBuilderOps(val self: LoadBalancer.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetGroupArnAsScala(value: Option[String]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.targetGroupArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancerNameAsScala(value: Option[String]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.loadBalancerName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala(value: Option[String]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.containerName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPortAsScala(value: Option[Int]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.containerPort(v)
    }
  }

}

final class LoadBalancerOps(val self: LoadBalancer) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetGroupArnAsScala: Option[String] = Option(self.targetGroupArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancerNameAsScala: Option[String] = Option(self.loadBalancerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala: Option[String] = Option(self.containerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPortAsScala: Option[Int] = Option(self.containerPort)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadBalancerOps {

  implicit def toLoadBalancerBuilderOps(v: LoadBalancer.Builder): LoadBalancerBuilderOps = new LoadBalancerBuilderOps(v)

  implicit def toLoadBalancerOps(v: LoadBalancer): LoadBalancerOps = new LoadBalancerOps(v)

}
