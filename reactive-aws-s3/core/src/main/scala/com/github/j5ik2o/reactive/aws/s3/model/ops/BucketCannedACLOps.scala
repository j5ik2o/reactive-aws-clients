// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ BucketCannedACL => ScalaBucketCannedACL, _ }
import software.amazon.awssdk.services.s3.model.{ BucketCannedACL => JavaBucketCannedACL }

object BucketCannedACLOps {

  implicit class ScalaBucketCannedACLOps(val self: ScalaBucketCannedACL) extends AnyVal {

    def toJava: JavaBucketCannedACL = {
      JavaBucketCannedACL.valueOf(self.entryName)
    }

  }

  implicit class JavaBucketCannedACLOps(val self: JavaBucketCannedACL) extends AnyVal {

    def toScala: ScalaBucketCannedACL = {
      ScalaBucketCannedACL.withName(self.toString)
    }

  }

}
