package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ MetricsName, EnhancedMetrics => ScalaEnhancedMetrics }
import software.amazon.awssdk.services.kinesis.model.{ EnhancedMetrics => JavaEnhancedMetrics }

import scala.collection.JavaConverters._

object EnhancedMetricsOps {

  implicit class ScalaEnhancedMetricsOps(val self: ScalaEnhancedMetrics) extends AnyVal {

    def toJava: JavaEnhancedMetrics = {
      val result = JavaEnhancedMetrics.builder()
      self.shardLevelMetrics.map(_.map(_.entryName).asJava).foreach(result.shardLevelMetricsWithStrings)
      result.build()
    }

  }

  implicit class JavaEnhancedMetricsOps(val self: JavaEnhancedMetrics) extends AnyVal {

    def toScala: ScalaEnhancedMetrics = {
      ScalaEnhancedMetrics()
        .withShardLevelMetrics(
          Option(self.shardLevelMetrics()).map(_.asScala.map(_.toString).map(MetricsName.withName))
        )
    }

  }

}
