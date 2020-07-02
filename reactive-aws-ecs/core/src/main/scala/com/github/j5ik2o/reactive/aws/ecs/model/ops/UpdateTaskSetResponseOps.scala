// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateTaskSetResponseBuilderOps(val self: UpdateTaskSetResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala(value: Option[TaskSet]): UpdateTaskSetResponse.Builder = {
    value.fold(self) { v => self.taskSet(v) }
  }

}

final class UpdateTaskSetResponseOps(val self: UpdateTaskSetResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala: Option[TaskSet] = Option(self.taskSet)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTaskSetResponseOps {

  implicit def toUpdateTaskSetResponseBuilderOps(v: UpdateTaskSetResponse.Builder): UpdateTaskSetResponseBuilderOps =
    new UpdateTaskSetResponseBuilderOps(v)

  implicit def toUpdateTaskSetResponseOps(v: UpdateTaskSetResponse): UpdateTaskSetResponseOps =
    new UpdateTaskSetResponseOps(v)

}
