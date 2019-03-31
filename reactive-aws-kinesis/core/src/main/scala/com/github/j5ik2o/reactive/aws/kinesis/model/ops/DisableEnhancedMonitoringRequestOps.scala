// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DisableEnhancedMonitoringRequest => ScalaDisableEnhancedMonitoringRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DisableEnhancedMonitoringRequest => JavaDisableEnhancedMonitoringRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DisableEnhancedMonitoringRequestOps {

  implicit class ScalaDisableEnhancedMonitoringRequestOps(val self: ScalaDisableEnhancedMonitoringRequest)
      extends AnyVal {

    def toJava: JavaDisableEnhancedMonitoringRequest = {
      val result = JavaDisableEnhancedMonitoringRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.shardLevelMetrics.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, MetricsNameOps._; result.shardLevelMetrics(v.map(_.toJava).asJava)
      } // Seq[String]

      result.build()
    }

  }

}
