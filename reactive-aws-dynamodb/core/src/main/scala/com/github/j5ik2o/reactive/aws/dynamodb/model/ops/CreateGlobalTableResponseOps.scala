// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateGlobalTableResponseBuilderOps(val self: CreateGlobalTableResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableDescriptionAsScala(value: Option[GlobalTableDescription]): CreateGlobalTableResponse.Builder = {
    value.fold(self) { v => self.globalTableDescription(v) }
  }

}

final class CreateGlobalTableResponseOps(val self: CreateGlobalTableResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableDescriptionAsScala: Option[GlobalTableDescription] = Option(self.globalTableDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGlobalTableResponseOps {

  implicit def toCreateGlobalTableResponseBuilderOps(
      v: CreateGlobalTableResponse.Builder
  ): CreateGlobalTableResponseBuilderOps = new CreateGlobalTableResponseBuilderOps(v)

  implicit def toCreateGlobalTableResponseOps(v: CreateGlobalTableResponse): CreateGlobalTableResponseOps =
    new CreateGlobalTableResponseOps(v)

}
