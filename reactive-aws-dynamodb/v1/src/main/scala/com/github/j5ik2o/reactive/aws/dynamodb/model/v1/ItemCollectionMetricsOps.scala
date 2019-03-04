package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ItemCollectionMetrics => JavaItemCollectionMetrics }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ItemCollectionMetrics => ScalaItemCollectionMetrics }

import scala.collection.JavaConverters._

object ItemCollectionMetricsOps {

  import AttributeValueOps._

  implicit class ScalaItemCollectionMetricsOps(val self: ScalaItemCollectionMetrics) extends AnyVal {

    def toJava: JavaItemCollectionMetrics = {
      val result = new JavaItemCollectionMetrics()
      self.itemCollectionKey.map(_.mapValues(_.toJava).asJava).foreach(result.setItemCollectionKey)
      self.sizeEstimateRangeGB
        .map(_.map(_.asInstanceOf[java.lang.Double]).asJava).foreach(v => result.setSizeEstimateRangeGB(v))
      result
    }

  }
  implicit class JavaItemCollectionMetricsOps(val self: JavaItemCollectionMetrics) extends AnyVal {

    def toScala: ScalaItemCollectionMetrics = {
      ScalaItemCollectionMetrics(
        itemCollectionKey = Option(self.getItemCollectionKey).map(_.asScala.toMap.mapValues(_.toScala)),
        sizeEstimateRangeGB = Option(self.getSizeEstimateRangeGB).map(_.asScala.map(_.toDouble))
      )
    }

  }

}
