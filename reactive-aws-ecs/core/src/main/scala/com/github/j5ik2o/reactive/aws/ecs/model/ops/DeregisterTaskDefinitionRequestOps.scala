// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeregisterTaskDefinitionRequestBuilderOps(val self: DeregisterTaskDefinitionRequest.Builder)
    extends AnyVal {

  final def taskDefinitionAsScala(value: Option[String]): DeregisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

}

final class DeregisterTaskDefinitionRequestOps(val self: DeregisterTaskDefinitionRequest) extends AnyVal {

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterTaskDefinitionRequestOps {

  implicit def toDeregisterTaskDefinitionRequestBuilderOps(
      v: DeregisterTaskDefinitionRequest.Builder
  ): DeregisterTaskDefinitionRequestBuilderOps = new DeregisterTaskDefinitionRequestBuilderOps(v)

  implicit def toDeregisterTaskDefinitionRequestOps(
      v: DeregisterTaskDefinitionRequest
  ): DeregisterTaskDefinitionRequestOps = new DeregisterTaskDefinitionRequestOps(v)

}
