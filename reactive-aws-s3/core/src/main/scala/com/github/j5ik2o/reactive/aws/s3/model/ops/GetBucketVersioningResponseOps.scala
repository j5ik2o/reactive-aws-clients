// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketVersioningResponseBuilderOps(val self: GetBucketVersioningResponse.Builder) extends AnyVal {

  final def statusAsScala(value: Option[BucketVersioningStatus]): GetBucketVersioningResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def mfaDeleteAsScala(value: Option[MFADeleteStatus]): GetBucketVersioningResponse.Builder = {
    value.fold(self) { v =>
      self.mfaDelete(v)
    }
  }

}

final class GetBucketVersioningResponseOps(val self: GetBucketVersioningResponse) extends AnyVal {

  final def statusAsScala: Option[BucketVersioningStatus] = Option(self.status)

  final def mfaDeleteAsScala: Option[MFADeleteStatus] = Option(self.mfaDelete)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketVersioningResponseOps {

  implicit def toGetBucketVersioningResponseBuilderOps(
      v: GetBucketVersioningResponse.Builder
  ): GetBucketVersioningResponseBuilderOps = new GetBucketVersioningResponseBuilderOps(v)

  implicit def toGetBucketVersioningResponseOps(v: GetBucketVersioningResponse): GetBucketVersioningResponseOps =
    new GetBucketVersioningResponseOps(v)

}
