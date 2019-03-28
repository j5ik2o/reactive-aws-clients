// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  EnableEnhancedMonitoringRequest => ScalaEnableEnhancedMonitoringRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  EnableEnhancedMonitoringRequest => JavaEnableEnhancedMonitoringRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EnableEnhancedMonitoringRequestOps {

  implicit class ScalaEnableEnhancedMonitoringRequestOps(val self: ScalaEnableEnhancedMonitoringRequest)
      extends AnyVal {

    def toJava: JavaEnableEnhancedMonitoringRequest = {
      val result = JavaEnableEnhancedMonitoringRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.shardLevelMetrics.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, MetricsNameOps._; result.shardLevelMetrics(v.map(_.toJava).asJava)
      } // Seq[String]

      result.build()
    }

  }

}
