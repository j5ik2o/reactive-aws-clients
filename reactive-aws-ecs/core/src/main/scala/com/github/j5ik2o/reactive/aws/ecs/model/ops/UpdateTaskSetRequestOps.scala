// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateTaskSetRequestBuilderOps(val self: UpdateTaskSetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): UpdateTaskSetRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala(value: Option[String]): UpdateTaskSetRequest.Builder = {
    value.fold(self) { v =>
      self.service(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala(value: Option[String]): UpdateTaskSetRequest.Builder = {
    value.fold(self) { v =>
      self.taskSet(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleAsScala(value: Option[Scale]): UpdateTaskSetRequest.Builder = {
    value.fold(self) { v =>
      self.scale(v)
    }
  }

}

final class UpdateTaskSetRequestOps(val self: UpdateTaskSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala: Option[String] = Option(self.service)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala: Option[String] = Option(self.taskSet)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleAsScala: Option[Scale] = Option(self.scale)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTaskSetRequestOps {

  implicit def toUpdateTaskSetRequestBuilderOps(v: UpdateTaskSetRequest.Builder): UpdateTaskSetRequestBuilderOps =
    new UpdateTaskSetRequestBuilderOps(v)

  implicit def toUpdateTaskSetRequestOps(v: UpdateTaskSetRequest): UpdateTaskSetRequestOps =
    new UpdateTaskSetRequestOps(v)

}
