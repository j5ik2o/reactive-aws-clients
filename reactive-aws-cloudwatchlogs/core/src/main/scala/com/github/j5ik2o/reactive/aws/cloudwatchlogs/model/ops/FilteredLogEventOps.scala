// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class FilteredLogEventBuilderOps(val self: FilteredLogEvent.Builder) extends AnyVal {

  final def logStreamNameAsScala(value: Option[String]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  }

  final def timestampAsScala(value: Option[Long]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def messageAsScala(value: Option[String]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

  final def ingestionTimeAsScala(value: Option[Long]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.ingestionTime(v)
    }
  }

  final def eventIdAsScala(value: Option[String]): FilteredLogEvent.Builder = {
    value.fold(self) { v =>
      self.eventId(v)
    }
  }

}

final class FilteredLogEventOps(val self: FilteredLogEvent) extends AnyVal {

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  final def messageAsScala: Option[String] = Option(self.message)

  final def ingestionTimeAsScala: Option[Long] = Option(self.ingestionTime)

  final def eventIdAsScala: Option[String] = Option(self.eventId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilteredLogEventOps {

  implicit def toFilteredLogEventBuilderOps(v: FilteredLogEvent.Builder): FilteredLogEventBuilderOps =
    new FilteredLogEventBuilderOps(v)

  implicit def toFilteredLogEventOps(v: FilteredLogEvent): FilteredLogEventOps = new FilteredLogEventOps(v)

}
