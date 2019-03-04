package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ItemCollectionMetrics => ScalaItemCollectionMetrics }
import software.amazon.awssdk.services.dynamodb.model.{ ItemCollectionMetrics => JavaItemCollectionMetrics }

import scala.collection.JavaConverters._

object ItemCollectionMetricsOps {

  import AttributeValueOps._

  implicit class ScalaItemCollectionMetricsOps(val self: ScalaItemCollectionMetrics) extends AnyVal {

    def toJava: JavaItemCollectionMetrics = {
      val result = JavaItemCollectionMetrics.builder()
      self.itemCollectionKey.map(_.mapValues(_.toJava).asJava).foreach(result.itemCollectionKey)
      self.sizeEstimateRangeGB
        .map(_.map(_.asInstanceOf[java.lang.Double]).asJava).foreach(v => result.sizeEstimateRangeGB(v))
      result.build()
    }

  }
  implicit class JavaItemCollectionMetricsOps(val self: JavaItemCollectionMetrics) extends AnyVal {

    def toScala: ScalaItemCollectionMetrics = {
      ScalaItemCollectionMetrics(
        itemCollectionKey = Option(self.itemCollectionKey).map(_.asScala.toMap.mapValues(_.toScala)),
        sizeEstimateRangeGB = Option(self.sizeEstimateRangeGB).map(_.asScala.map(_.toDouble))
      )
    }

  }

}
