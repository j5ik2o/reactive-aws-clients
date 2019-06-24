// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class LogStreamBuilderOps(val self: LogStream.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def firstEventTimestampAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.firstEventTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEventTimestampAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.lastEventTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastIngestionTimeAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.lastIngestionTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadSequenceTokenAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.uploadSequenceToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): LogStream.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storedBytesAsScala(value: Option[Long]): LogStream.Builder = {
    value.fold(self) { v =>
      self.storedBytes(v)
    }
  }

}

final class LogStreamOps(val self: LogStream) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[Long] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def firstEventTimestampAsScala: Option[Long] = Option(self.firstEventTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEventTimestampAsScala: Option[Long] = Option(self.lastEventTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastIngestionTimeAsScala: Option[Long] = Option(self.lastIngestionTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadSequenceTokenAsScala: Option[String] = Option(self.uploadSequenceToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storedBytesAsScala: Option[Long] = Option(self.storedBytes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogStreamOps {

  implicit def toLogStreamBuilderOps(v: LogStream.Builder): LogStreamBuilderOps = new LogStreamBuilderOps(v)

  implicit def toLogStreamOps(v: LogStream): LogStreamOps = new LogStreamOps(v)

}
