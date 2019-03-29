// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ EnhancedMetrics => ScalaEnhancedMetrics, _ }
import com.amazonaws.services.kinesis.model.{ EnhancedMetrics => JavaEnhancedMetrics }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EnhancedMetricsOps {

  implicit class ScalaEnhancedMetricsOps(val self: ScalaEnhancedMetrics) extends AnyVal {

    def toJava: JavaEnhancedMetrics = {
      val result = new JavaEnhancedMetrics()
      self.shardLevelMetrics.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, MetricsNameOps._;
        result.withShardLevelMetrics(v.map(_.toJava.toString).asJava)
      } // Seq[String]

      result
    }

  }

  implicit class JavaEnhancedMetricsOps(val self: JavaEnhancedMetrics) extends AnyVal {

    def toScala: ScalaEnhancedMetrics = {
      ScalaEnhancedMetrics()
        .withShardLevelMetrics(Option(self.getShardLevelMetrics).map { v =>
          import scala.collection.JavaConverters._, MetricsNameOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
    }

  }

}
