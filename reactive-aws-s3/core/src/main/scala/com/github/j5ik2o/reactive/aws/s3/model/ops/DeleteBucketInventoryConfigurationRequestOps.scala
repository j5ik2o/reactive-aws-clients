// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketInventoryConfigurationRequestBuilderOps(
    val self: DeleteBucketInventoryConfigurationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): DeleteBucketInventoryConfigurationRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): DeleteBucketInventoryConfigurationRequest.Builder = {
    value.fold(self) { v => self.id(v) }
  }

}

final class DeleteBucketInventoryConfigurationRequestOps(val self: DeleteBucketInventoryConfigurationRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketInventoryConfigurationRequestOps {

  implicit def toDeleteBucketInventoryConfigurationRequestBuilderOps(
      v: DeleteBucketInventoryConfigurationRequest.Builder
  ): DeleteBucketInventoryConfigurationRequestBuilderOps = new DeleteBucketInventoryConfigurationRequestBuilderOps(v)

  implicit def toDeleteBucketInventoryConfigurationRequestOps(
      v: DeleteBucketInventoryConfigurationRequest
  ): DeleteBucketInventoryConfigurationRequestOps = new DeleteBucketInventoryConfigurationRequestOps(v)

}
