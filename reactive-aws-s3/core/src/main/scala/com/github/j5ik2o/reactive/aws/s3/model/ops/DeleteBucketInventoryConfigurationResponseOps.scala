// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketInventoryConfigurationResponseBuilderOps(
    val self: DeleteBucketInventoryConfigurationResponse.Builder
) extends AnyVal {}

final class DeleteBucketInventoryConfigurationResponseOps(val self: DeleteBucketInventoryConfigurationResponse)
    extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketInventoryConfigurationResponseOps {

  implicit def toDeleteBucketInventoryConfigurationResponseBuilderOps(
      v: DeleteBucketInventoryConfigurationResponse.Builder
  ): DeleteBucketInventoryConfigurationResponseBuilderOps = new DeleteBucketInventoryConfigurationResponseBuilderOps(v)

  implicit def toDeleteBucketInventoryConfigurationResponseOps(
      v: DeleteBucketInventoryConfigurationResponse
  ): DeleteBucketInventoryConfigurationResponseOps = new DeleteBucketInventoryConfigurationResponseOps(v)

}
