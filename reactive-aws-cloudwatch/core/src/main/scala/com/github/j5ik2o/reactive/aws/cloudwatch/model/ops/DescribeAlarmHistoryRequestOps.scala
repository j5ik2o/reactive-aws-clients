// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmHistoryRequestBuilderOps(val self: DescribeAlarmHistoryRequest.Builder) extends AnyVal {

  final def alarmNameAsScala(value: Option[String]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  }

  final def historyItemTypeAsScala(value: Option[HistoryItemType]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.historyItemType(v)
    }
  }

  final def startDateAsScala(value: Option[java.time.Instant]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.startDate(v)
    }
  }

  final def endDateAsScala(value: Option[java.time.Instant]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.endDate(v)
    }
  }

  final def maxRecordsAsScala(value: Option[Int]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeAlarmHistoryRequestOps(val self: DescribeAlarmHistoryRequest) extends AnyVal {

  final def alarmNameAsScala: Option[String] = Option(self.alarmName)

  final def historyItemTypeAsScala: Option[HistoryItemType] = Option(self.historyItemType)

  final def startDateAsScala: Option[java.time.Instant] = Option(self.startDate)

  final def endDateAsScala: Option[java.time.Instant] = Option(self.endDate)

  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmHistoryRequestOps {

  implicit def toDescribeAlarmHistoryRequestBuilderOps(
      v: DescribeAlarmHistoryRequest.Builder
  ): DescribeAlarmHistoryRequestBuilderOps = new DescribeAlarmHistoryRequestBuilderOps(v)

  implicit def toDescribeAlarmHistoryRequestOps(v: DescribeAlarmHistoryRequest): DescribeAlarmHistoryRequestOps =
    new DescribeAlarmHistoryRequestOps(v)

}
