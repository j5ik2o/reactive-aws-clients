// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetMetricStatisticsRequestBuilderOps(val self: GetMetricStatisticsRequest.Builder) extends AnyVal {

  final def namespaceAsScala(value: Option[String]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def metricNameAsScala(value: Option[String]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  } // String

  final def dimensionsAsScala(value: Option[Seq[Dimension]]): GetMetricStatisticsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    } // Seq[Dimension]
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  } // java.time.Instant

  final def endTimeAsScala(value: Option[java.time.Instant]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  } // java.time.Instant

  final def periodAsScala(value: Option[Int]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.period(v)
    }
  } // Int

  final def statisticsAsScala(value: Option[Seq[Statistic]]): GetMetricStatisticsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.statistics(v.asJava)
    } // Seq[Statistic]
  }

  final def extendedStatisticsAsScala(value: Option[Seq[String]]): GetMetricStatisticsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.extendedStatistics(v.asJava)
    } // Seq[String]
  }

  final def unitAsScala(value: Option[StandardUnit]): GetMetricStatisticsRequest.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  } // StandardUnit

}

final class GetMetricStatisticsRequestOps(val self: GetMetricStatisticsRequest) extends AnyVal {

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def metricNameAsScala: Option[String] = Option(self.metricName) // String

  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Dimension]

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime) // java.time.Instant

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime) // java.time.Instant

  final def periodAsScala: Option[Int] = Option(self.period) // Int

  final def statisticsAsScala: Option[Seq[Statistic]] = Option(self.statistics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Statistic]

  final def extendedStatisticsAsScala: Option[Seq[String]] = Option(self.extendedStatistics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def unitAsScala: Option[StandardUnit] = Option(self.unit) // StandardUnit

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetMetricStatisticsRequestOps {

  implicit def toGetMetricStatisticsRequestBuilderOps(
      v: GetMetricStatisticsRequest.Builder
  ): GetMetricStatisticsRequestBuilderOps = new GetMetricStatisticsRequestBuilderOps(v)

  implicit def toGetMetricStatisticsRequestOps(v: GetMetricStatisticsRequest): GetMetricStatisticsRequestOps =
    new GetMetricStatisticsRequestOps(v)

}
