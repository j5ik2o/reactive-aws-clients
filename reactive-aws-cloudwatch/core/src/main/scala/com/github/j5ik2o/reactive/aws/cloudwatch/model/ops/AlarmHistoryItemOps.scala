// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class AlarmHistoryItemBuilderOps(val self: AlarmHistoryItem.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala(value: Option[String]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def historyItemTypeAsScala(value: Option[HistoryItemType]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.historyItemType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def historySummaryAsScala(value: Option[String]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.historySummary(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def historyDataAsScala(value: Option[String]): AlarmHistoryItem.Builder = {
    value.fold(self) { v =>
      self.historyData(v)
    }
  }

}

final class AlarmHistoryItemOps(val self: AlarmHistoryItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala: Option[String] = Option(self.alarmName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def historyItemTypeAsScala: Option[HistoryItemType] = Option(self.historyItemType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def historySummaryAsScala: Option[String] = Option(self.historySummary)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def historyDataAsScala: Option[String] = Option(self.historyData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAlarmHistoryItemOps {

  implicit def toAlarmHistoryItemBuilderOps(v: AlarmHistoryItem.Builder): AlarmHistoryItemBuilderOps =
    new AlarmHistoryItemBuilderOps(v)

  implicit def toAlarmHistoryItemOps(v: AlarmHistoryItem): AlarmHistoryItemOps = new AlarmHistoryItemOps(v)

}
