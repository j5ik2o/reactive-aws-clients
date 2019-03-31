// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  EnableEnhancedMonitoringResponse => ScalaEnableEnhancedMonitoringResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  EnableEnhancedMonitoringResponse => JavaEnableEnhancedMonitoringResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EnableEnhancedMonitoringResponseOps {

  implicit class JavaEnableEnhancedMonitoringResponseOps(val self: JavaEnableEnhancedMonitoringResponse)
      extends AnyVal {

    def toScala: ScalaEnableEnhancedMonitoringResponse = {
      ScalaEnableEnhancedMonitoringResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStreamName(Option(self.streamName)) // String
        .withCurrentShardLevelMetrics(Option(self.currentShardLevelMetrics).map { v =>
          import scala.collection.JavaConverters._, MetricsNameOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
        .withDesiredShardLevelMetrics(Option(self.desiredShardLevelMetrics).map { v =>
          import scala.collection.JavaConverters._, MetricsNameOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
    }

  }

}
