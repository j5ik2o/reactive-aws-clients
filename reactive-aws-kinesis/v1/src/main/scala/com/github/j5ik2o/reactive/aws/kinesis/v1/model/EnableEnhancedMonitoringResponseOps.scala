// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  EnableEnhancedMonitoringResponse => ScalaEnableEnhancedMonitoringResponse,
  _
}
import com.amazonaws.services.kinesis.model.{ EnableEnhancedMonitoringResult => JavaEnableEnhancedMonitoringResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EnableEnhancedMonitoringResponseOps {

  implicit class JavaEnableEnhancedMonitoringResponseOps(val self: JavaEnableEnhancedMonitoringResponse)
      extends AnyVal {

    def toScala: ScalaEnableEnhancedMonitoringResponse = {
      ScalaEnableEnhancedMonitoringResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamName(Option(self.getStreamName)) // String
        .withCurrentShardLevelMetrics(Option(self.getCurrentShardLevelMetrics).map { v =>
          import scala.collection.JavaConverters._, MetricsNameOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
        .withDesiredShardLevelMetrics(Option(self.getDesiredShardLevelMetrics).map { v =>
          import scala.collection.JavaConverters._, MetricsNameOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
    }

  }

}
