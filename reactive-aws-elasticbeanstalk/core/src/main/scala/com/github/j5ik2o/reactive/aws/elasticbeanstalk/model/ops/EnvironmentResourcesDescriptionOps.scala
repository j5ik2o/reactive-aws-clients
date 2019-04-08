// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EnvironmentResourcesDescriptionBuilderOps(val self: EnvironmentResourcesDescription.Builder)
    extends AnyVal {

  final def loadBalancerAsScala(value: Option[LoadBalancerDescription]): EnvironmentResourcesDescription.Builder = {
    value.fold(self) { v =>
      self.loadBalancer(v)
    }
  }

}

final class EnvironmentResourcesDescriptionOps(val self: EnvironmentResourcesDescription) extends AnyVal {

  final def loadBalancerAsScala: Option[LoadBalancerDescription] = Option(self.loadBalancer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentResourcesDescriptionOps {

  implicit def toEnvironmentResourcesDescriptionBuilderOps(
      v: EnvironmentResourcesDescription.Builder
  ): EnvironmentResourcesDescriptionBuilderOps = new EnvironmentResourcesDescriptionBuilderOps(v)

  implicit def toEnvironmentResourcesDescriptionOps(
      v: EnvironmentResourcesDescription
  ): EnvironmentResourcesDescriptionOps = new EnvironmentResourcesDescriptionOps(v)

}
