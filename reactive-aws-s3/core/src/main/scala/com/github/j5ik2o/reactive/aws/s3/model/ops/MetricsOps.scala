// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MetricsBuilderOps(val self: Metrics.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[MetricsStatus]): Metrics.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventThresholdAsScala(value: Option[ReplicationTimeValue]): Metrics.Builder = {
    value.fold(self) { v =>
      self.eventThreshold(v)
    }
  }

}

final class MetricsOps(val self: Metrics) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[MetricsStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventThresholdAsScala: Option[ReplicationTimeValue] = Option(self.eventThreshold)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricsOps {

  implicit def toMetricsBuilderOps(v: Metrics.Builder): MetricsBuilderOps = new MetricsBuilderOps(v)

  implicit def toMetricsOps(v: Metrics): MetricsOps = new MetricsOps(v)

}
