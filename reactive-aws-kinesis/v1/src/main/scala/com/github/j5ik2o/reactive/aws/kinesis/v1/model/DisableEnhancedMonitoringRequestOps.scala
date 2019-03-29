// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DisableEnhancedMonitoringRequest => ScalaDisableEnhancedMonitoringRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ DisableEnhancedMonitoringRequest => JavaDisableEnhancedMonitoringRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DisableEnhancedMonitoringRequestOps {

  implicit class ScalaDisableEnhancedMonitoringRequestOps(val self: ScalaDisableEnhancedMonitoringRequest)
      extends AnyVal {

    def toJava: JavaDisableEnhancedMonitoringRequest = {
      val result = new JavaDisableEnhancedMonitoringRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.shardLevelMetrics.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, MetricsNameOps._;
        result.withShardLevelMetrics(v.map(_.toJava.toString).asJava)
      } // Seq[String]

      result
    }

  }

}
