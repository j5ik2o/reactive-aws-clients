// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class QueryStatisticsBuilderOps(val self: QueryStatistics.Builder) extends AnyVal {

  final def recordsMatchedAsScala(value: Option[Double]): QueryStatistics.Builder = {
    value.fold(self) { v =>
      self.recordsMatched(v)
    }
  } // Double

  final def recordsScannedAsScala(value: Option[Double]): QueryStatistics.Builder = {
    value.fold(self) { v =>
      self.recordsScanned(v)
    }
  } // Double

  final def bytesScannedAsScala(value: Option[Double]): QueryStatistics.Builder = {
    value.fold(self) { v =>
      self.bytesScanned(v)
    }
  } // Double

}

final class QueryStatisticsOps(val self: QueryStatistics) extends AnyVal {

  final def recordsMatchedAsScala: Option[Double] = Option(self.recordsMatched) // Double

  final def recordsScannedAsScala: Option[Double] = Option(self.recordsScanned) // Double

  final def bytesScannedAsScala: Option[Double] = Option(self.bytesScanned) // Double

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryStatisticsOps {

  implicit def toQueryStatisticsBuilderOps(v: QueryStatistics.Builder): QueryStatisticsBuilderOps =
    new QueryStatisticsBuilderOps(v)

  implicit def toQueryStatisticsOps(v: QueryStatistics): QueryStatisticsOps = new QueryStatisticsOps(v)

}
