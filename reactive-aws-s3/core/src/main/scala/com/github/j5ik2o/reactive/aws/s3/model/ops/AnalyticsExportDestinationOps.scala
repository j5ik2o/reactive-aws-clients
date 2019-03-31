// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ AnalyticsExportDestination => ScalaAnalyticsExportDestination, _ }
import software.amazon.awssdk.services.s3.model.{ AnalyticsExportDestination => JavaAnalyticsExportDestination }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AnalyticsExportDestinationOps {

  implicit class ScalaAnalyticsExportDestinationOps(val self: ScalaAnalyticsExportDestination) extends AnyVal {

    def toJava: JavaAnalyticsExportDestination = {
      val result = JavaAnalyticsExportDestination.builder()
      self.s3BucketDestination.foreach { v =>
        import AnalyticsS3BucketDestinationOps._; result.s3BucketDestination(v.toJava)
      } // AnalyticsS3BucketDestination

      result.build()
    }

  }

  implicit class JavaAnalyticsExportDestinationOps(val self: JavaAnalyticsExportDestination) extends AnyVal {

    def toScala: ScalaAnalyticsExportDestination = {
      ScalaAnalyticsExportDestination()
        .withS3BucketDestination(Option(self.s3BucketDestination).map { v =>
          import AnalyticsS3BucketDestinationOps._; v.toScala
        }) // AnalyticsS3BucketDestination
    }

  }

}
