// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutPublicAccessBlockRequestBuilderOps(val self: PutPublicAccessBlockRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutPublicAccessBlockRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala(value: Option[String]): PutPublicAccessBlockRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicAccessBlockConfigurationAsScala(
      value: Option[PublicAccessBlockConfiguration]
  ): PutPublicAccessBlockRequest.Builder = {
    value.fold(self) { v =>
      self.publicAccessBlockConfiguration(v)
    }
  }

}

final class PutPublicAccessBlockRequestOps(val self: PutPublicAccessBlockRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicAccessBlockConfigurationAsScala: Option[PublicAccessBlockConfiguration] =
    Option(self.publicAccessBlockConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutPublicAccessBlockRequestOps {

  implicit def toPutPublicAccessBlockRequestBuilderOps(
      v: PutPublicAccessBlockRequest.Builder
  ): PutPublicAccessBlockRequestBuilderOps = new PutPublicAccessBlockRequestBuilderOps(v)

  implicit def toPutPublicAccessBlockRequestOps(v: PutPublicAccessBlockRequest): PutPublicAccessBlockRequestOps =
    new PutPublicAccessBlockRequestOps(v)

}
