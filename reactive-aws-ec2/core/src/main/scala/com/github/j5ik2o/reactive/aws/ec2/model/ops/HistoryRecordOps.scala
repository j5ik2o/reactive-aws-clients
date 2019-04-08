// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HistoryRecordBuilderOps(val self: HistoryRecord.Builder) extends AnyVal {

  final def eventInformationAsScala(value: Option[EventInformation]): HistoryRecord.Builder = {
    value.fold(self) { v =>
      self.eventInformation(v)
    }
  }

  final def eventTypeAsScala(value: Option[EventType]): HistoryRecord.Builder = {
    value.fold(self) { v =>
      self.eventType(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): HistoryRecord.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class HistoryRecordOps(val self: HistoryRecord) extends AnyVal {

  final def eventInformationAsScala: Option[EventInformation] = Option(self.eventInformation)

  final def eventTypeAsScala: Option[EventType] = Option(self.eventType)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHistoryRecordOps {

  implicit def toHistoryRecordBuilderOps(v: HistoryRecord.Builder): HistoryRecordBuilderOps =
    new HistoryRecordBuilderOps(v)

  implicit def toHistoryRecordOps(v: HistoryRecord): HistoryRecordOps = new HistoryRecordOps(v)

}
