// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmHistoryRequestBuilderOps(val self: DescribeAlarmHistoryRequest.Builder) extends AnyVal {

  final def alarmNameAsScala(value: Option[String]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  } // String

  final def historyItemTypeAsScala(value: Option[HistoryItemType]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.historyItemType(v)
    }
  } // String

  final def startDateAsScala(value: Option[java.time.Instant]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.startDate(v)
    }
  } // Instant

  final def endDateAsScala(value: Option[java.time.Instant]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.endDate(v)
    }
  } // Instant

  final def maxRecordsAsScala(value: Option[Int]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeAlarmHistoryRequestOps(val self: DescribeAlarmHistoryRequest) extends AnyVal {

  final def alarmNameAsScala: Option[String] = Option(self.alarmName) // String

  final def historyItemTypeAsScala: Option[HistoryItemType] = Option(self.historyItemType) // String

  final def startDateAsScala: Option[java.time.Instant] = Option(self.startDate) // Instant

  final def endDateAsScala: Option[java.time.Instant] = Option(self.endDate) // Instant

  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmHistoryRequestOps {

  implicit def toDescribeAlarmHistoryRequestBuilderOps(
      v: DescribeAlarmHistoryRequest.Builder
  ): DescribeAlarmHistoryRequestBuilderOps = new DescribeAlarmHistoryRequestBuilderOps(v)

  implicit def toDescribeAlarmHistoryRequestOps(v: DescribeAlarmHistoryRequest): DescribeAlarmHistoryRequestOps =
    new DescribeAlarmHistoryRequestOps(v)

}
