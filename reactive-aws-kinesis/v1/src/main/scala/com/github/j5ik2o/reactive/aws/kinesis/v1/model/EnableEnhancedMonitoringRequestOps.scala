// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  EnableEnhancedMonitoringRequest => ScalaEnableEnhancedMonitoringRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ EnableEnhancedMonitoringRequest => JavaEnableEnhancedMonitoringRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EnableEnhancedMonitoringRequestOps {

  implicit class ScalaEnableEnhancedMonitoringRequestOps(val self: ScalaEnableEnhancedMonitoringRequest)
      extends AnyVal {

    def toJava: JavaEnableEnhancedMonitoringRequest = {
      val result = new JavaEnableEnhancedMonitoringRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.shardLevelMetrics.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, MetricsNameOps._;
        result.withShardLevelMetrics(v.map(_.toJava.toString).asJava)
      } // Seq[String]

      result
    }

  }

}
