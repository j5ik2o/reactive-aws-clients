// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class AlarmHistoryItemBuilderOps(val self: AlarmHistoryItem.Builder) extends AnyVal {

  final def alarmNameAsScala(value: Option[String]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  } // String

  final def timestampAsScala(value: Option[java.time.Instant]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // Instant

  final def historyItemTypeAsScala(value: Option[HistoryItemType]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.historyItemType(v)
    }
  } // String

  final def historySummaryAsScala(value: Option[String]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.historySummary(v)
    }
  } // String

  final def historyDataAsScala(value: Option[String]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.historyData(v)
    }
  } // String

}

final class AlarmHistoryItemOps(val self: AlarmHistoryItem) extends AnyVal {

  final def alarmNameAsScala: Option[String] = Option(self.alarmName) // String

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // Instant

  final def historyItemTypeAsScala: Option[HistoryItemType] = Option(self.historyItemType) // String

  final def historySummaryAsScala: Option[String] = Option(self.historySummary) // String

  final def historyDataAsScala: Option[String] = Option(self.historyData) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAlarmHistoryItemOps {

  implicit def toAlarmHistoryItemBuilderOps(v: AlarmHistoryItem.Builder): AlarmHistoryItemBuilderOps =
    new AlarmHistoryItemBuilderOps(v)

  implicit def toAlarmHistoryItemOps(v: AlarmHistoryItem): AlarmHistoryItemOps = new AlarmHistoryItemOps(v)

}
