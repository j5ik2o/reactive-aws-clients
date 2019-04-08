// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CSVInputBuilderOps(val self: CSVInput.Builder) extends AnyVal {

  final def fileHeaderInfoAsScala(value: Option[FileHeaderInfo]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.fileHeaderInfo(v)
    }
  }

  final def commentsAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.comments(v)
    }
  }

  final def quoteEscapeCharacterAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.quoteEscapeCharacter(v)
    }
  }

  final def recordDelimiterAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.recordDelimiter(v)
    }
  }

  final def fieldDelimiterAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.fieldDelimiter(v)
    }
  }

  final def quoteCharacterAsScala(value: Option[String]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.quoteCharacter(v)
    }
  }

  final def allowQuotedRecordDelimiterAsScala(value: Option[Boolean]): CSVInput.Builder = {
    value.fold(self) { v =>
      self.allowQuotedRecordDelimiter(v)
    }
  }

}

final class CSVInputOps(val self: CSVInput) extends AnyVal {

  final def fileHeaderInfoAsScala: Option[FileHeaderInfo] = Option(self.fileHeaderInfo)

  final def commentsAsScala: Option[String] = Option(self.comments)

  final def quoteEscapeCharacterAsScala: Option[String] = Option(self.quoteEscapeCharacter)

  final def recordDelimiterAsScala: Option[String] = Option(self.recordDelimiter)

  final def fieldDelimiterAsScala: Option[String] = Option(self.fieldDelimiter)

  final def quoteCharacterAsScala: Option[String] = Option(self.quoteCharacter)

  final def allowQuotedRecordDelimiterAsScala: Option[Boolean] = Option(self.allowQuotedRecordDelimiter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCSVInputOps {

  implicit def toCSVInputBuilderOps(v: CSVInput.Builder): CSVInputBuilderOps = new CSVInputBuilderOps(v)

  implicit def toCSVInputOps(v: CSVInput): CSVInputOps = new CSVInputOps(v)

}
