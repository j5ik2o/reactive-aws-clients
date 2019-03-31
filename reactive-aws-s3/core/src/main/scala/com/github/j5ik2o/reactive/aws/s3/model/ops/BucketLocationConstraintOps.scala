// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ BucketLocationConstraint => ScalaBucketLocationConstraint, _ }
import software.amazon.awssdk.services.s3.model.{ BucketLocationConstraint => JavaBucketLocationConstraint }

object BucketLocationConstraintOps {

  implicit class ScalaBucketLocationConstraintOps(val self: ScalaBucketLocationConstraint) extends AnyVal {

    def toJava: JavaBucketLocationConstraint = {
      JavaBucketLocationConstraint.valueOf(self.entryName)
    }

  }

  implicit class JavaBucketLocationConstraintOps(val self: JavaBucketLocationConstraint) extends AnyVal {

    def toScala: ScalaBucketLocationConstraint = {
      ScalaBucketLocationConstraint.withName(self.toString)
    }

  }

}
