package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  MetricsName,
  EnableEnhancedMonitoringResponse => ScalaEnableEnhancedMonitoringResponse
}
import software.amazon.awssdk.services.kinesis.model.{
  EnableEnhancedMonitoringResponse => JavaEnableEnhancedMonitoringResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object EnableEnhancedMonitoringResponseOps {

  implicit class JavaEnableEnhancedMonitoringResponseOps(val self: JavaEnableEnhancedMonitoringResponse)
      extends AnyVal {

    def toScala: ScalaEnableEnhancedMonitoringResponse = {
      ScalaEnableEnhancedMonitoringResponse()
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
