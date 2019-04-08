// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AnalyticsS3BucketDestinationBuilderOps(val self: AnalyticsS3BucketDestination.Builder) extends AnyVal {

  final def formatAsScala(value: Option[AnalyticsS3ExportFileFormat]): AnalyticsS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  final def bucketAccountIdAsScala(value: Option[String]): AnalyticsS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.bucketAccountId(v)
    }
  }

  final def bucketAsScala(value: Option[String]): AnalyticsS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def prefixAsScala(value: Option[String]): AnalyticsS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

}

final class AnalyticsS3BucketDestinationOps(val self: AnalyticsS3BucketDestination) extends AnyVal {

  final def formatAsScala: Option[AnalyticsS3ExportFileFormat] = Option(self.format)

  final def bucketAccountIdAsScala: Option[String] = Option(self.bucketAccountId)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def prefixAsScala: Option[String] = Option(self.prefix)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnalyticsS3BucketDestinationOps {

  implicit def toAnalyticsS3BucketDestinationBuilderOps(
      v: AnalyticsS3BucketDestination.Builder
  ): AnalyticsS3BucketDestinationBuilderOps = new AnalyticsS3BucketDestinationBuilderOps(v)

  implicit def toAnalyticsS3BucketDestinationOps(v: AnalyticsS3BucketDestination): AnalyticsS3BucketDestinationOps =
    new AnalyticsS3BucketDestinationOps(v)

}
