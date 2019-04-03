// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateContinuousBackupsResponseBuilderOps(val self: UpdateContinuousBackupsResponse.Builder)
    extends AnyVal {

  final def withContinuousBackupsDescriptionAsScala(
      value: Option[ContinuousBackupsDescription]
  ): UpdateContinuousBackupsResponse.Builder = {
    value.fold(self) { v =>
      self.continuousBackupsDescription(v)
    }
  } // ContinuousBackupsDescription

}

final class UpdateContinuousBackupsResponseOps(val self: UpdateContinuousBackupsResponse) extends AnyVal {

  final def continuousBackupsDescriptionAsScala: Option[ContinuousBackupsDescription] =
    Option(self.continuousBackupsDescription) // ContinuousBackupsDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateContinuousBackupsResponseOps {

  implicit def toUpdateContinuousBackupsResponseBuilderOps(
      v: UpdateContinuousBackupsResponse.Builder
  ): UpdateContinuousBackupsResponseBuilderOps = new UpdateContinuousBackupsResponseBuilderOps(v)

  implicit def toUpdateContinuousBackupsResponseOps(
      v: UpdateContinuousBackupsResponse
  ): UpdateContinuousBackupsResponseOps = new UpdateContinuousBackupsResponseOps(v)

}
