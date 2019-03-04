package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ EnableEnhancedMonitoringRequest => JavaEnableEnhancedMonitoringRequest }
import com.github.j5ik2o.reactive.kinesis.model.{
  EnableEnhancedMonitoringRequest => ScalaEnableEnhancedMonitoringRequest
}

import scala.collection.JavaConverters._

object EnableEnhancedMonitoringRequestOps {

  implicit class ScalaEnableEnhancedMonitoringRequestOps(val self: ScalaEnableEnhancedMonitoringRequest)
      extends AnyVal {

    def toJava: JavaEnableEnhancedMonitoringRequest = {
      val result = new JavaEnableEnhancedMonitoringRequest()
      self.streamName.foreach(result.setStreamName)
      self.shardLevelMetrics.map(_.map(_.entryName).asJava).foreach(result.setShardLevelMetrics)
      result
    }

  }

}
