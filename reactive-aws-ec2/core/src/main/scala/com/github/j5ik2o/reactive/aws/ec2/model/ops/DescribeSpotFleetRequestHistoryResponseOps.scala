// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotFleetRequestHistoryResponseBuilderOps(val self: DescribeSpotFleetRequestHistoryResponse.Builder)
    extends AnyVal {

  final def historyRecordsAsScala(
      value: Option[Seq[HistoryRecord]]
  ): DescribeSpotFleetRequestHistoryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.historyRecords(v.asJava)
    }
  }

  final def lastEvaluatedTimeAsScala(
      value: Option[java.time.Instant]
  ): DescribeSpotFleetRequestHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedTime(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSpotFleetRequestHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def spotFleetRequestIdAsScala(value: Option[String]): DescribeSpotFleetRequestHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): DescribeSpotFleetRequestHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

}

final class DescribeSpotFleetRequestHistoryResponseOps(val self: DescribeSpotFleetRequestHistoryResponse)
    extends AnyVal {

  final def historyRecordsAsScala: Option[Seq[HistoryRecord]] = Option(self.historyRecords).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def lastEvaluatedTimeAsScala: Option[java.time.Instant] = Option(self.lastEvaluatedTime)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotFleetRequestHistoryResponseOps {

  implicit def toDescribeSpotFleetRequestHistoryResponseBuilderOps(
      v: DescribeSpotFleetRequestHistoryResponse.Builder
  ): DescribeSpotFleetRequestHistoryResponseBuilderOps = new DescribeSpotFleetRequestHistoryResponseBuilderOps(v)

  implicit def toDescribeSpotFleetRequestHistoryResponseOps(
      v: DescribeSpotFleetRequestHistoryResponse
  ): DescribeSpotFleetRequestHistoryResponseOps = new DescribeSpotFleetRequestHistoryResponseOps(v)

}
