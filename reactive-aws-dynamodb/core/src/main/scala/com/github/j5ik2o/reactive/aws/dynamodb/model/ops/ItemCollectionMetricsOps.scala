// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ItemCollectionMetricsBuilderOps(val self: ItemCollectionMetrics.Builder) extends AnyVal {

  final def itemCollectionKeyAsScala(value: Option[Map[String, AttributeValue]]): ItemCollectionMetrics.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.itemCollectionKey(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def sizeEstimateRangeGBAsScala(value: Option[Seq[Double]]): ItemCollectionMetrics.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.sizeEstimateRangeGB(v.asJava)
    } // Seq[Double]
  }

}

final class ItemCollectionMetricsOps(val self: ItemCollectionMetrics) extends AnyVal {

  final def itemCollectionKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.itemCollectionKey).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def sizeEstimateRangeGBAsScala: Option[Seq[Double]] = Option(self.sizeEstimateRangeGB).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
  } // Seq[Double]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToItemCollectionMetricsOps {

  implicit def toItemCollectionMetricsBuilderOps(v: ItemCollectionMetrics.Builder): ItemCollectionMetricsBuilderOps =
    new ItemCollectionMetricsBuilderOps(v)

  implicit def toItemCollectionMetricsOps(v: ItemCollectionMetrics): ItemCollectionMetricsOps =
    new ItemCollectionMetricsOps(v)

}
