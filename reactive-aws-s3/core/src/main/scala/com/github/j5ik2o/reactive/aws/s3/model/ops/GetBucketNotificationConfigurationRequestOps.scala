// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketNotificationConfigurationRequestBuilderOps(
    val self: GetBucketNotificationConfigurationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketNotificationConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class GetBucketNotificationConfigurationRequestOps(val self: GetBucketNotificationConfigurationRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketNotificationConfigurationRequestOps {

  implicit def toGetBucketNotificationConfigurationRequestBuilderOps(
      v: GetBucketNotificationConfigurationRequest.Builder
  ): GetBucketNotificationConfigurationRequestBuilderOps = new GetBucketNotificationConfigurationRequestBuilderOps(v)

  implicit def toGetBucketNotificationConfigurationRequestOps(
      v: GetBucketNotificationConfigurationRequest
  ): GetBucketNotificationConfigurationRequestOps = new GetBucketNotificationConfigurationRequestOps(v)

}
