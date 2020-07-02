// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateContainerAgentResponseBuilderOps(val self: UpdateContainerAgentResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala(value: Option[ContainerInstance]): UpdateContainerAgentResponse.Builder = {
    value.fold(self) { v => self.containerInstance(v) }
  }

}

final class UpdateContainerAgentResponseOps(val self: UpdateContainerAgentResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala: Option[ContainerInstance] = Option(self.containerInstance)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateContainerAgentResponseOps {

  implicit def toUpdateContainerAgentResponseBuilderOps(
      v: UpdateContainerAgentResponse.Builder
  ): UpdateContainerAgentResponseBuilderOps = new UpdateContainerAgentResponseBuilderOps(v)

  implicit def toUpdateContainerAgentResponseOps(v: UpdateContainerAgentResponse): UpdateContainerAgentResponseOps =
    new UpdateContainerAgentResponseOps(v)

}
