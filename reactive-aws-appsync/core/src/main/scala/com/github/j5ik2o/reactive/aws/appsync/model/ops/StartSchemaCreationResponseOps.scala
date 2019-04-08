// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class StartSchemaCreationResponseBuilderOps(val self: StartSchemaCreationResponse.Builder) extends AnyVal {

  final def statusAsScala(value: Option[SchemaStatus]): StartSchemaCreationResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class StartSchemaCreationResponseOps(val self: StartSchemaCreationResponse) extends AnyVal {

  final def statusAsScala: Option[SchemaStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartSchemaCreationResponseOps {

  implicit def toStartSchemaCreationResponseBuilderOps(
      v: StartSchemaCreationResponse.Builder
  ): StartSchemaCreationResponseBuilderOps = new StartSchemaCreationResponseBuilderOps(v)

  implicit def toStartSchemaCreationResponseOps(v: StartSchemaCreationResponse): StartSchemaCreationResponseOps =
    new StartSchemaCreationResponseOps(v)

}
