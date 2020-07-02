// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class MetricFilterMatchRecordBuilderOps(val self: MetricFilterMatchRecord.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventNumberAsScala(value: Option[Long]): MetricFilterMatchRecord.Builder = {
    value.fold(self) { v => self.eventNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventMessageAsScala(value: Option[String]): MetricFilterMatchRecord.Builder = {
    value.fold(self) { v => self.eventMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extractedValuesAsScala(value: Option[Map[String, String]]): MetricFilterMatchRecord.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.extractedValues(v.asJava)
    }
  }

}

final class MetricFilterMatchRecordOps(val self: MetricFilterMatchRecord) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventNumberAsScala: Option[Long] = Option(self.eventNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventMessageAsScala: Option[String] = Option(self.eventMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extractedValuesAsScala: Option[Map[String, String]] =
    Option(self.extractedValues).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricFilterMatchRecordOps {

  implicit def toMetricFilterMatchRecordBuilderOps(
      v: MetricFilterMatchRecord.Builder
  ): MetricFilterMatchRecordBuilderOps = new MetricFilterMatchRecordBuilderOps(v)

  implicit def toMetricFilterMatchRecordOps(v: MetricFilterMatchRecord): MetricFilterMatchRecordOps =
    new MetricFilterMatchRecordOps(v)

}
