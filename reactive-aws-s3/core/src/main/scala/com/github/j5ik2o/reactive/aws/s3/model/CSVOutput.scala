package com.github.j5ik2o.reactive.aws.s3.model

final case class CSVOutput(
    quoteFields: Option[QuoteFields] = None,
    quoteEscapeCharacter: Option[String] = None,
    recordDelimiter: Option[String] = None,
    fieldDelimiter: Option[String] = None,
    quoteCharacter: Option[String] = None
) {
  def withQuoteFields(value: Option[QuoteFields]): CSVOutput =
    copy(quoteFields = value)
  def withQuoteEscapeCharacter(value: Option[String]): CSVOutput =
    copy(quoteEscapeCharacter = value)
  def withRecordDelimiter(value: Option[String]): CSVOutput =
    copy(recordDelimiter = value)
  def withFieldDelimiter(value: Option[String]): CSVOutput =
    copy(fieldDelimiter = value)
  def withQuoteCharacter(value: Option[String]): CSVOutput =
    copy(quoteCharacter = value)
}
