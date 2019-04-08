// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDatumBuilderOps(val self: MetricDatum.Builder) extends AnyVal {

  final def metricNameAsScala(value: Option[String]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  final def dimensionsAsScala(value: Option[Seq[Dimension]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def valueAsScala(value: Option[Double]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  final def statisticValuesAsScala(value: Option[StatisticSet]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.statisticValues(v)
    }
  }

  final def valuesAsScala(value: Option[Seq[Double]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.values(v.asJava)
    }
  }

  final def countsAsScala(value: Option[Seq[Double]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.counts(v.asJava)
    }
  }

  final def unitAsScala(value: Option[StandardUnit]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  }

  final def storageResolutionAsScala(value: Option[Int]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.storageResolution(v)
    }
  }

}

final class MetricDatumOps(val self: MetricDatum) extends AnyVal {

  final def metricNameAsScala: Option[String] = Option(self.metricName)

  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  final def valueAsScala: Option[Double] = Option(self.value)

  final def statisticValuesAsScala: Option[StatisticSet] = Option(self.statisticValues)

  final def valuesAsScala: Option[Seq[Double]] = Option(self.values).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
  }

  final def countsAsScala: Option[Seq[Double]] = Option(self.counts).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
  }

  final def unitAsScala: Option[StandardUnit] = Option(self.unit)

  final def storageResolutionAsScala: Option[Int] = Option(self.storageResolution)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDatumOps {

  implicit def toMetricDatumBuilderOps(v: MetricDatum.Builder): MetricDatumBuilderOps = new MetricDatumBuilderOps(v)

  implicit def toMetricDatumOps(v: MetricDatum): MetricDatumOps = new MetricDatumOps(v)

}
