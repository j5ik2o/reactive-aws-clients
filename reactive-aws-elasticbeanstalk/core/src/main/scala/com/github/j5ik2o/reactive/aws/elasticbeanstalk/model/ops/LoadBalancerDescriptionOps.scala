// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class LoadBalancerDescriptionBuilderOps(val self: LoadBalancerDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancerNameAsScala(value: Option[String]): LoadBalancerDescription.Builder = {
    value.fold(self) { v =>
      self.loadBalancerName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainAsScala(value: Option[String]): LoadBalancerDescription.Builder = {
    value.fold(self) { v =>
      self.domain(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def listenersAsScala(value: Option[Seq[Listener]]): LoadBalancerDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.listeners(v.asJava)
    }
  }

}

final class LoadBalancerDescriptionOps(val self: LoadBalancerDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancerNameAsScala: Option[String] = Option(self.loadBalancerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainAsScala: Option[String] = Option(self.domain)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def listenersAsScala: Option[Seq[Listener]] = Option(self.listeners).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadBalancerDescriptionOps {

  implicit def toLoadBalancerDescriptionBuilderOps(
      v: LoadBalancerDescription.Builder
  ): LoadBalancerDescriptionBuilderOps = new LoadBalancerDescriptionBuilderOps(v)

  implicit def toLoadBalancerDescriptionOps(v: LoadBalancerDescription): LoadBalancerDescriptionOps =
    new LoadBalancerDescriptionOps(v)

}
