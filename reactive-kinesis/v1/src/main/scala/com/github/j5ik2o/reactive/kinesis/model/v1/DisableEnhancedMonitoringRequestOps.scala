package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DisableEnhancedMonitoringRequest => JavaDisableEnhancedMonitoringRequest }
import com.github.j5ik2o.reactive.kinesis.model.{
  DisableEnhancedMonitoringRequest => ScalaDisableEnhancedMonitoringRequest
}

import scala.collection.JavaConverters._

object DisableEnhancedMonitoringRequestOps {

  implicit class ScalaDisableEnhancedMonitoringRequestOps(val self: ScalaDisableEnhancedMonitoringRequest)
      extends AnyVal {

    def toJava: JavaDisableEnhancedMonitoringRequest = {
      val result = new JavaDisableEnhancedMonitoringRequest()
      self.streamName.foreach(result.setStreamName)
      self.shardLevelMetrics.map(_.map(_.entryName).asJava).foreach(result.setShardLevelMetrics)
      result
    }

  }

}
