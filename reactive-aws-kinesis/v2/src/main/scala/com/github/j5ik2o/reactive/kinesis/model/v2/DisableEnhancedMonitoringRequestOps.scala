package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{
  DisableEnhancedMonitoringRequest => ScalaDisableEnhancedMonitoringRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  DisableEnhancedMonitoringRequest => JavaDisableEnhancedMonitoringRequest
}

import scala.collection.JavaConverters._

object DisableEnhancedMonitoringRequestOps {

  implicit class ScalaDisableEnhancedMonitoringRequestOps(val self: ScalaDisableEnhancedMonitoringRequest)
      extends AnyVal {

    def toJava: JavaDisableEnhancedMonitoringRequest = {
      val result = JavaDisableEnhancedMonitoringRequest.builder()
      self.streamName.foreach(result.streamName)
      self.shardLevelMetrics.map(_.map(_.entryName).asJava).foreach(result.shardLevelMetricsWithStrings)
      result.build()
    }

  }

}
