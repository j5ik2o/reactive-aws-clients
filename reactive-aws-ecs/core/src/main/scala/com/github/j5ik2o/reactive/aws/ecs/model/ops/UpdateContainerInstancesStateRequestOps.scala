// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateContainerInstancesStateRequestBuilderOps(val self: UpdateContainerInstancesStateRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): UpdateContainerInstancesStateRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstancesAsScala(value: Option[Seq[String]]): UpdateContainerInstancesStateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerInstances(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ContainerInstanceStatus]): UpdateContainerInstancesStateRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class UpdateContainerInstancesStateRequestOps(val self: UpdateContainerInstancesStateRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstancesAsScala: Option[Seq[String]] = Option(self.containerInstances).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
