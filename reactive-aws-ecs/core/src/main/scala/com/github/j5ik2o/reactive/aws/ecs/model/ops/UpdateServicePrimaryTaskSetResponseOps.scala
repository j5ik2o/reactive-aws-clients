// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateServicePrimaryTaskSetResponseBuilderOps(val self: UpdateServicePrimaryTaskSetResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala(value: Option[TaskSet]): UpdateServicePrimaryTaskSetResponse.Builder = {
    value.fold(self) { v => self.taskSet(v) }
  }

}

final class UpdateServicePrimaryTaskSetResponseOps(val self: UpdateServicePrimaryTaskSetResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetAsScala: Option[TaskSet] = Option(self.taskSet)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateServicePrimaryTaskSetResponseOps {

  implicit def toUpdateServicePrimaryTaskSetResponseBuilderOps(
      v: UpdateServicePrimaryTaskSetResponse.Builder
  ): UpdateServicePrimaryTaskSetResponseBuilderOps = new UpdateServicePrimaryTaskSetResponseBuilderOps(v)

  implicit def toUpdateServicePrimaryTaskSetResponseOps(
      v: UpdateServicePrimaryTaskSetResponse
  ): UpdateServicePrimaryTaskSetResponseOps = new UpdateServicePrimaryTaskSetResponseOps(v)

}
