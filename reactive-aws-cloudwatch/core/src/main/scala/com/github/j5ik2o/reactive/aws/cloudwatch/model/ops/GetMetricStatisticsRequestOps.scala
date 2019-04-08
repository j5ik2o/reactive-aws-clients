// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetMetricStatisticsRequestBuilderOps(val self: GetMetricStatisticsRequest.Builder) extends AnyVal {

  final def namespaceAsScala(value: Option[String]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  final def metricNameAsScala(value: Option[String]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  final def dimensionsAsScala(value: Option[Seq[Dimension]]): GetMetricStatisticsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  final def endTimeAsScala(value: Option[java.time.Instant]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  final def periodAsScala(value: Option[Int]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.period(v)
    }
  }

  final def statisticsAsScala(value: Option[Seq[Statistic]]): GetMetricStatisticsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.statistics(v.asJava)
    }
  }

  final def extendedStatisticsAsScala(value: Option[Seq[String]]): GetMetricStatisticsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.extendedStatistics(v.asJava)
    }
  }

  final def unitAsScala(value: Option[StandardUnit]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  }

}

final class GetMetricStatisticsRequestOps(val self: GetMetricStatisticsRequest) extends AnyVal {

  final def namespaceAsScala: Option[String] = Option(self.namespace)

  final def metricNameAsScala: Option[String] = Option(self.metricName)

  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

  final def periodAsScala: Option[Int] = Option(self.period)

  final def statisticsAsScala: Option[Seq[Statistic]] = Option(self.statistics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def extendedStatisticsAsScala: Option[Seq[String]] = Option(self.extendedStatistics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def unitAsScala: Option[StandardUnit] = Option(self.unit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetMetricStatisticsRequestOps {

  implicit def toGetMetricStatisticsRequestBuilderOps(
      v: GetMetricStatisticsRequest.Builder
  ): GetMetricStatisticsRequestBuilderOps = new GetMetricStatisticsRequestBuilderOps(v)

  implicit def toGetMetricStatisticsRequestOps(v: GetMetricStatisticsRequest): GetMetricStatisticsRequestOps =
    new GetMetricStatisticsRequestOps(v)

}
