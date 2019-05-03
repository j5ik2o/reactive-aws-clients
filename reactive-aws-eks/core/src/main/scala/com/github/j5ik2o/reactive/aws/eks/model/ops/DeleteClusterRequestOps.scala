// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DeleteClusterRequestBuilderOps(val self: DeleteClusterRequest.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): DeleteClusterRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class DeleteClusterRequestOps(val self: DeleteClusterRequest) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteClusterRequestOps {

  implicit def toDeleteClusterRequestBuilderOps(v: DeleteClusterRequest.Builder): DeleteClusterRequestBuilderOps =
    new DeleteClusterRequestBuilderOps(v)

  implicit def toDeleteClusterRequestOps(v: DeleteClusterRequest): DeleteClusterRequestOps =
    new DeleteClusterRequestOps(v)

}
