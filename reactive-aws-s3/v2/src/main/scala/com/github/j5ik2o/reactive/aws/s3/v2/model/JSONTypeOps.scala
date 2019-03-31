// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ JSONType => ScalaJSONType, _ }
import software.amazon.awssdk.services.s3.model.{ JSONType => JavaJSONType }

object JSONTypeOps {

  implicit class ScalaJSONTypeOps(val self: ScalaJSONType) extends AnyVal {

    def toJava: JavaJSONType = {
      JavaJSONType.valueOf(self.entryName)
    }

  }

  implicit class JavaJSONTypeOps(val self: JavaJSONType) extends AnyVal {

    def toScala: ScalaJSONType = {
      ScalaJSONType.withName(self.toString)
    }

  }

}
