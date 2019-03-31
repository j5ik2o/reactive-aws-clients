// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ JSONOutput => ScalaJSONOutput, _ }
import software.amazon.awssdk.services.s3.model.{ JSONOutput => JavaJSONOutput }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object JSONOutputOps {

  implicit class ScalaJSONOutputOps(val self: ScalaJSONOutput) extends AnyVal {

    def toJava: JavaJSONOutput = {
      val result = JavaJSONOutput.builder()
      self.recordDelimiter.filter(_.nonEmpty).foreach(v => result.recordDelimiter(v)) // String

      result.build()
    }

  }

  implicit class JavaJSONOutputOps(val self: JavaJSONOutput) extends AnyVal {

    def toScala: ScalaJSONOutput = {
      ScalaJSONOutput()
        .withRecordDelimiter(Option(self.recordDelimiter)) // String
    }

  }

}
