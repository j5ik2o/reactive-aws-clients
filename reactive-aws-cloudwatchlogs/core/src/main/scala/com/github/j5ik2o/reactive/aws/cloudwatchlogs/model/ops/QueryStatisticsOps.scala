// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class QueryStatisticsBuilderOps(val self: QueryStatistics.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsMatchedAsScala(value: Option[Double]): QueryStatistics.Builder = {
    value.fold(self) { v => self.recordsMatched(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsScannedAsScala(value: Option[Double]): QueryStatistics.Builder = {
    value.fold(self) { v => self.recordsScanned(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bytesScannedAsScala(value: Option[Double]): QueryStatistics.Builder = {
    value.fold(self) { v => self.bytesScanned(v) }
  }

}

final class QueryStatisticsOps(val self: QueryStatistics) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsMatchedAsScala: Option[Double] = Option(self.recordsMatched)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsScannedAsScala: Option[Double] = Option(self.recordsScanned)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bytesScannedAsScala: Option[Double] = Option(self.bytesScanned)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryStatisticsOps {

  implicit def toQueryStatisticsBuilderOps(v: QueryStatistics.Builder): QueryStatisticsBuilderOps =
    new QueryStatisticsBuilderOps(v)

  implicit def toQueryStatisticsOps(v: QueryStatistics): QueryStatisticsOps = new QueryStatisticsOps(v)

}
