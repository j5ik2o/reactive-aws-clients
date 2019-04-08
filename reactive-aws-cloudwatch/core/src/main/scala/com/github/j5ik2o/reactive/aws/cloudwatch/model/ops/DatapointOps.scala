// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DatapointBuilderOps(val self: Datapoint.Builder) extends AnyVal {

  final def timestampAsScala(value: Option[java.time.Instant]): Datapoint.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // java.time.Instant

  final def sampleCountAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v =>
      self.sampleCount(v)
    }
  } // Double

  final def averageAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v =>
      self.average(v)
    }
  } // Double

  final def sumAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v =>
      self.sum(v)
    }
  } // Double

  final def minimumAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v =>
      self.minimum(v)
    }
  } // Double

  final def maximumAsScala(value: Option[Double]): Datapoint.Builder = {
    value.fold(self) { v =>
      self.maximum(v)
    }
  } // Double

  final def unitAsScala(value: Option[StandardUnit]): Datapoint.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  } // StandardUnit

  final def extendedStatisticsAsScala(value: Option[Map[String, Double]]): Datapoint.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.extendedStatistics(v.asJava)
    } // Map[String, Double]
  }

}

final class DatapointOps(val self: Datapoint) extends AnyVal {

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // java.time.Instant

  final def sampleCountAsScala: Option[Double] = Option(self.sampleCount) // Double

  final def averageAsScala: Option[Double] = Option(self.average) // Double

  final def sumAsScala: Option[Double] = Option(self.sum) // Double

  final def minimumAsScala: Option[Double] = Option(self.minimum) // Double

  final def maximumAsScala: Option[Double] = Option(self.maximum) // Double

  final def unitAsScala: Option[StandardUnit] = Option(self.unit) // StandardUnit

  final def extendedStatisticsAsScala: Option[Map[String, Double]] = Option(self.extendedStatistics).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.doubleValue())
  } // Map[String, Double]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDatapointOps {

  implicit def toDatapointBuilderOps(v: Datapoint.Builder): DatapointBuilderOps = new DatapointBuilderOps(v)

  implicit def toDatapointOps(v: Datapoint): DatapointOps = new DatapointOps(v)

}
