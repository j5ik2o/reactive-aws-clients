// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class BucketLoggingStatusBuilderOps(val self: BucketLoggingStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingEnabledAsScala(value: Option[LoggingEnabled]): BucketLoggingStatus.Builder = {
    value.fold(self) { v =>
      self.loggingEnabled(v)
    }
  }

}

final class BucketLoggingStatusOps(val self: BucketLoggingStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingEnabledAsScala: Option[LoggingEnabled] = Option(self.loggingEnabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBucketLoggingStatusOps {

  implicit def toBucketLoggingStatusBuilderOps(v: BucketLoggingStatus.Builder): BucketLoggingStatusBuilderOps =
    new BucketLoggingStatusBuilderOps(v)

  implicit def toBucketLoggingStatusOps(v: BucketLoggingStatus): BucketLoggingStatusOps = new BucketLoggingStatusOps(v)

}
