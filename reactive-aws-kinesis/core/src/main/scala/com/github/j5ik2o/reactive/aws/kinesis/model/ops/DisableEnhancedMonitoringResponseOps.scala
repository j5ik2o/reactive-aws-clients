// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DisableEnhancedMonitoringResponseBuilderOps(val self: DisableEnhancedMonitoringResponse.Builder)
    extends AnyVal {

  final def streamNameAsScala(value: Option[String]): DisableEnhancedMonitoringResponse.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def currentShardLevelMetricsAsScala(
      value: Option[Seq[MetricsName]]
  ): DisableEnhancedMonitoringResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.currentShardLevelMetrics(v.asJava)
    }
  }

  final def desiredShardLevelMetricsAsScala(
      value: Option[Seq[MetricsName]]
  ): DisableEnhancedMonitoringResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.desiredShardLevelMetrics(v.asJava)
    }
  }

}

final class DisableEnhancedMonitoringResponseOps(val self: DisableEnhancedMonitoringResponse) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def currentShardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.currentShardLevelMetrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def desiredShardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.desiredShardLevelMetrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableEnhancedMonitoringResponseOps {

  implicit def toDisableEnhancedMonitoringResponseBuilderOps(
      v: DisableEnhancedMonitoringResponse.Builder
  ): DisableEnhancedMonitoringResponseBuilderOps = new DisableEnhancedMonitoringResponseBuilderOps(v)

  implicit def toDisableEnhancedMonitoringResponseOps(
      v: DisableEnhancedMonitoringResponse
  ): DisableEnhancedMonitoringResponseOps = new DisableEnhancedMonitoringResponseOps(v)

}
