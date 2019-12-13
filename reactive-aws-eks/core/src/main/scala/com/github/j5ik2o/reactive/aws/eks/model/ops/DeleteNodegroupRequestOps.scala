// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DeleteNodegroupRequestBuilderOps(val self: DeleteNodegroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): DeleteNodegroupRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala(value: Option[String]): DeleteNodegroupRequest.Builder = {
    value.fold(self) { v =>
      self.nodegroupName(v)
    }
  }

}

final class DeleteNodegroupRequestOps(val self: DeleteNodegroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala: Option[String] = Option(self.nodegroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNodegroupRequestOps {

  implicit def toDeleteNodegroupRequestBuilderOps(v: DeleteNodegroupRequest.Builder): DeleteNodegroupRequestBuilderOps =
    new DeleteNodegroupRequestBuilderOps(v)

  implicit def toDeleteNodegroupRequestOps(v: DeleteNodegroupRequest): DeleteNodegroupRequestOps =
    new DeleteNodegroupRequestOps(v)

}
