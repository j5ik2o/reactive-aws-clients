// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ItemCollectionMetrics => ScalaItemCollectionMetrics, _ }
import com.amazonaws.services.dynamodbv2.model.{ ItemCollectionMetrics => JavaItemCollectionMetrics }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ItemCollectionMetricsOps {

  implicit class ScalaItemCollectionMetricsOps(val self: ScalaItemCollectionMetrics) extends AnyVal {

    def toJava: JavaItemCollectionMetrics = {
      val result = new JavaItemCollectionMetrics()
      self.itemCollectionKey.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withItemCollectionKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.sizeEstimateRangeGB.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).foreach { v =>
        import scala.collection.JavaConverters._; result.withSizeEstimateRangeGB(v.asJava)
      } // Seq[Double]

      result
    }

  }

  implicit class JavaItemCollectionMetricsOps(val self: JavaItemCollectionMetrics) extends AnyVal {

    def toScala: ScalaItemCollectionMetrics = {
      ScalaItemCollectionMetrics()
        .withItemCollectionKey(Option(self.getItemCollectionKey).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withSizeEstimateRangeGB(Option(self.getSizeEstimateRangeGB).map { v =>
          import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
        }) // Seq[Double]
    }

  }

}
