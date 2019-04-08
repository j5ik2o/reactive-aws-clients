// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DisableEnhancedMonitoringRequestBuilderOps(val self: DisableEnhancedMonitoringRequest.Builder)
    extends AnyVal {

  final def streamNameAsScala(value: Option[String]): DisableEnhancedMonitoringRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def shardLevelMetricsAsScala(value: Option[Seq[MetricsName]]): DisableEnhancedMonitoringRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.shardLevelMetrics(v.asJava)
    } // Seq[String]
  }

}

final class DisableEnhancedMonitoringRequestOps(val self: DisableEnhancedMonitoringRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def shardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.shardLevelMetrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableEnhancedMonitoringRequestOps {

  implicit def toDisableEnhancedMonitoringRequestBuilderOps(
      v: DisableEnhancedMonitoringRequest.Builder
  ): DisableEnhancedMonitoringRequestBuilderOps = new DisableEnhancedMonitoringRequestBuilderOps(v)

  implicit def toDisableEnhancedMonitoringRequestOps(
      v: DisableEnhancedMonitoringRequest
  ): DisableEnhancedMonitoringRequestOps = new DisableEnhancedMonitoringRequestOps(v)

}
