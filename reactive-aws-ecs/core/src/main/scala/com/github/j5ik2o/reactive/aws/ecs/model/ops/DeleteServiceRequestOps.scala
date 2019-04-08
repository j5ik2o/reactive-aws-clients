// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteServiceRequestBuilderOps(val self: DeleteServiceRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): DeleteServiceRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def serviceAsScala(value: Option[String]): DeleteServiceRequest.Builder = {
    value.fold(self) { v =>
      self.service(v)
    }
  }

  final def forceAsScala(value: Option[Boolean]): DeleteServiceRequest.Builder = {
    value.fold(self) { v =>
      self.force(v)
    }
  }

}

final class DeleteServiceRequestOps(val self: DeleteServiceRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def serviceAsScala: Option[String] = Option(self.service)

  final def forceAsScala: Option[Boolean] = Option(self.force)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteServiceRequestOps {

  implicit def toDeleteServiceRequestBuilderOps(v: DeleteServiceRequest.Builder): DeleteServiceRequestBuilderOps =
    new DeleteServiceRequestBuilderOps(v)

  implicit def toDeleteServiceRequestOps(v: DeleteServiceRequest): DeleteServiceRequestOps =
    new DeleteServiceRequestOps(v)

}
