// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ CreateBucketConfiguration => ScalaCreateBucketConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ CreateBucketConfiguration => JavaCreateBucketConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateBucketConfigurationOps {

  implicit class ScalaCreateBucketConfigurationOps(val self: ScalaCreateBucketConfiguration) extends AnyVal {

    def toJava: JavaCreateBucketConfiguration = {
      val result = JavaCreateBucketConfiguration.builder()
      self.locationConstraint.foreach { v =>
        import BucketLocationConstraintOps._; result.locationConstraint(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaCreateBucketConfigurationOps(val self: JavaCreateBucketConfiguration) extends AnyVal {

    def toScala: ScalaCreateBucketConfiguration = {
      ScalaCreateBucketConfiguration()
        .withLocationConstraint(Option(self.locationConstraint).map { v =>
          import BucketLocationConstraintOps._; v.toScala
        }) // String
    }

  }

}
