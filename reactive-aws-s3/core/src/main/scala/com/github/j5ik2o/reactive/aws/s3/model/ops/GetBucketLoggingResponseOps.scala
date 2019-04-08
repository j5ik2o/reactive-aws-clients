// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketLoggingResponseBuilderOps(val self: GetBucketLoggingResponse.Builder) extends AnyVal {

  final def loggingEnabledAsScala(value: Option[LoggingEnabled]): GetBucketLoggingResponse.Builder = {
    value.fold(self) { v =>
      self.loggingEnabled(v)
    }
  }

}

final class GetBucketLoggingResponseOps(val self: GetBucketLoggingResponse) extends AnyVal {

  final def loggingEnabledAsScala: Option[LoggingEnabled] = Option(self.loggingEnabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketLoggingResponseOps {

  implicit def toGetBucketLoggingResponseBuilderOps(
      v: GetBucketLoggingResponse.Builder
  ): GetBucketLoggingResponseBuilderOps = new GetBucketLoggingResponseBuilderOps(v)

  implicit def toGetBucketLoggingResponseOps(v: GetBucketLoggingResponse): GetBucketLoggingResponseOps =
    new GetBucketLoggingResponseOps(v)

}
