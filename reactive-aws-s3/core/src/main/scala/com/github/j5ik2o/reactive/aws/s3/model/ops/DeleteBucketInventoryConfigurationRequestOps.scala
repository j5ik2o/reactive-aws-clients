// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketInventoryConfigurationRequestBuilderOps(
    val self: DeleteBucketInventoryConfigurationRequest.Builder
) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): DeleteBucketInventoryConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withIdAsScala(value: Option[String]): DeleteBucketInventoryConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

}

final class DeleteBucketInventoryConfigurationRequestOps(val self: DeleteBucketInventoryConfigurationRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def idAsScala: Option[String] = Option(self.id) // String

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
