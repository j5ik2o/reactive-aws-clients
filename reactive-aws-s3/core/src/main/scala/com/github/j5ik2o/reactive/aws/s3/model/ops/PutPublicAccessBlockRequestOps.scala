// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutPublicAccessBlockRequestBuilderOps(val self: PutPublicAccessBlockRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutPublicAccessBlockRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withContentMD5AsScala(value: Option[String]): PutPublicAccessBlockRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def withPublicAccessBlockConfigurationAsScala(
      value: Option[PublicAccessBlockConfiguration]
  ): PutPublicAccessBlockRequest.Builder = {
    value.fold(self) { v =>
      self.publicAccessBlockConfiguration(v)
    }
  } // PublicAccessBlockConfiguration

}

final class PutPublicAccessBlockRequestOps(val self: PutPublicAccessBlockRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def publicAccessBlockConfigurationAsScala: Option[PublicAccessBlockConfiguration] =
    Option(self.publicAccessBlockConfiguration) // PublicAccessBlockConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutPublicAccessBlockRequestOps {

  implicit def toPutPublicAccessBlockRequestBuilderOps(
      v: PutPublicAccessBlockRequest.Builder
  ): PutPublicAccessBlockRequestBuilderOps = new PutPublicAccessBlockRequestBuilderOps(v)

  implicit def toPutPublicAccessBlockRequestOps(v: PutPublicAccessBlockRequest): PutPublicAccessBlockRequestOps =
    new PutPublicAccessBlockRequestOps(v)

}
