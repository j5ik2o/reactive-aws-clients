package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{
  MetricsName,
  DisableEnhancedMonitoringResponse => ScalaDisableEnhancedMonitoringResponse
}
import software.amazon.awssdk.services.kinesis.model.{
  DisableEnhancedMonitoringResponse => JavaDisableEnhancedMonitoringResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DisableEnhancedMonitoringResponseOps {
  implicit class JavaDisableEnhancedMonitoringResponseOps(val self: JavaDisableEnhancedMonitoringResponse)
      extends AnyVal {

    def toScala: ScalaDisableEnhancedMonitoringResponse = {
      ScalaDisableEnhancedMonitoringResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStreamName(Option(self.streamName()))
        .withCurrentShardLevelMetrics(
          Option(self.currentShardLevelMetrics()).map(_.asScala.map(_.toString).map(MetricsName.withName))
        )
        .withDesiredShardLevelMetrics(
          Option(self.desiredShardLevelMetrics()).map(_.asScala.map(_.toString).map(MetricsName.withName))
        )
    }

  }
}
