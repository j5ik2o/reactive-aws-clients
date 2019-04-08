// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetMetricDataRequestBuilderOps(val self: GetMetricDataRequest.Builder) extends AnyVal {

  final def metricDataQueriesAsScala(value: Option[Seq[MetricDataQuery]]): GetMetricDataRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metricDataQueries(v.asJava)
    } // Seq[MetricDataQuery]
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): GetMetricDataRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  } // Instant

  final def endTimeAsScala(value: Option[java.time.Instant]): GetMetricDataRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  } // Instant

  final def nextTokenAsScala(value: Option[String]): GetMetricDataRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def scanByAsScala(value: Option[ScanBy]): GetMetricDataRequest.Builder = {
    value.fold(self) { v =>
      self.scanBy(v)
    }
  } // String

  final def maxDatapointsAsScala(value: Option[Int]): GetMetricDataRequest.Builder = {
    value.fold(self) { v =>
      self.maxDatapoints(v)
    }
  } // Int

}

final class GetMetricDataRequestOps(val self: GetMetricDataRequest) extends AnyVal {

  final def metricDataQueriesAsScala: Option[Seq[MetricDataQuery]] = Option(self.metricDataQueries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetricDataQuery]

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime) // Instant

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime) // Instant

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def scanByAsScala: Option[ScanBy] = Option(self.scanBy) // String

  final def maxDatapointsAsScala: Option[Int] = Option(self.maxDatapoints) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetMetricDataRequestOps {

  implicit def toGetMetricDataRequestBuilderOps(v: GetMetricDataRequest.Builder): GetMetricDataRequestBuilderOps =
    new GetMetricDataRequestBuilderOps(v)

  implicit def toGetMetricDataRequestOps(v: GetMetricDataRequest): GetMetricDataRequestOps =
    new GetMetricDataRequestOps(v)

}
