// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DisableEnhancedMonitoringRequestBuilderOps(val self: DisableEnhancedMonitoringRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala(value: Option[String]): DisableEnhancedMonitoringRequest.Builder = {
    value.fold(self) { v => self.streamName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardLevelMetricsAsScala(value: Option[Seq[MetricsName]]): DisableEnhancedMonitoringRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.shardLevelMetrics(v.asJava)
    }
  }

}

final class DisableEnhancedMonitoringRequestOps(val self: DisableEnhancedMonitoringRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala: Option[String] = Option(self.streamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardLevelMetricsAsScala: Option[Seq[MetricsName]] =
    Option(self.shardLevelMetrics).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
