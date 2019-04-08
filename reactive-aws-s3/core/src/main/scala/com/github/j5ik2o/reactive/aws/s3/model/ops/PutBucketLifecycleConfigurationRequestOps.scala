// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketLifecycleConfigurationRequestBuilderOps(val self: PutBucketLifecycleConfigurationRequest.Builder)
    extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutBucketLifecycleConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def lifecycleConfigurationAsScala(
      value: Option[BucketLifecycleConfiguration]
  ): PutBucketLifecycleConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.lifecycleConfiguration(v)
    }
  } // BucketLifecycleConfiguration

}

final class PutBucketLifecycleConfigurationRequestOps(val self: PutBucketLifecycleConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def lifecycleConfigurationAsScala: Option[BucketLifecycleConfiguration] =
    Option(self.lifecycleConfiguration) // BucketLifecycleConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketLifecycleConfigurationRequestOps {

  implicit def toPutBucketLifecycleConfigurationRequestBuilderOps(
      v: PutBucketLifecycleConfigurationRequest.Builder
  ): PutBucketLifecycleConfigurationRequestBuilderOps = new PutBucketLifecycleConfigurationRequestBuilderOps(v)

  implicit def toPutBucketLifecycleConfigurationRequestOps(
      v: PutBucketLifecycleConfigurationRequest
  ): PutBucketLifecycleConfigurationRequestOps = new PutBucketLifecycleConfigurationRequestOps(v)

}
