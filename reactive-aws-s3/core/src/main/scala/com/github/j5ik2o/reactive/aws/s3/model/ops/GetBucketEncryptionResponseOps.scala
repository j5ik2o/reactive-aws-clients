// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketEncryptionResponseBuilderOps(val self: GetBucketEncryptionResponse.Builder) extends AnyVal {

  final def withServerSideEncryptionConfigurationAsScala(
      value: Option[ServerSideEncryptionConfiguration]
  ): GetBucketEncryptionResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryptionConfiguration(v)
    }
  } // ServerSideEncryptionConfiguration

}

final class GetBucketEncryptionResponseOps(val self: GetBucketEncryptionResponse) extends AnyVal {

  final def serverSideEncryptionConfigurationAsScala: Option[ServerSideEncryptionConfiguration] =
    Option(self.serverSideEncryptionConfiguration) // ServerSideEncryptionConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketEncryptionResponseOps {

  implicit def toGetBucketEncryptionResponseBuilderOps(
      v: GetBucketEncryptionResponse.Builder
  ): GetBucketEncryptionResponseBuilderOps = new GetBucketEncryptionResponseBuilderOps(v)

  implicit def toGetBucketEncryptionResponseOps(v: GetBucketEncryptionResponse): GetBucketEncryptionResponseOps =
    new GetBucketEncryptionResponseOps(v)

}
