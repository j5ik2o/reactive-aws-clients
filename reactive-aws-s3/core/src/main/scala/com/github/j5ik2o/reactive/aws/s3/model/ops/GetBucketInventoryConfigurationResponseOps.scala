// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketInventoryConfigurationResponseBuilderOps(val self: GetBucketInventoryConfigurationResponse.Builder)
    extends AnyVal {

  final def inventoryConfigurationAsScala(
      value: Option[InventoryConfiguration]
  ): GetBucketInventoryConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.inventoryConfiguration(v)
    }
  } // InventoryConfiguration

}

final class GetBucketInventoryConfigurationResponseOps(val self: GetBucketInventoryConfigurationResponse)
    extends AnyVal {

  final def inventoryConfigurationAsScala: Option[InventoryConfiguration] =
    Option(self.inventoryConfiguration) // InventoryConfiguration

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
