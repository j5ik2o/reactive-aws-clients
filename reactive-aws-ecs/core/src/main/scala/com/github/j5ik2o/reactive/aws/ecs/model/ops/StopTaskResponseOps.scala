// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class StopTaskResponseBuilderOps(val self: StopTaskResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskAsScala(value: Option[Task]): StopTaskResponse.Builder = {
    value.fold(self) { v => self.task(v) }
  }

}

final class StopTaskResponseOps(val self: StopTaskResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskAsScala: Option[Task] = Option(self.task)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopTaskResponseOps {

  implicit def toStopTaskResponseBuilderOps(v: StopTaskResponse.Builder): StopTaskResponseBuilderOps =
    new StopTaskResponseBuilderOps(v)

  implicit def toStopTaskResponseOps(v: StopTaskResponse): StopTaskResponseOps = new StopTaskResponseOps(v)

}
