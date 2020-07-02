// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketInventoryConfigurationRequestBuilderOps(val self: GetBucketInventoryConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketInventoryConfigurationRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): GetBucketInventoryConfigurationRequest.Builder = {
    value.fold(self) { v => self.id(v) }
  }

}

final class GetBucketInventoryConfigurationRequestOps(val self: GetBucketInventoryConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

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
