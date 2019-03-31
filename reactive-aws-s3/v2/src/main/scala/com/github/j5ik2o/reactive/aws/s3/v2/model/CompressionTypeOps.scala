// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ CompressionType => ScalaCompressionType, _ }
import software.amazon.awssdk.services.s3.model.{ CompressionType => JavaCompressionType }

object CompressionTypeOps {

  implicit class ScalaCompressionTypeOps(val self: ScalaCompressionType) extends AnyVal {

    def toJava: JavaCompressionType = {
      JavaCompressionType.valueOf(self.entryName)
    }

  }

  implicit class JavaCompressionTypeOps(val self: JavaCompressionType) extends AnyVal {

    def toScala: ScalaCompressionType = {
      ScalaCompressionType.withName(self.toString)
    }

  }

}
