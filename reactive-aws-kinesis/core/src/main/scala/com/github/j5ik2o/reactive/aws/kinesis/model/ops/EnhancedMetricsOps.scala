// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ EnhancedMetrics => ScalaEnhancedMetrics, _ }
import software.amazon.awssdk.services.kinesis.model.{ EnhancedMetrics => JavaEnhancedMetrics }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EnhancedMetricsOps {

  implicit class ScalaEnhancedMetricsOps(val self: ScalaEnhancedMetrics) extends AnyVal {

    def toJava: JavaEnhancedMetrics = {
      val result = JavaEnhancedMetrics.builder()
      self.shardLevelMetrics.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, MetricsNameOps._; result.shardLevelMetrics(v.map(_.toJava).asJava)
      } // Seq[String]

      result.build()
    }

  }

  implicit class JavaEnhancedMetricsOps(val self: JavaEnhancedMetrics) extends AnyVal {

    def toScala: ScalaEnhancedMetrics = {
      ScalaEnhancedMetrics()
        .withShardLevelMetrics(Option(self.shardLevelMetrics).map { v =>
          import scala.collection.JavaConverters._, MetricsNameOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
    }

  }

}
