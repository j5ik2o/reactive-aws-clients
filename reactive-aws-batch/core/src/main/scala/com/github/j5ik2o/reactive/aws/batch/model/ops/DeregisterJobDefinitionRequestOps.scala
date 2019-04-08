// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DeregisterJobDefinitionRequestBuilderOps(val self: DeregisterJobDefinitionRequest.Builder) extends AnyVal {

  final def jobDefinitionAsScala(value: Option[String]): DeregisterJobDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.jobDefinition(v)
    }
  } // String

}

final class DeregisterJobDefinitionRequestOps(val self: DeregisterJobDefinitionRequest) extends AnyVal {

  final def jobDefinitionAsScala: Option[String] = Option(self.jobDefinition) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterJobDefinitionRequestOps {

  implicit def toDeregisterJobDefinitionRequestBuilderOps(
      v: DeregisterJobDefinitionRequest.Builder
  ): DeregisterJobDefinitionRequestBuilderOps = new DeregisterJobDefinitionRequestBuilderOps(v)

  implicit def toDeregisterJobDefinitionRequestOps(
      v: DeregisterJobDefinitionRequest
  ): DeregisterJobDefinitionRequestOps = new DeregisterJobDefinitionRequestOps(v)

}
