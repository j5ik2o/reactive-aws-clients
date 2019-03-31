// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ JSONInput => ScalaJSONInput, _ }
import software.amazon.awssdk.services.s3.model.{ JSONInput => JavaJSONInput }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object JSONInputOps {

  implicit class ScalaJSONInputOps(val self: ScalaJSONInput) extends AnyVal {

    def toJava: JavaJSONInput = {
      val result = JavaJSONInput.builder()
      self.`type`.foreach { v =>
        import JSONTypeOps._; result.`type`(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaJSONInputOps(val self: JavaJSONInput) extends AnyVal {

    def toScala: ScalaJSONInput = {
      ScalaJSONInput()
        .withType(Option(self.`type`).map { v =>
          import JSONTypeOps._; v.toScala
        }) // String
    }

  }

}
