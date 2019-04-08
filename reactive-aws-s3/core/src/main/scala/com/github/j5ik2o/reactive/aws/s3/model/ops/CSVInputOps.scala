// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CSVInputBuilderOps(val self: CSVInput.Builder) extends AnyVal {

  final def fileHeaderInfoAsScala(value: Option[FileHeaderInfo]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.fileHeaderInfo(v)
    }
  } // FileHeaderInfo

  final def commentsAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.comments(v)
    }
  } // String

  final def quoteEscapeCharacterAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.quoteEscapeCharacter(v)
    }
  } // String

  final def recordDelimiterAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.recordDelimiter(v)
    }
  } // String

  final def fieldDelimiterAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.fieldDelimiter(v)
    }
  } // String

  final def quoteCharacterAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.quoteCharacter(v)
    }
  } // String

  final def allowQuotedRecordDelimiterAsScala(value: Option[Boolean]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.allowQuotedRecordDelimiter(v)
    }
  } // Boolean

}

final class CSVInputOps(val self: CSVInput) extends AnyVal {

  final def fileHeaderInfoAsScala: Option[FileHeaderInfo] = Option(self.fileHeaderInfo) // FileHeaderInfo

  final def commentsAsScala: Option[String] = Option(self.comments) // String

  final def quoteEscapeCharacterAsScala: Option[String] = Option(self.quoteEscapeCharacter) // String

  final def recordDelimiterAsScala: Option[String] = Option(self.recordDelimiter) // String

  final def fieldDelimiterAsScala: Option[String] = Option(self.fieldDelimiter) // String

  final def quoteCharacterAsScala: Option[String] = Option(self.quoteCharacter) // String

  final def allowQuotedRecordDelimiterAsScala: Option[Boolean] = Option(self.allowQuotedRecordDelimiter) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCSVInputOps {

  implicit def toCSVInputBuilderOps(v: CSVInput.Builder): CSVInputBuilderOps = new CSVInputBuilderOps(v)

  implicit def toCSVInputOps(v: CSVInput): CSVInputOps = new CSVInputOps(v)

}
