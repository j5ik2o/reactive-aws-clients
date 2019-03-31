// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ BucketLoggingStatus => ScalaBucketLoggingStatus, _ }
import software.amazon.awssdk.services.s3.model.{ BucketLoggingStatus => JavaBucketLoggingStatus }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BucketLoggingStatusOps {

  implicit class ScalaBucketLoggingStatusOps(val self: ScalaBucketLoggingStatus) extends AnyVal {

    def toJava: JavaBucketLoggingStatus = {
      val result = JavaBucketLoggingStatus.builder()
      self.loggingEnabled.foreach { v =>
        import LoggingEnabledOps._; result.loggingEnabled(v.toJava)
      } // LoggingEnabled

      result.build()
    }

  }

  implicit class JavaBucketLoggingStatusOps(val self: JavaBucketLoggingStatus) extends AnyVal {

    def toScala: ScalaBucketLoggingStatus = {
      ScalaBucketLoggingStatus()
        .withLoggingEnabled(Option(self.loggingEnabled).map { v =>
          import LoggingEnabledOps._; v.toScala
        }) // LoggingEnabled
    }

  }

}
