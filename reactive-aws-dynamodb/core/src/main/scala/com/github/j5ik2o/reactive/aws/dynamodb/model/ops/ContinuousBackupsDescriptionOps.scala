// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ContinuousBackupsDescriptionBuilderOps(val self: ContinuousBackupsDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuousBackupsStatusAsScala(
      value: Option[ContinuousBackupsStatus]
  ): ContinuousBackupsDescription.Builder = {
    value.fold(self) { v => self.continuousBackupsStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pointInTimeRecoveryDescriptionAsScala(
      value: Option[PointInTimeRecoveryDescription]
  ): ContinuousBackupsDescription.Builder = {
    value.fold(self) { v => self.pointInTimeRecoveryDescription(v) }
  }

}

final class ContinuousBackupsDescriptionOps(val self: ContinuousBackupsDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuousBackupsStatusAsScala: Option[ContinuousBackupsStatus] = Option(self.continuousBackupsStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pointInTimeRecoveryDescriptionAsScala: Option[PointInTimeRecoveryDescription] =
    Option(self.pointInTimeRecoveryDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContinuousBackupsDescriptionOps {

  implicit def toContinuousBackupsDescriptionBuilderOps(
      v: ContinuousBackupsDescription.Builder
  ): ContinuousBackupsDescriptionBuilderOps = new ContinuousBackupsDescriptionBuilderOps(v)

  implicit def toContinuousBackupsDescriptionOps(v: ContinuousBackupsDescription): ContinuousBackupsDescriptionOps =
    new ContinuousBackupsDescriptionOps(v)

}
