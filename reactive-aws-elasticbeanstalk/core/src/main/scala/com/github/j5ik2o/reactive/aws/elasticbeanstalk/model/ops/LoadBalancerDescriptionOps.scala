// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class LoadBalancerDescriptionBuilderOps(val self: LoadBalancerDescription.Builder) extends AnyVal {

  final def loadBalancerNameAsScala(value: Option[String]): LoadBalancerDescription.Builder = {
    value.fold(self) { v =>
      self.loadBalancerName(v)
    }
  } // String

  final def domainAsScala(value: Option[String]): LoadBalancerDescription.Builder = {
    value.fold(self) { v =>
      self.domain(v)
    }
  } // String

  final def listenersAsScala(value: Option[Seq[Listener]]): LoadBalancerDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.listeners(v.asJava)
    } // Seq[Listener]
  }

}

final class LoadBalancerDescriptionOps(val self: LoadBalancerDescription) extends AnyVal {

  final def loadBalancerNameAsScala: Option[String] = Option(self.loadBalancerName) // String

  final def domainAsScala: Option[String] = Option(self.domain) // String

  final def listenersAsScala: Option[Seq[Listener]] = Option(self.listeners).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Listener]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadBalancerDescriptionOps {

  implicit def toLoadBalancerDescriptionBuilderOps(
      v: LoadBalancerDescription.Builder
  ): LoadBalancerDescriptionBuilderOps = new LoadBalancerDescriptionBuilderOps(v)

  implicit def toLoadBalancerDescriptionOps(v: LoadBalancerDescription): LoadBalancerDescriptionOps =
    new LoadBalancerDescriptionOps(v)

}
