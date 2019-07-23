// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketLifecycleConfigurationRequestBuilderOps(val self: PutBucketLifecycleConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutBucketLifecycleConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecycleConfigurationAsScala(
      value: Option[BucketLifecycleConfiguration]
  ): PutBucketLifecycleConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.lifecycleConfiguration(v)
    }
  }

}

final class PutBucketLifecycleConfigurationRequestOps(val self: PutBucketLifecycleConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecycleConfigurationAsScala: Option[BucketLifecycleConfiguration] = Option(self.lifecycleConfiguration)

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
