// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class LoadBalancerBuilderOps(val self: LoadBalancer.Builder) extends AnyVal {

  final def targetGroupArnAsScala(value: Option[String]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.targetGroupArn(v)
    }
  }

  final def loadBalancerNameAsScala(value: Option[String]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.loadBalancerName(v)
    }
  }

  final def containerNameAsScala(value: Option[String]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.containerName(v)
    }
  }

  final def containerPortAsScala(value: Option[Int]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.containerPort(v)
    }
  }

}

final class LoadBalancerOps(val self: LoadBalancer) extends AnyVal {

  final def targetGroupArnAsScala: Option[String] = Option(self.targetGroupArn)

  final def loadBalancerNameAsScala: Option[String] = Option(self.loadBalancerName)

  final def containerNameAsScala: Option[String] = Option(self.containerName)

  final def containerPortAsScala: Option[Int] = Option(self.containerPort)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadBalancerOps {

  implicit def toLoadBalancerBuilderOps(v: LoadBalancer.Builder): LoadBalancerBuilderOps = new LoadBalancerBuilderOps(v)

  implicit def toLoadBalancerOps(v: LoadBalancer): LoadBalancerOps = new LoadBalancerOps(v)

}
