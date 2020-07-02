// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDatumBuilderOps(val self: MetricDatum.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): MetricDatum.Builder = {
    value.fold(self) { v => self.metricName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala(value: Option[Seq[Dimension]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dimensions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): MetricDatum.Builder = {
    value.fold(self) { v => self.timestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Double]): MetricDatum.Builder = {
    value.fold(self) { v => self.value(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statisticValuesAsScala(value: Option[StatisticSet]): MetricDatum.Builder = {
    value.fold(self) { v => self.statisticValues(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala(value: Option[Seq[Double]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.values(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countsAsScala(value: Option[Seq[Double]]): MetricDatum.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.counts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala(value: Option[StandardUnit]): MetricDatum.Builder = {
    value.fold(self) { v => self.unit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageResolutionAsScala(value: Option[Int]): MetricDatum.Builder = {
    value.fold(self) { v => self.storageResolution(v) }
  }

}

final class MetricDatumOps(val self: MetricDatum) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala: Option[Seq[Dimension]] =
    Option(self.dimensions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Double] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statisticValuesAsScala: Option[StatisticSet] = Option(self.statisticValues)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala: Option[Seq[Double]] =
    Option(self.values).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.doubleValue())
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countsAsScala: Option[Seq[Double]] =
    Option(self.counts).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.doubleValue())
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala: Option[StandardUnit] = Option(self.unit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageResolutionAsScala: Option[Int] = Option(self.storageResolution)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDatumOps {

  implicit def toMetricDatumBuilderOps(v: MetricDatum.Builder): MetricDatumBuilderOps = new MetricDatumBuilderOps(v)

  implicit def toMetricDatumOps(v: MetricDatum): MetricDatumOps = new MetricDatumOps(v)

}
