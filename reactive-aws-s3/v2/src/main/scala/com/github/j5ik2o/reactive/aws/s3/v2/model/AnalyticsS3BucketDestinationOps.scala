// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ AnalyticsS3BucketDestination => ScalaAnalyticsS3BucketDestination, _ }
import software.amazon.awssdk.services.s3.model.{ AnalyticsS3BucketDestination => JavaAnalyticsS3BucketDestination }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AnalyticsS3BucketDestinationOps {

  implicit class ScalaAnalyticsS3BucketDestinationOps(val self: ScalaAnalyticsS3BucketDestination) extends AnyVal {

    def toJava: JavaAnalyticsS3BucketDestination = {
      val result = JavaAnalyticsS3BucketDestination.builder()
      self.format.foreach { v =>
        import AnalyticsS3ExportFileFormatOps._; result.format(v.toJava)
      } // String
      self.bucketAccountId.filter(_.nonEmpty).foreach(v => result.bucketAccountId(v)) // String
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                   // String
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v))                   // String

      result.build()
    }

  }

  implicit class JavaAnalyticsS3BucketDestinationOps(val self: JavaAnalyticsS3BucketDestination) extends AnyVal {

    def toScala: ScalaAnalyticsS3BucketDestination = {
      ScalaAnalyticsS3BucketDestination()
        .withFormat(Option(self.format).map { v =>
          import AnalyticsS3ExportFileFormatOps._; v.toScala
        }) // String
        .withBucketAccountId(Option(self.bucketAccountId)) // String
        .withBucket(Option(self.bucket)) // String
        .withPrefix(Option(self.prefix)) // String
    }

  }

}
