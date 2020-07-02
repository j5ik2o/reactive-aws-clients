// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketAccelerateConfigurationResponseBuilderOps(
    val self: GetBucketAccelerateConfigurationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[BucketAccelerateStatus]): GetBucketAccelerateConfigurationResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class GetBucketAccelerateConfigurationResponseOps(val self: GetBucketAccelerateConfigurationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[BucketAccelerateStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketAccelerateConfigurationResponseOps {

  implicit def toGetBucketAccelerateConfigurationResponseBuilderOps(
      v: GetBucketAccelerateConfigurationResponse.Builder
  ): GetBucketAccelerateConfigurationResponseBuilderOps = new GetBucketAccelerateConfigurationResponseBuilderOps(v)

  implicit def toGetBucketAccelerateConfigurationResponseOps(
      v: GetBucketAccelerateConfigurationResponse
  ): GetBucketAccelerateConfigurationResponseOps = new GetBucketAccelerateConfigurationResponseOps(v)

}
