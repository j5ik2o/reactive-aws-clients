// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DatapointBuilderOps(val self: Datapoint.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): Datapoint.Builder = {
    value.fold(self) { v => self.timestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sampleCountAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v => self.sampleCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def averageAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v => self.average(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sumAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v => self.sum(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minimumAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v => self.minimum(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v => self.maximum(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala(value: Option[StandardUnit]): Datapoint.Builder = {
    value.fold(self) { v => self.unit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extendedStatisticsAsScala(value: Option[Map[String, Double]]): Datapoint.Builder = {
    value.filter(_.nonEmpty).map(_.view.map { case (k, v) => (k, v.asInstanceOf[java.lang.Double]) }.toMap).fold(self) {
      v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.extendedStatistics(v.asJava)
    }
  }

}

final class DatapointOps(val self: Datapoint) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sampleCountAsScala: Option[Double] = Option(self.sampleCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def averageAsScala: Option[Double] = Option(self.average)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sumAsScala: Option[Double] = Option(self.sum)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minimumAsScala: Option[Double] = Option(self.minimum)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumAsScala: Option[Double] = Option(self.maximum)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala: Option[StandardUnit] = Option(self.unit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extendedStatisticsAsScala: Option[Map[String, Double]] =
    Option(self.extendedStatistics).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      v.asScala.toMap.view.map { case (k, v) => (k, v.doubleValue()) }.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDatapointOps {

  implicit def toDatapointBuilderOps(v: Datapoint.Builder): DatapointBuilderOps = new DatapointBuilderOps(v)

  implicit def toDatapointOps(v: Datapoint): DatapointOps = new DatapointOps(v)

}
