// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CSVOutputBuilderOps(val self: CSVOutput.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def quoteFieldsAsScala(value: Option[QuoteFields]): CSVOutput.Builder = {
    value.fold(self) { v => self.quoteFields(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def quoteEscapeCharacterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v => self.quoteEscapeCharacter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordDelimiterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v => self.recordDelimiter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldDelimiterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v => self.fieldDelimiter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def quoteCharacterAsScala(value: Option[String]): CSVOutput.Builder = {
    value.fold(self) { v => self.quoteCharacter(v) }
  }

}

final class CSVOutputOps(val self: CSVOutput) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def quoteFieldsAsScala: Option[QuoteFields] = Option(self.quoteFields)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def quoteEscapeCharacterAsScala: Option[String] = Option(self.quoteEscapeCharacter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordDelimiterAsScala: Option[String] = Option(self.recordDelimiter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldDelimiterAsScala: Option[String] = Option(self.fieldDelimiter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def quoteCharacterAsScala: Option[String] = Option(self.quoteCharacter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCSVOutputOps {

  implicit def toCSVOutputBuilderOps(v: CSVOutput.Builder): CSVOutputBuilderOps = new CSVOutputBuilderOps(v)

  implicit def toCSVOutputOps(v: CSVOutput): CSVOutputOps = new CSVOutputOps(v)

}
