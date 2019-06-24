// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmHistoryRequestBuilderOps(val self: DescribeAlarmHistoryRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala(value: Option[String]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def historyItemTypeAsScala(value: Option[HistoryItemType]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.historyItemType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startDateAsScala(value: Option[java.time.Instant]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.startDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateAsScala(value: Option[java.time.Instant]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.endDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala(value: Option[Int]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeAlarmHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeAlarmHistoryRequestOps(val self: DescribeAlarmHistoryRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala: Option[String] = Option(self.alarmName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def historyItemTypeAsScala: Option[HistoryItemType] = Option(self.historyItemType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startDateAsScala: Option[java.time.Instant] = Option(self.startDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateAsScala: Option[java.time.Instant] = Option(self.endDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
