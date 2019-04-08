// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class LogStreamBuilderOps(val self: LogStream.Builder) extends AnyVal {

  final def logStreamNameAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  } // String

  final def creationTimeAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // Long

  final def firstEventTimestampAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.firstEventTimestamp(v)
    }
  } // Long

  final def lastEventTimestampAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.lastEventTimestamp(v)
    }
  } // Long

  final def lastIngestionTimeAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.lastIngestionTime(v)
    }
  } // Long

  final def uploadSequenceTokenAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.uploadSequenceToken(v)
    }
  } // String

  final def arnAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  } // String

  final def storedBytesAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.storedBytes(v)
    }
  } // Long

}

final class LogStreamOps(val self: LogStream) extends AnyVal {

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName) // String

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime) // Long

  final def firstEventTimestampAsScala: Option[Long] = Option(self.firstEventTimestamp) // Long

  final def lastEventTimestampAsScala: Option[Long] = Option(self.lastEventTimestamp) // Long

  final def lastIngestionTimeAsScala: Option[Long] = Option(self.lastIngestionTime) // Long

  final def uploadSequenceTokenAsScala: Option[String] = Option(self.uploadSequenceToken) // String

  final def arnAsScala: Option[String] = Option(self.arn) // String

  final def storedBytesAsScala: Option[Long] = Option(self.storedBytes) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogStreamOps {

  implicit def toLogStreamBuilderOps(v: LogStream.Builder): LogStreamBuilderOps = new LogStreamBuilderOps(v)

  implicit def toLogStreamOps(v: LogStream): LogStreamOps = new LogStreamOps(v)

}
