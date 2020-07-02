// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteTaskSetRequestBuilderOps(val self: DeleteTaskSetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): DeleteTaskSetRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala(value: Option[String]): DeleteTaskSetRequest.Builder = {
    value.fold(self) { v => self.service(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala(value: Option[String]): DeleteTaskSetRequest.Builder = {
    value.fold(self) { v => self.taskSet(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala(value: Option[Boolean]): DeleteTaskSetRequest.Builder = {
    value.fold(self) { v => self.force(v) }
  }

}

final class DeleteTaskSetRequestOps(val self: DeleteTaskSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala: Option[String] = Option(self.service)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala: Option[String] = Option(self.taskSet)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala: Option[Boolean] = Option(self.force)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTaskSetRequestOps {

  implicit def toDeleteTaskSetRequestBuilderOps(v: DeleteTaskSetRequest.Builder): DeleteTaskSetRequestBuilderOps =
    new DeleteTaskSetRequestBuilderOps(v)

  implicit def toDeleteTaskSetRequestOps(v: DeleteTaskSetRequest): DeleteTaskSetRequestOps =
    new DeleteTaskSetRequestOps(v)

}
