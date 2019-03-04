package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{
  EnableEnhancedMonitoringRequest => ScalaEnableEnhancedMonitoringRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  EnableEnhancedMonitoringRequest => JavaEnableEnhancedMonitoringRequest
}

import scala.collection.JavaConverters._

object EnableEnhancedMonitoringRequestOps {

  implicit class ScalaEnableEnhancedMonitoringRequestOps(val self: ScalaEnableEnhancedMonitoringRequest)
      extends AnyVal {

    def toJava: JavaEnableEnhancedMonitoringRequest = {
      val result = JavaEnableEnhancedMonitoringRequest.builder()
      self.streamName.foreach(result.streamName)
      self.shardLevelMetrics.map(_.map(_.entryName).asJava).foreach(result.shardLevelMetricsWithStrings)
      result.build()
    }

  }

}
