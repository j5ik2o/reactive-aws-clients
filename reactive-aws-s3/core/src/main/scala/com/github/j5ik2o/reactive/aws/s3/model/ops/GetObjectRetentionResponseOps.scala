// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectRetentionResponseBuilderOps(val self: GetObjectRetentionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionAsScala(value: Option[ObjectLockRetention]): GetObjectRetentionResponse.Builder = {
    value.fold(self) { v => self.retention(v) }
  }

}

final class GetObjectRetentionResponseOps(val self: GetObjectRetentionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionAsScala: Option[ObjectLockRetention] = Option(self.retention)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectRetentionResponseOps {

  implicit def toGetObjectRetentionResponseBuilderOps(
      v: GetObjectRetentionResponse.Builder
  ): GetObjectRetentionResponseBuilderOps = new GetObjectRetentionResponseBuilderOps(v)

  implicit def toGetObjectRetentionResponseOps(v: GetObjectRetentionResponse): GetObjectRetentionResponseOps =
    new GetObjectRetentionResponseOps(v)

}
