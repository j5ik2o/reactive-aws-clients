// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteQueryDefinitionResponseBuilderOps(val self: DeleteQueryDefinitionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successAsScala(value: Option[Boolean]): DeleteQueryDefinitionResponse.Builder = {
    value.fold(self) { v => self.success(v) }
  }

}

final class DeleteQueryDefinitionResponseOps(val self: DeleteQueryDefinitionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successAsScala: Option[Boolean] = Option(self.success)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteQueryDefinitionResponseOps {

  implicit def toDeleteQueryDefinitionResponseBuilderOps(
      v: DeleteQueryDefinitionResponse.Builder
  ): DeleteQueryDefinitionResponseBuilderOps = new DeleteQueryDefinitionResponseBuilderOps(v)

  implicit def toDeleteQueryDefinitionResponseOps(v: DeleteQueryDefinitionResponse): DeleteQueryDefinitionResponseOps =
    new DeleteQueryDefinitionResponseOps(v)

}
