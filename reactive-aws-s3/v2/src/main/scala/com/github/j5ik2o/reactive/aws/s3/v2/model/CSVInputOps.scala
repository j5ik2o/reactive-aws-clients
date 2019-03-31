// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ CSVInput => ScalaCSVInput, _ }
import software.amazon.awssdk.services.s3.model.{ CSVInput => JavaCSVInput }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CSVInputOps {

  implicit class ScalaCSVInputOps(val self: ScalaCSVInput) extends AnyVal {

    def toJava: JavaCSVInput = {
      val result = JavaCSVInput.builder()
      self.fileHeaderInfo.foreach { v =>
        import FileHeaderInfoOps._; result.fileHeaderInfo(v.toJava)
      } // String
      self.comments.filter(_.nonEmpty).foreach(v => result.comments(v))                                      // String
      self.quoteEscapeCharacter.filter(_.nonEmpty).foreach(v => result.quoteEscapeCharacter(v))              // String
      self.recordDelimiter.filter(_.nonEmpty).foreach(v => result.recordDelimiter(v))                        // String
      self.fieldDelimiter.filter(_.nonEmpty).foreach(v => result.fieldDelimiter(v))                          // String
      self.quoteCharacter.filter(_.nonEmpty).foreach(v => result.quoteCharacter(v))                          // String
      self.allowQuotedRecordDelimiter.map(_.booleanValue).foreach(v => result.allowQuotedRecordDelimiter(v)) // Boolean

      result.build()
    }

  }

  implicit class JavaCSVInputOps(val self: JavaCSVInput) extends AnyVal {

    def toScala: ScalaCSVInput = {
      ScalaCSVInput()
        .withFileHeaderInfo(Option(self.fileHeaderInfo).map { v =>
          import FileHeaderInfoOps._; v.toScala
        }) // String
        .withComments(Option(self.comments)) // String
        .withQuoteEscapeCharacter(Option(self.quoteEscapeCharacter)) // String
        .withRecordDelimiter(Option(self.recordDelimiter)) // String
        .withFieldDelimiter(Option(self.fieldDelimiter)) // String
        .withQuoteCharacter(Option(self.quoteCharacter)) // String
        .withAllowQuotedRecordDelimiter(Option(self.allowQuotedRecordDelimiter).map(_.booleanValue)) // Boolean
    }

  }

}
