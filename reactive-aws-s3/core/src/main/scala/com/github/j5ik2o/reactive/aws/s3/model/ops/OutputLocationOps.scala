// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ OutputLocation => ScalaOutputLocation, _ }
import software.amazon.awssdk.services.s3.model.{ OutputLocation => JavaOutputLocation }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object OutputLocationOps {

  implicit class ScalaOutputLocationOps(val self: ScalaOutputLocation) extends AnyVal {

    def toJava: JavaOutputLocation = {
      val result = JavaOutputLocation.builder()
      self.s3.foreach { v =>
        import S3LocationOps._; result.s3(v.toJava)
      } // S3Location

      result.build()
    }

  }

  implicit class JavaOutputLocationOps(val self: JavaOutputLocation) extends AnyVal {

    def toScala: ScalaOutputLocation = {
      ScalaOutputLocation()
        .withS3(Option(self.s3).map { v =>
          import S3LocationOps._; v.toScala
        }) // S3Location
    }

  }

}
