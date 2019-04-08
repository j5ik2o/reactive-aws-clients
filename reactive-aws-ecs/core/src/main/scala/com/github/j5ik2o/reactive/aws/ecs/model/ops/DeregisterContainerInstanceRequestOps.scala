// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeregisterContainerInstanceRequestBuilderOps(val self: DeregisterContainerInstanceRequest.Builder)
    extends AnyVal {

  final def clusterAsScala(value: Option[String]): DeregisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def containerInstanceAsScala(value: Option[String]): DeregisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.containerInstance(v)
    }
  }

  final def forceAsScala(value: Option[Boolean]): DeregisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.force(v)
    }
  }

}

final class DeregisterContainerInstanceRequestOps(val self: DeregisterContainerInstanceRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def containerInstanceAsScala: Option[String] = Option(self.containerInstance)

  final def forceAsScala: Option[Boolean] = Option(self.force)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterContainerInstanceRequestOps {

  implicit def toDeregisterContainerInstanceRequestBuilderOps(
      v: DeregisterContainerInstanceRequest.Builder
  ): DeregisterContainerInstanceRequestBuilderOps = new DeregisterContainerInstanceRequestBuilderOps(v)

  implicit def toDeregisterContainerInstanceRequestOps(
      v: DeregisterContainerInstanceRequest
  ): DeregisterContainerInstanceRequestOps = new DeregisterContainerInstanceRequestOps(v)

}
