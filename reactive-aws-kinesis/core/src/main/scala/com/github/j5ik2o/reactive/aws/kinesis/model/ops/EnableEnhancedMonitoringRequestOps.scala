// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class EnableEnhancedMonitoringRequestBuilderOps(val self: EnableEnhancedMonitoringRequest.Builder)
    extends AnyVal {

  final def streamNameAsScala(value: Option[String]): EnableEnhancedMonitoringRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def shardLevelMetricsAsScala(value: Option[Seq[MetricsName]]): EnableEnhancedMonitoringRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.shardLevelMetrics(v.asJava)
    }
  }

}

final class EnableEnhancedMonitoringRequestOps(val self: EnableEnhancedMonitoringRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def shardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.shardLevelMetrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableEnhancedMonitoringRequestOps {

  implicit def toEnableEnhancedMonitoringRequestBuilderOps(
      v: EnableEnhancedMonitoringRequest.Builder
  ): EnableEnhancedMonitoringRequestBuilderOps = new EnableEnhancedMonitoringRequestBuilderOps(v)

  implicit def toEnableEnhancedMonitoringRequestOps(
      v: EnableEnhancedMonitoringRequest
  ): EnableEnhancedMonitoringRequestOps = new EnableEnhancedMonitoringRequestOps(v)

}
