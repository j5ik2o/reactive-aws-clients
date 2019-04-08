// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DeregisterJobDefinitionResponseBuilderOps(val self: DeregisterJobDefinitionResponse.Builder)
    extends AnyVal {}

final class DeregisterJobDefinitionResponseOps(val self: DeregisterJobDefinitionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterJobDefinitionResponseOps {

  implicit def toDeregisterJobDefinitionResponseBuilderOps(
      v: DeregisterJobDefinitionResponse.Builder
  ): DeregisterJobDefinitionResponseBuilderOps = new DeregisterJobDefinitionResponseBuilderOps(v)

  implicit def toDeregisterJobDefinitionResponseOps(
      v: DeregisterJobDefinitionResponse
  ): DeregisterJobDefinitionResponseOps = new DeregisterJobDefinitionResponseOps(v)

}
