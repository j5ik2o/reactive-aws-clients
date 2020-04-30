// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CreateTaskSetResponseBuilderOps(val self: CreateTaskSetResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def taskSetAsScala(value: Option[TaskSet]): CreateTaskSetResponse.Builder = {
            value.fold(self){ v => self.taskSet(v) }
            } 


}

final class CreateTaskSetResponseOps(val self: CreateTaskSetResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def taskSetAsScala: Option[TaskSet] = Option(self.taskSet) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTaskSetResponseOps {

implicit def toCreateTaskSetResponseBuilderOps(v: CreateTaskSetResponse.Builder): CreateTaskSetResponseBuilderOps = new CreateTaskSetResponseBuilderOps(v)

implicit def toCreateTaskSetResponseOps(v: CreateTaskSetResponse): CreateTaskSetResponseOps = new CreateTaskSetResponseOps(v)

}

