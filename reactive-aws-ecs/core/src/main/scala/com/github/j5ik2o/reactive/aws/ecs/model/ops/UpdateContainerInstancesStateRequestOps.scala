// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateContainerInstancesStateRequestBuilderOps(val self: UpdateContainerInstancesStateRequest.Builder)
    extends AnyVal {

  final def clusterAsScala(value: Option[String]): UpdateContainerInstancesStateRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def containerInstancesAsScala(value: Option[Seq[String]]): UpdateContainerInstancesStateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containerInstances(v.asJava)
    }
  }

  final def statusAsScala(value: Option[ContainerInstanceStatus]): UpdateContainerInstancesStateRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class UpdateContainerInstancesStateRequestOps(val self: UpdateContainerInstancesStateRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def containerInstancesAsScala: Option[Seq[String]] = Option(self.containerInstances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def statusAsScala: Option[ContainerInstanceStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateContainerInstancesStateRequestOps {

  implicit def toUpdateContainerInstancesStateRequestBuilderOps(
      v: UpdateContainerInstancesStateRequest.Builder
  ): UpdateContainerInstancesStateRequestBuilderOps = new UpdateContainerInstancesStateRequestBuilderOps(v)

  implicit def toUpdateContainerInstancesStateRequestOps(
      v: UpdateContainerInstancesStateRequest
  ): UpdateContainerInstancesStateRequestOps = new UpdateContainerInstancesStateRequestOps(v)

}
