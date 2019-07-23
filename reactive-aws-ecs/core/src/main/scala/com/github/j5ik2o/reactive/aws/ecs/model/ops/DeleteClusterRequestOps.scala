// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteClusterRequestBuilderOps(val self: DeleteClusterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): DeleteClusterRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

}

final class DeleteClusterRequestOps(val self: DeleteClusterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteClusterRequestOps {

  implicit def toDeleteClusterRequestBuilderOps(v: DeleteClusterRequest.Builder): DeleteClusterRequestBuilderOps =
    new DeleteClusterRequestBuilderOps(v)

  implicit def toDeleteClusterRequestOps(v: DeleteClusterRequest): DeleteClusterRequestOps =
    new DeleteClusterRequestOps(v)

}
