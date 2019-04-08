// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeregisterTaskDefinitionResponseBuilderOps(val self: DeregisterTaskDefinitionResponse.Builder)
    extends AnyVal {

  final def taskDefinitionAsScala(value: Option[TaskDefinition]): DeregisterTaskDefinitionResponse.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

}

final class DeregisterTaskDefinitionResponseOps(val self: DeregisterTaskDefinitionResponse) extends AnyVal {

  final def taskDefinitionAsScala: Option[TaskDefinition] = Option(self.taskDefinition)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterTaskDefinitionResponseOps {

  implicit def toDeregisterTaskDefinitionResponseBuilderOps(
      v: DeregisterTaskDefinitionResponse.Builder
  ): DeregisterTaskDefinitionResponseBuilderOps = new DeregisterTaskDefinitionResponseBuilderOps(v)

  implicit def toDeregisterTaskDefinitionResponseOps(
      v: DeregisterTaskDefinitionResponse
  ): DeregisterTaskDefinitionResponseOps = new DeregisterTaskDefinitionResponseOps(v)

}
