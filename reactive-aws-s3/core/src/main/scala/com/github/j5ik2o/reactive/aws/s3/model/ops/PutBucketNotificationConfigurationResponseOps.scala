// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketNotificationConfigurationResponseBuilderOps(
    val self: PutBucketNotificationConfigurationResponse.Builder
) extends AnyVal {}

final class PutBucketNotificationConfigurationResponseOps(val self: PutBucketNotificationConfigurationResponse)
    extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketNotificationConfigurationResponseOps {

  implicit def toPutBucketNotificationConfigurationResponseBuilderOps(
      v: PutBucketNotificationConfigurationResponse.Builder
  ): PutBucketNotificationConfigurationResponseBuilderOps = new PutBucketNotificationConfigurationResponseBuilderOps(v)

  implicit def toPutBucketNotificationConfigurationResponseOps(
      v: PutBucketNotificationConfigurationResponse
  ): PutBucketNotificationConfigurationResponseOps = new PutBucketNotificationConfigurationResponseOps(v)

}
