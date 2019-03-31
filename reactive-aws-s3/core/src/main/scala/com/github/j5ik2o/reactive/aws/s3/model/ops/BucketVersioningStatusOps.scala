// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ BucketVersioningStatus => ScalaBucketVersioningStatus, _ }
import software.amazon.awssdk.services.s3.model.{ BucketVersioningStatus => JavaBucketVersioningStatus }

object BucketVersioningStatusOps {

  implicit class ScalaBucketVersioningStatusOps(val self: ScalaBucketVersioningStatus) extends AnyVal {

    def toJava: JavaBucketVersioningStatus = {
      JavaBucketVersioningStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaBucketVersioningStatusOps(val self: JavaBucketVersioningStatus) extends AnyVal {

    def toScala: ScalaBucketVersioningStatus = {
      ScalaBucketVersioningStatus.withName(self.toString)
    }

  }

}
