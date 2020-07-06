// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteQueryDefinitionRequestBuilderOps(val self: DeleteQueryDefinitionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionIdAsScala(value: Option[String]): DeleteQueryDefinitionRequest.Builder = {
    value.fold(self) { v => self.queryDefinitionId(v) }
  }

}

final class DeleteQueryDefinitionRequestOps(val self: DeleteQueryDefinitionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionIdAsScala: Option[String] = Option(self.queryDefinitionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteQueryDefinitionRequestOps {

  implicit def toDeleteQueryDefinitionRequestBuilderOps(
      v: DeleteQueryDefinitionRequest.Builder
  ): DeleteQueryDefinitionRequestBuilderOps = new DeleteQueryDefinitionRequestBuilderOps(v)

  implicit def toDeleteQueryDefinitionRequestOps(v: DeleteQueryDefinitionRequest): DeleteQueryDefinitionRequestOps =
    new DeleteQueryDefinitionRequestOps(v)

}
