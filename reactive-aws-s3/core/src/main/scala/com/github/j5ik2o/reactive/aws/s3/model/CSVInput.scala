package com.github.j5ik2o.reactive.aws.s3.model

final case class CSVInput(
    fileHeaderInfo: Option[FileHeaderInfo] = None,
    comments: Option[String] = None,
    quoteEscapeCharacter: Option[String] = None,
    recordDelimiter: Option[String] = None,
    fieldDelimiter: Option[String] = None,
    quoteCharacter: Option[String] = None,
    allowQuotedRecordDelimiter: Option[Boolean] = None
) {
  def withFileHeaderInfo(value: Option[FileHeaderInfo]): CSVInput =
    copy(fileHeaderInfo = value)
  def withComments(value: Option[String]): CSVInput =
    copy(comments = value)
  def withQuoteEscapeCharacter(value: Option[String]): CSVInput =
    copy(quoteEscapeCharacter = value)
  def withRecordDelimiter(value: Option[String]): CSVInput =
    copy(recordDelimiter = value)
  def withFieldDelimiter(value: Option[String]): CSVInput =
    copy(fieldDelimiter = value)
  def withQuoteCharacter(value: Option[String]): CSVInput =
    copy(quoteCharacter = value)
  def withAllowQuotedRecordDelimiter(value: Option[Boolean]): CSVInput =
    copy(allowQuotedRecordDelimiter = value)
}
