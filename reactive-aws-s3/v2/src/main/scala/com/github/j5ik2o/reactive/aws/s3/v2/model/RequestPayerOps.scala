// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ RequestPayer => ScalaRequestPayer, _ }
import software.amazon.awssdk.services.s3.model.{ RequestPayer => JavaRequestPayer }

object RequestPayerOps {

  implicit class ScalaRequestPayerOps(val self: ScalaRequestPayer) extends AnyVal {

    def toJava: JavaRequestPayer = {
      JavaRequestPayer.valueOf(self.entryName)
    }

  }

  implicit class JavaRequestPayerOps(val self: JavaRequestPayer) extends AnyVal {

    def toScala: ScalaRequestPayer = {
      ScalaRequestPayer.withName(self.toString)
    }

  }

}
