// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class FilteredLogEventBuilderOps(val self: FilteredLogEvent.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala(value: Option[String]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[Long]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ingestionTimeAsScala(value: Option[Long]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.ingestionTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventIdAsScala(value: Option[String]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.eventId(v)
    }
  }

}

final class FilteredLogEventOps(val self: FilteredLogEvent) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ingestionTimeAsScala: Option[Long] = Option(self.ingestionTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventIdAsScala: Option[String] = Option(self.eventId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilteredLogEventOps {

  implicit def toFilteredLogEventBuilderOps(v: FilteredLogEvent.Builder): FilteredLogEventBuilderOps =
    new FilteredLogEventBuilderOps(v)

  implicit def toFilteredLogEventOps(v: FilteredLogEvent): FilteredLogEventOps = new FilteredLogEventOps(v)

}
