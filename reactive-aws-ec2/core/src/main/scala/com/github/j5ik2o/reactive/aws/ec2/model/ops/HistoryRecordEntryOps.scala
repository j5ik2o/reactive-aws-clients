// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HistoryRecordEntryBuilderOps(val self: HistoryRecordEntry.Builder) extends AnyVal {

  final def eventInformationAsScala(value: Option[EventInformation]): HistoryRecordEntry.Builder = {
    value.fold(self) { v =>
      self.eventInformation(v)
    }
  }

  final def eventTypeAsScala(value: Option[FleetEventType]): HistoryRecordEntry.Builder = {
    value.fold(self) { v =>
      self.eventType(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): HistoryRecordEntry.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class HistoryRecordEntryOps(val self: HistoryRecordEntry) extends AnyVal {

  final def eventInformationAsScala: Option[EventInformation] = Option(self.eventInformation)

  final def eventTypeAsScala: Option[FleetEventType] = Option(self.eventType)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHistoryRecordEntryOps {

  implicit def toHistoryRecordEntryBuilderOps(v: HistoryRecordEntry.Builder): HistoryRecordEntryBuilderOps =
    new HistoryRecordEntryBuilderOps(v)

  implicit def toHistoryRecordEntryOps(v: HistoryRecordEntry): HistoryRecordEntryOps = new HistoryRecordEntryOps(v)

}
