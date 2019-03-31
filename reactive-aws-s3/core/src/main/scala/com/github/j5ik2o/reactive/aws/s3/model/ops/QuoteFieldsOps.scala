// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ QuoteFields => ScalaQuoteFields, _ }
import software.amazon.awssdk.services.s3.model.{ QuoteFields => JavaQuoteFields }

object QuoteFieldsOps {

  implicit class ScalaQuoteFieldsOps(val self: ScalaQuoteFields) extends AnyVal {

    def toJava: JavaQuoteFields = {
      JavaQuoteFields.valueOf(self.entryName)
    }

  }

  implicit class JavaQuoteFieldsOps(val self: JavaQuoteFields) extends AnyVal {

    def toScala: ScalaQuoteFields = {
      ScalaQuoteFields.withName(self.toString)
    }

  }

}
