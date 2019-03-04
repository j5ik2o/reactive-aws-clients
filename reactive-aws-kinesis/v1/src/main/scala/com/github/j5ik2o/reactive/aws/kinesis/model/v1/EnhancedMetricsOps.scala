package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ EnhancedMetrics => JavaEnhancedMetrics }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ MetricsName, EnhancedMetrics => ScalaEnhancedMetrics }

import scala.collection.JavaConverters._

object EnhancedMetricsOps {

  implicit class ScalaEnhancedMetricsOps(val self: ScalaEnhancedMetrics) extends AnyVal {

    def toJava: JavaEnhancedMetrics = {
      val result = new JavaEnhancedMetrics
      self.shardLevelMetrics.map(_.map(_.entryName).asJava).foreach(result.setShardLevelMetrics)
      result
    }

  }

  implicit class JavaEnhancedMetricsOps(val self: JavaEnhancedMetrics) extends AnyVal {

    def toScala: ScalaEnhancedMetrics = {
      ScalaEnhancedMetrics()
        .withShardLevelMetrics(
          Option(self.getShardLevelMetrics).map(_.asScala.map(MetricsName.withName))
        )
    }

  }

}
