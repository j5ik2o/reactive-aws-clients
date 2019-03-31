// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ BucketAccelerateStatus => ScalaBucketAccelerateStatus, _ }
import software.amazon.awssdk.services.s3.model.{ BucketAccelerateStatus => JavaBucketAccelerateStatus }

object BucketAccelerateStatusOps {

  implicit class ScalaBucketAccelerateStatusOps(val self: ScalaBucketAccelerateStatus) extends AnyVal {

    def toJava: JavaBucketAccelerateStatus = {
      JavaBucketAccelerateStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaBucketAccelerateStatusOps(val self: JavaBucketAccelerateStatus) extends AnyVal {

    def toScala: ScalaBucketAccelerateStatus = {
      ScalaBucketAccelerateStatus.withName(self.toString)
    }

  }

}
