// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketCorsRequestBuilderOps(val self: PutBucketCorsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutBucketCorsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def corsConfigurationAsScala(value: Option[CORSConfiguration]): PutBucketCorsRequest.Builder = {
    value.fold(self) { v =>
      self.corsConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala(value: Option[String]): PutBucketCorsRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

}

final class PutBucketCorsRequestOps(val self: PutBucketCorsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def corsConfigurationAsScala: Option[CORSConfiguration] = Option(self.corsConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketCorsRequestOps {

  implicit def toPutBucketCorsRequestBuilderOps(v: PutBucketCorsRequest.Builder): PutBucketCorsRequestBuilderOps =
    new PutBucketCorsRequestBuilderOps(v)

  implicit def toPutBucketCorsRequestOps(v: PutBucketCorsRequest): PutBucketCorsRequestOps =
    new PutBucketCorsRequestOps(v)

}
