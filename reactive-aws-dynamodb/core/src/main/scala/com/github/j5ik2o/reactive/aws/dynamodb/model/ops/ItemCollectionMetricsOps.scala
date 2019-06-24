// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ItemCollectionMetricsBuilderOps(val self: ItemCollectionMetrics.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionKeyAsScala(value: Option[Map[String, AttributeValue]]): ItemCollectionMetrics.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.itemCollectionKey(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeEstimateRangeGBAsScala(value: Option[Seq[Double]]): ItemCollectionMetrics.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.sizeEstimateRangeGB(v.asJava)
    }
  }

}

final class ItemCollectionMetricsOps(val self: ItemCollectionMetrics) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.itemCollectionKey).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeEstimateRangeGBAsScala: Option[Seq[Double]] = Option(self.sizeEstimateRangeGB).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.doubleValue())
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToItemCollectionMetricsOps {

  implicit def toItemCollectionMetricsBuilderOps(v: ItemCollectionMetrics.Builder): ItemCollectionMetricsBuilderOps =
    new ItemCollectionMetricsBuilderOps(v)

  implicit def toItemCollectionMetricsOps(v: ItemCollectionMetrics): ItemCollectionMetricsOps =
    new ItemCollectionMetricsOps(v)

}
