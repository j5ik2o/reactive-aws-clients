// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class LogStreamBuilderOps(val self: LogStream.Builder) extends AnyVal {

  final def logStreamNameAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  }

  final def creationTimeAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def firstEventTimestampAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.firstEventTimestamp(v)
    }
  }

  final def lastEventTimestampAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.lastEventTimestamp(v)
    }
  }

  final def lastIngestionTimeAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.lastIngestionTime(v)
    }
  }

  final def uploadSequenceTokenAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.uploadSequenceToken(v)
    }
  }

  final def arnAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def storedBytesAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.storedBytes(v)
    }
  }

}

final class LogStreamOps(val self: LogStream) extends AnyVal {

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime)

  final def firstEventTimestampAsScala: Option[Long] = Option(self.firstEventTimestamp)

  final def lastEventTimestampAsScala: Option[Long] = Option(self.lastEventTimestamp)

  final def lastIngestionTimeAsScala: Option[Long] = Option(self.lastIngestionTime)

  final def uploadSequenceTokenAsScala: Option[String] = Option(self.uploadSequenceToken)

  final def arnAsScala: Option[String] = Option(self.arn)

  final def storedBytesAsScala: Option[Long] = Option(self.storedBytes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogStreamOps {

  implicit def toLogStreamBuilderOps(v: LogStream.Builder): LogStreamBuilderOps = new LogStreamBuilderOps(v)

  implicit def toLogStreamOps(v: LogStream): LogStreamOps = new LogStreamOps(v)

}
