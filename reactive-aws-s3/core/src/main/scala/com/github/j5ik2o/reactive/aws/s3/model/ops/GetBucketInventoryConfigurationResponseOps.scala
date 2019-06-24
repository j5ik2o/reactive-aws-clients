// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketInventoryConfigurationResponseBuilderOps(val self: GetBucketInventoryConfigurationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inventoryConfigurationAsScala(
      value: Option[InventoryConfiguration]
  ): GetBucketInventoryConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.inventoryConfiguration(v)
    }
  }

}

final class GetBucketInventoryConfigurationResponseOps(val self: GetBucketInventoryConfigurationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inventoryConfigurationAsScala: Option[InventoryConfiguration] = Option(self.inventoryConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketInventoryConfigurationResponseOps {

  implicit def toGetBucketInventoryConfigurationResponseBuilderOps(
      v: GetBucketInventoryConfigurationResponse.Builder
  ): GetBucketInventoryConfigurationResponseBuilderOps = new GetBucketInventoryConfigurationResponseBuilderOps(v)

  implicit def toGetBucketInventoryConfigurationResponseOps(
      v: GetBucketInventoryConfigurationResponse
  ): GetBucketInventoryConfigurationResponseOps = new GetBucketInventoryConfigurationResponseOps(v)

}
