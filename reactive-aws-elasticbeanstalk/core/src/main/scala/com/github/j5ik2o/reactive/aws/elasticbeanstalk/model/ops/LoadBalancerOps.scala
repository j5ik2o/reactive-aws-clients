// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class LoadBalancerBuilderOps(val self: LoadBalancer.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): LoadBalancer.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class LoadBalancerOps(val self: LoadBalancer) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadBalancerOps {

  implicit def toLoadBalancerBuilderOps(v: LoadBalancer.Builder): LoadBalancerBuilderOps = new LoadBalancerBuilderOps(v)

  implicit def toLoadBalancerOps(v: LoadBalancer): LoadBalancerOps = new LoadBalancerOps(v)

}
