// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetPublicAccessBlockResponseBuilderOps(val self: GetPublicAccessBlockResponse.Builder) extends AnyVal {

  final def publicAccessBlockConfigurationAsScala(
      value: Option[PublicAccessBlockConfiguration]
  ): GetPublicAccessBlockResponse.Builder = {
    value.fold(self) { v =>
      self.publicAccessBlockConfiguration(v)
    }
  }

}

final class GetPublicAccessBlockResponseOps(val self: GetPublicAccessBlockResponse) extends AnyVal {

  final def publicAccessBlockConfigurationAsScala: Option[PublicAccessBlockConfiguration] =
    Option(self.publicAccessBlockConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPublicAccessBlockResponseOps {

  implicit def toGetPublicAccessBlockResponseBuilderOps(
      v: GetPublicAccessBlockResponse.Builder
  ): GetPublicAccessBlockResponseBuilderOps = new GetPublicAccessBlockResponseBuilderOps(v)

  implicit def toGetPublicAccessBlockResponseOps(v: GetPublicAccessBlockResponse): GetPublicAccessBlockResponseOps =
    new GetPublicAccessBlockResponseOps(v)

}
