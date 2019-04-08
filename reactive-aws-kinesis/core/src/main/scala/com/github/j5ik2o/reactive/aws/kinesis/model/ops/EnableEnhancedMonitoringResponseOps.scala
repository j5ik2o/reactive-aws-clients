// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class EnableEnhancedMonitoringResponseBuilderOps(val self: EnableEnhancedMonitoringResponse.Builder)
    extends AnyVal {

  final def streamNameAsScala(value: Option[String]): EnableEnhancedMonitoringResponse.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def currentShardLevelMetricsAsScala(
      value: Option[Seq[MetricsName]]
  ): EnableEnhancedMonitoringResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.currentShardLevelMetrics(v.asJava)
    } // Seq[MetricsName]
  }

  final def desiredShardLevelMetricsAsScala(
      value: Option[Seq[MetricsName]]
  ): EnableEnhancedMonitoringResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.desiredShardLevelMetrics(v.asJava)
    } // Seq[MetricsName]
  }

}

final class EnableEnhancedMonitoringResponseOps(val self: EnableEnhancedMonitoringResponse) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def currentShardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.currentShardLevelMetrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetricsName]

  final def desiredShardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.desiredShardLevelMetrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetricsName]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableEnhancedMonitoringResponseOps {

  implicit def toEnableEnhancedMonitoringResponseBuilderOps(
      v: EnableEnhancedMonitoringResponse.Builder
  ): EnableEnhancedMonitoringResponseBuilderOps = new EnableEnhancedMonitoringResponseBuilderOps(v)

  implicit def toEnableEnhancedMonitoringResponseOps(
      v: EnableEnhancedMonitoringResponse
  ): EnableEnhancedMonitoringResponseOps = new EnableEnhancedMonitoringResponseOps(v)

}
