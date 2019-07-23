// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmHistoryResponseBuilderOps(val self: DescribeAlarmHistoryResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmHistoryItemsAsScala(value: Option[Seq[AlarmHistoryItem]]): DescribeAlarmHistoryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.alarmHistoryItems(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeAlarmHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeAlarmHistoryResponseOps(val self: DescribeAlarmHistoryResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmHistoryItemsAsScala: Option[Seq[AlarmHistoryItem]] = Option(self.alarmHistoryItems).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmHistoryResponseOps {

  implicit def toDescribeAlarmHistoryResponseBuilderOps(
      v: DescribeAlarmHistoryResponse.Builder
  ): DescribeAlarmHistoryResponseBuilderOps = new DescribeAlarmHistoryResponseBuilderOps(v)

  implicit def toDescribeAlarmHistoryResponseOps(v: DescribeAlarmHistoryResponse): DescribeAlarmHistoryResponseOps =
    new DescribeAlarmHistoryResponseOps(v)

}
