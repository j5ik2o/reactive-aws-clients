// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteTaskSetResponseBuilderOps(val self: DeleteTaskSetResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala(value: Option[TaskSet]): DeleteTaskSetResponse.Builder = {
    value.fold(self) { v => self.taskSet(v) }
  }

}

final class DeleteTaskSetResponseOps(val self: DeleteTaskSetResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala: Option[TaskSet] = Option(self.taskSet)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTaskSetResponseOps {

  implicit def toDeleteTaskSetResponseBuilderOps(v: DeleteTaskSetResponse.Builder): DeleteTaskSetResponseBuilderOps =
    new DeleteTaskSetResponseBuilderOps(v)

  implicit def toDeleteTaskSetResponseOps(v: DeleteTaskSetResponse): DeleteTaskSetResponseOps =
    new DeleteTaskSetResponseOps(v)

}
