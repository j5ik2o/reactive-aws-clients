// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketCorsRequestBuilderOps(val self: PutBucketCorsRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutBucketCorsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withCorsConfigurationAsScala(value: Option[CORSConfiguration]): PutBucketCorsRequest.Builder = {
    value.fold(self) { v =>
      self.corsConfiguration(v)
    }
  } // CORSConfiguration

  final def withContentMD5AsScala(value: Option[String]): PutBucketCorsRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

}

final class PutBucketCorsRequestOps(val self: PutBucketCorsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def corsConfigurationAsScala: Option[CORSConfiguration] = Option(self.corsConfiguration) // CORSConfiguration

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketCorsRequestOps {

  implicit def toPutBucketCorsRequestBuilderOps(v: PutBucketCorsRequest.Builder): PutBucketCorsRequestBuilderOps =
    new PutBucketCorsRequestBuilderOps(v)

  implicit def toPutBucketCorsRequestOps(v: PutBucketCorsRequest): PutBucketCorsRequestOps =
    new PutBucketCorsRequestOps(v)

}
