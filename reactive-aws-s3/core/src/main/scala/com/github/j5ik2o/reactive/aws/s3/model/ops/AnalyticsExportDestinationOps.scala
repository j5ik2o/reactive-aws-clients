// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AnalyticsExportDestinationBuilderOps(val self: AnalyticsExportDestination.Builder) extends AnyVal {

  final def s3BucketDestinationAsScala(
      value: Option[AnalyticsS3BucketDestination]
  ): AnalyticsExportDestination.Builder = {
    value.fold(self) { v =>
      self.s3BucketDestination(v)
    }
  }

}

final class AnalyticsExportDestinationOps(val self: AnalyticsExportDestination) extends AnyVal {

  final def s3BucketDestinationAsScala: Option[AnalyticsS3BucketDestination] = Option(self.s3BucketDestination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnalyticsExportDestinationOps {

  implicit def toAnalyticsExportDestinationBuilderOps(
      v: AnalyticsExportDestination.Builder
  ): AnalyticsExportDestinationBuilderOps = new AnalyticsExportDestinationBuilderOps(v)

  implicit def toAnalyticsExportDestinationOps(v: AnalyticsExportDestination): AnalyticsExportDestinationOps =
    new AnalyticsExportDestinationOps(v)

}
