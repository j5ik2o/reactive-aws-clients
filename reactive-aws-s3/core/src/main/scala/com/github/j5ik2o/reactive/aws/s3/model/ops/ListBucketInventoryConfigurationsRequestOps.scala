// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketInventoryConfigurationsRequestBuilderOps(
    val self: ListBucketInventoryConfigurationsRequest.Builder
) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): ListBucketInventoryConfigurationsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withContinuationTokenAsScala(value: Option[String]): ListBucketInventoryConfigurationsRequest.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  } // String

}

final class ListBucketInventoryConfigurationsRequestOps(val self: ListBucketInventoryConfigurationsRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketInventoryConfigurationsRequestOps {

  implicit def toListBucketInventoryConfigurationsRequestBuilderOps(
      v: ListBucketInventoryConfigurationsRequest.Builder
  ): ListBucketInventoryConfigurationsRequestBuilderOps = new ListBucketInventoryConfigurationsRequestBuilderOps(v)

  implicit def toListBucketInventoryConfigurationsRequestOps(
      v: ListBucketInventoryConfigurationsRequest
  ): ListBucketInventoryConfigurationsRequestOps = new ListBucketInventoryConfigurationsRequestOps(v)

}
