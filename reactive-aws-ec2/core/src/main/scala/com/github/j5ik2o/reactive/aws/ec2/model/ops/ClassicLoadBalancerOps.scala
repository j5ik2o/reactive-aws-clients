// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClassicLoadBalancerBuilderOps(val self: ClassicLoadBalancer.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ClassicLoadBalancer.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class ClassicLoadBalancerOps(val self: ClassicLoadBalancer) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClassicLoadBalancerOps {

  implicit def toClassicLoadBalancerBuilderOps(v: ClassicLoadBalancer.Builder): ClassicLoadBalancerBuilderOps =
    new ClassicLoadBalancerBuilderOps(v)

  implicit def toClassicLoadBalancerOps(v: ClassicLoadBalancer): ClassicLoadBalancerOps = new ClassicLoadBalancerOps(v)

}
