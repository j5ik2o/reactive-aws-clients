// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateGlobalTableResponseBuilderOps(val self: UpdateGlobalTableResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableDescriptionAsScala(value: Option[GlobalTableDescription]): UpdateGlobalTableResponse.Builder = {
    value.fold(self) { v =>
      self.globalTableDescription(v)
    }
  }

}

final class UpdateGlobalTableResponseOps(val self: UpdateGlobalTableResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableDescriptionAsScala: Option[GlobalTableDescription] = Option(self.globalTableDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateGlobalTableResponseOps {

  implicit def toUpdateGlobalTableResponseBuilderOps(
      v: UpdateGlobalTableResponse.Builder
  ): UpdateGlobalTableResponseBuilderOps = new UpdateGlobalTableResponseBuilderOps(v)

  implicit def toUpdateGlobalTableResponseOps(v: UpdateGlobalTableResponse): UpdateGlobalTableResponseOps =
    new UpdateGlobalTableResponseOps(v)

}
