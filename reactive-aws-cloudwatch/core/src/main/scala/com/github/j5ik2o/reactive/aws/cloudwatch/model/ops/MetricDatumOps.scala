// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDatumBuilderOps(val self: MetricDatum.Builder) extends AnyVal {

  final def metricNameAsScala(value: Option[String]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  } // String

  final def dimensionsAsScala(value: Option[Seq[Dimension]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    } // Seq[Dimension]
  }

  final def timestampAsScala(value: Option[java.time.Instant]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // java.time.Instant

  final def valueAsScala(value: Option[Double]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // Double

  final def statisticValuesAsScala(value: Option[StatisticSet]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.statisticValues(v)
    }
  } // StatisticSet

  final def valuesAsScala(value: Option[Seq[Double]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.values(v.asJava)
    } // Seq[Double]
  }

  final def countsAsScala(value: Option[Seq[Double]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.counts(v.asJava)
    } // Seq[Double]
  }

  final def unitAsScala(value: Option[StandardUnit]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  } // StandardUnit

  final def storageResolutionAsScala(value: Option[Int]): MetricDatum.Builder = {
    value.fold(self) { v =>
      self.storageResolution(v)
    }
  } // Int

}

final class MetricDatumOps(val self: MetricDatum) extends AnyVal {

  final def metricNameAsScala: Option[String] = Option(self.metricName) // String

  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Dimension]

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // java.time.Instant

  final def valueAsScala: Option[Double] = Option(self.value) // Double

  final def statisticValuesAsScala: Option[StatisticSet] = Option(self.statisticValues) // StatisticSet

  final def valuesAsScala: Option[Seq[Double]] = Option(self.values).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
  } // Seq[Double]

  final def countsAsScala: Option[Seq[Double]] = Option(self.counts).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
  } // Seq[Double]

  final def unitAsScala: Option[StandardUnit] = Option(self.unit) // StandardUnit

  final def storageResolutionAsScala: Option[Int] = Option(self.storageResolution) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDatumOps {

  implicit def toMetricDatumBuilderOps(v: MetricDatum.Builder): MetricDatumBuilderOps = new MetricDatumBuilderOps(v)

  implicit def toMetricDatumOps(v: MetricDatum): MetricDatumOps = new MetricDatumOps(v)

}
