// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class AnomalyDetectorConfigurationBuilderOps(val self: AnomalyDetectorConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excludedTimeRangesAsScala(value: Option[Seq[Range]]): AnomalyDetectorConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.excludedTimeRanges(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricTimezoneAsScala(value: Option[String]): AnomalyDetectorConfiguration.Builder = {
    value.fold(self) { v => self.metricTimezone(v) }
  }

}

final class AnomalyDetectorConfigurationOps(val self: AnomalyDetectorConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excludedTimeRangesAsScala: Option[Seq[Range]] =
    Option(self.excludedTimeRanges).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricTimezoneAsScala: Option[String] = Option(self.metricTimezone)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnomalyDetectorConfigurationOps {

  implicit def toAnomalyDetectorConfigurationBuilderOps(
      v: AnomalyDetectorConfiguration.Builder
  ): AnomalyDetectorConfigurationBuilderOps = new AnomalyDetectorConfigurationBuilderOps(v)

  implicit def toAnomalyDetectorConfigurationOps(v: AnomalyDetectorConfiguration): AnomalyDetectorConfigurationOps =
    new AnomalyDetectorConfigurationOps(v)

}
