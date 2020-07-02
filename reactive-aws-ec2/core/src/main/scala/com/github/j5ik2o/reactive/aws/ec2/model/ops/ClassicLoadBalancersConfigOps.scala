// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClassicLoadBalancersConfigBuilderOps(val self: ClassicLoadBalancersConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def classicLoadBalancersAsScala(value: Option[Seq[ClassicLoadBalancer]]): ClassicLoadBalancersConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.classicLoadBalancers(v.asJava)
    }
  }

}

final class ClassicLoadBalancersConfigOps(val self: ClassicLoadBalancersConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def classicLoadBalancersAsScala: Option[Seq[ClassicLoadBalancer]] =
    Option(self.classicLoadBalancers).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClassicLoadBalancersConfigOps {

  implicit def toClassicLoadBalancersConfigBuilderOps(
      v: ClassicLoadBalancersConfig.Builder
  ): ClassicLoadBalancersConfigBuilderOps = new ClassicLoadBalancersConfigBuilderOps(v)

  implicit def toClassicLoadBalancersConfigOps(v: ClassicLoadBalancersConfig): ClassicLoadBalancersConfigOps =
    new ClassicLoadBalancersConfigOps(v)

}
