// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class StopTaskRequestBuilderOps(val self: StopTaskRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): StopTaskRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskAsScala(value: Option[String]): StopTaskRequest.Builder = {
    value.fold(self) { v => self.task(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala(value: Option[String]): StopTaskRequest.Builder = {
    value.fold(self) { v => self.reason(v) }
  }

}

final class StopTaskRequestOps(val self: StopTaskRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskAsScala: Option[String] = Option(self.task)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala: Option[String] = Option(self.reason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopTaskRequestOps {

  implicit def toStopTaskRequestBuilderOps(v: StopTaskRequest.Builder): StopTaskRequestBuilderOps =
    new StopTaskRequestBuilderOps(v)

  implicit def toStopTaskRequestOps(v: StopTaskRequest): StopTaskRequestOps = new StopTaskRequestOps(v)

}
