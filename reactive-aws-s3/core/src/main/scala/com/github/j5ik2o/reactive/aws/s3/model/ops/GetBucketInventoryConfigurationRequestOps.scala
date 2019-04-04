// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketInventoryConfigurationRequestBuilderOps(val self: GetBucketInventoryConfigurationRequest.Builder)
    extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetBucketInventoryConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withIdAsScala(value: Option[String]): GetBucketInventoryConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

}

final class GetBucketInventoryConfigurationRequestOps(val self: GetBucketInventoryConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def idAsScala: Option[String] = Option(self.id) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketInventoryConfigurationRequestOps {

  implicit def toGetBucketInventoryConfigurationRequestBuilderOps(
      v: GetBucketInventoryConfigurationRequest.Builder
  ): GetBucketInventoryConfigurationRequestBuilderOps = new GetBucketInventoryConfigurationRequestBuilderOps(v)

  implicit def toGetBucketInventoryConfigurationRequestOps(
      v: GetBucketInventoryConfigurationRequest
  ): GetBucketInventoryConfigurationRequestOps = new GetBucketInventoryConfigurationRequestOps(v)

}
