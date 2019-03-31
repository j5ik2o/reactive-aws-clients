// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Type => ScalaType, _ }
import software.amazon.awssdk.services.s3.model.{ Type => JavaType }

object TypeOps {

  implicit class ScalaTypeOps(val self: ScalaType) extends AnyVal {

    def toJava: JavaType = {
      JavaType.valueOf(self.entryName)
    }

  }

  implicit class JavaTypeOps(val self: JavaType) extends AnyVal {

    def toScala: ScalaType = {
      ScalaType.withName(self.toString)
    }

  }

}
