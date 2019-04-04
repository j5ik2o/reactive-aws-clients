// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeContinuousBackupsResponseBuilderOps(val self: DescribeContinuousBackupsResponse.Builder)
    extends AnyVal {

  final def withContinuousBackupsDescriptionAsScala(
      value: Option[ContinuousBackupsDescription]
  ): DescribeContinuousBackupsResponse.Builder = {
    value.fold(self) { v =>
      self.continuousBackupsDescription(v)
    }
  } // ContinuousBackupsDescription

}

final class DescribeContinuousBackupsResponseOps(val self: DescribeContinuousBackupsResponse) extends AnyVal {

  final def continuousBackupsDescriptionAsScala: Option[ContinuousBackupsDescription] =
    Option(self.continuousBackupsDescription) // ContinuousBackupsDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeContinuousBackupsResponseOps {

  implicit def toDescribeContinuousBackupsResponseBuilderOps(
      v: DescribeContinuousBackupsResponse.Builder
  ): DescribeContinuousBackupsResponseBuilderOps = new DescribeContinuousBackupsResponseBuilderOps(v)

  implicit def toDescribeContinuousBackupsResponseOps(
      v: DescribeContinuousBackupsResponse
  ): DescribeContinuousBackupsResponseOps = new DescribeContinuousBackupsResponseOps(v)

}
