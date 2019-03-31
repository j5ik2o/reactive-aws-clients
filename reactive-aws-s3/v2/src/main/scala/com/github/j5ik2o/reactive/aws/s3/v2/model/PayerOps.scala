// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ Payer => ScalaPayer, _ }
import software.amazon.awssdk.services.s3.model.{ Payer => JavaPayer }

object PayerOps {

  implicit class ScalaPayerOps(val self: ScalaPayer) extends AnyVal {

    def toJava: JavaPayer = {
      JavaPayer.valueOf(self.entryName)
    }

  }

  implicit class JavaPayerOps(val self: JavaPayer) extends AnyVal {

    def toScala: ScalaPayer = {
      ScalaPayer.withName(self.toString)
    }

  }

}
