// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateGlobalTableResponseBuilderOps(val self: CreateGlobalTableResponse.Builder) extends AnyVal {

  final def globalTableDescriptionAsScala(value: Option[GlobalTableDescription]): CreateGlobalTableResponse.Builder = {
    value.fold(self) { v =>
      self.globalTableDescription(v)
    }
  } // GlobalTableDescription

}

final class CreateGlobalTableResponseOps(val self: CreateGlobalTableResponse) extends AnyVal {

  final def globalTableDescriptionAsScala: Option[GlobalTableDescription] =
    Option(self.globalTableDescription) // GlobalTableDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGlobalTableResponseOps {

  implicit def toCreateGlobalTableResponseBuilderOps(
      v: CreateGlobalTableResponse.Builder
  ): CreateGlobalTableResponseBuilderOps = new CreateGlobalTableResponseBuilderOps(v)

  implicit def toCreateGlobalTableResponseOps(v: CreateGlobalTableResponse): CreateGlobalTableResponseOps =
    new CreateGlobalTableResponseOps(v)

}
