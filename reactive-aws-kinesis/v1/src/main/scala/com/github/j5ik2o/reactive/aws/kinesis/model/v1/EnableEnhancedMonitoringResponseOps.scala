package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ EnableEnhancedMonitoringResult => JavaEnableEnhancedMonitoringResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{
  MetricsName,
  EnableEnhancedMonitoringResponse => ScalaEnableEnhancedMonitoringResponse
}

import scala.collection.JavaConverters._
object EnableEnhancedMonitoringResponseOps {

  implicit class JavaEnableEnhancedMonitoringResponseOps(val self: JavaEnableEnhancedMonitoringResponse)
      extends AnyVal {

    def toScala: ScalaEnableEnhancedMonitoringResponse = {
      ScalaEnableEnhancedMonitoringResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamName(Option(self.getStreamName))
        .withCurrentShardLevelMetrics(
          Option(self.getCurrentShardLevelMetrics).map(_.asScala.map(MetricsName.withName))
        )
        .withDesiredShardLevelMetrics(
          Option(self.getDesiredShardLevelMetrics).map(_.asScala.map(MetricsName.withName))
        )
    }

  }

}
