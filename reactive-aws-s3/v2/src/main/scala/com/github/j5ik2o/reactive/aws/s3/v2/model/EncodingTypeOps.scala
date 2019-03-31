// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ EncodingType => ScalaEncodingType, _ }
import software.amazon.awssdk.services.s3.model.{ EncodingType => JavaEncodingType }

object EncodingTypeOps {

  implicit class ScalaEncodingTypeOps(val self: ScalaEncodingType) extends AnyVal {

    def toJava: JavaEncodingType = {
      JavaEncodingType.valueOf(self.entryName)
    }

  }

  implicit class JavaEncodingTypeOps(val self: JavaEncodingType) extends AnyVal {

    def toScala: ScalaEncodingType = {
      ScalaEncodingType.withName(self.toString)
    }

  }

}
