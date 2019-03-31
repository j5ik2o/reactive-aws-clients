// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ CSVOutput => ScalaCSVOutput, _ }
import software.amazon.awssdk.services.s3.model.{ CSVOutput => JavaCSVOutput }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CSVOutputOps {

  implicit class ScalaCSVOutputOps(val self: ScalaCSVOutput) extends AnyVal {

    def toJava: JavaCSVOutput = {
      val result = JavaCSVOutput.builder()
      self.quoteFields.foreach { v =>
        import QuoteFieldsOps._; result.quoteFields(v.toJava)
      } // String
      self.quoteEscapeCharacter.filter(_.nonEmpty).foreach(v => result.quoteEscapeCharacter(v)) // String
      self.recordDelimiter.filter(_.nonEmpty).foreach(v => result.recordDelimiter(v))           // String
      self.fieldDelimiter.filter(_.nonEmpty).foreach(v => result.fieldDelimiter(v))             // String
      self.quoteCharacter.filter(_.nonEmpty).foreach(v => result.quoteCharacter(v))             // String

      result.build()
    }

  }

  implicit class JavaCSVOutputOps(val self: JavaCSVOutput) extends AnyVal {

    def toScala: ScalaCSVOutput = {
      ScalaCSVOutput()
        .withQuoteFields(Option(self.quoteFields).map { v =>
          import QuoteFieldsOps._; v.toScala
        }) // String
        .withQuoteEscapeCharacter(Option(self.quoteEscapeCharacter)) // String
        .withRecordDelimiter(Option(self.recordDelimiter)) // String
        .withFieldDelimiter(Option(self.fieldDelimiter)) // String
        .withQuoteCharacter(Option(self.quoteCharacter)) // String
    }

  }

}
