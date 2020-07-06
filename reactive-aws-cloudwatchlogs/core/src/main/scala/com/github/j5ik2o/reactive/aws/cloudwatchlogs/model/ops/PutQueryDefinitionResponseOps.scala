// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutQueryDefinitionResponseBuilderOps(val self: PutQueryDefinitionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionIdAsScala(value: Option[String]): PutQueryDefinitionResponse.Builder = {
    value.fold(self) { v => self.queryDefinitionId(v) }
  }

}

final class PutQueryDefinitionResponseOps(val self: PutQueryDefinitionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionIdAsScala: Option[String] = Option(self.queryDefinitionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutQueryDefinitionResponseOps {

  implicit def toPutQueryDefinitionResponseBuilderOps(
      v: PutQueryDefinitionResponse.Builder
  ): PutQueryDefinitionResponseBuilderOps = new PutQueryDefinitionResponseBuilderOps(v)

  implicit def toPutQueryDefinitionResponseOps(v: PutQueryDefinitionResponse): PutQueryDefinitionResponseOps =
    new PutQueryDefinitionResponseOps(v)

}
