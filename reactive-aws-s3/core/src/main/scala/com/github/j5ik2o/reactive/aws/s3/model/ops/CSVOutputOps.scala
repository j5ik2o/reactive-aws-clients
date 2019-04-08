// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CSVOutputBuilderOps(val self: CSVOutput.Builder) extends AnyVal {

  final def quoteFieldsAsScala(value: Option[QuoteFields]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.quoteFields(v)
    }
  }

  final def quoteEscapeCharacterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.quoteEscapeCharacter(v)
    }
  }

  final def recordDelimiterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.recordDelimiter(v)
    }
  }

  final def fieldDelimiterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.fieldDelimiter(v)
    }
  }

  final def quoteCharacterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v =>
      self.quoteCharacter(v)
    }
  }

}

final class CSVOutputOps(val self: CSVOutput) extends AnyVal {

  final def quoteFieldsAsScala: Option[QuoteFields] = Option(self.quoteFields)

  final def quoteEscapeCharacterAsScala: Option[String] = Option(self.quoteEscapeCharacter)

  final def recordDelimiterAsScala: Option[String] = Option(self.recordDelimiter)

  final def fieldDelimiterAsScala: Option[String] = Option(self.fieldDelimiter)

  final def quoteCharacterAsScala: Option[String] = Option(self.quoteCharacter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCSVOutputOps {

  implicit def toCSVOutputBuilderOps(v: CSVOutput.Builder): CSVOutputBuilderOps = new CSVOutputBuilderOps(v)

  implicit def toCSVOutputOps(v: CSVOutput): CSVOutputOps = new CSVOutputOps(v)

}
