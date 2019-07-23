// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateStorageLocationResponseBuilderOps(val self: CreateStorageLocationResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala(value: Option[String]): CreateStorageLocationResponse.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  }

}

final class CreateStorageLocationResponseOps(val self: CreateStorageLocationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStorageLocationResponseOps {

  implicit def toCreateStorageLocationResponseBuilderOps(
      v: CreateStorageLocationResponse.Builder
  ): CreateStorageLocationResponseBuilderOps = new CreateStorageLocationResponseBuilderOps(v)

  implicit def toCreateStorageLocationResponseOps(v: CreateStorageLocationResponse): CreateStorageLocationResponseOps =
    new CreateStorageLocationResponseOps(v)

}
