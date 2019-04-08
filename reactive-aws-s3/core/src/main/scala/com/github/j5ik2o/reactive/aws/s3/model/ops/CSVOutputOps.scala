// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CSVOutputBuilderOps(val self: CSVOutput.Builder) extends AnyVal {

  final def quoteFieldsAsScala(value: Option[QuoteFields]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.quoteFields(v)
    }
  } // String

  final def quoteEscapeCharacterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.quoteEscapeCharacter(v)
    }
  } // String

  final def recordDelimiterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.recordDelimiter(v)
    }
  } // String

  final def fieldDelimiterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.fieldDelimiter(v)
    }
  } // String

  final def quoteCharacterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.quoteCharacter(v)
    }
  } // String

}

final class CSVOutputOps(val self: CSVOutput) extends AnyVal {

  final def quoteFieldsAsScala: Option[QuoteFields] = Option(self.quoteFields) // String

  final def quoteEscapeCharacterAsScala: Option[String] = Option(self.quoteEscapeCharacter) // String

  final def recordDelimiterAsScala: Option[String] = Option(self.recordDelimiter) // String

  final def fieldDelimiterAsScala: Option[String] = Option(self.fieldDelimiter) // String

  final def quoteCharacterAsScala: Option[String] = Option(self.quoteCharacter) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCSVOutputOps {

  implicit def toCSVOutputBuilderOps(v: CSVOutput.Builder): CSVOutputBuilderOps = new CSVOutputBuilderOps(v)

  implicit def toCSVOutputOps(v: CSVOutput): CSVOutputOps = new CSVOutputOps(v)

}
