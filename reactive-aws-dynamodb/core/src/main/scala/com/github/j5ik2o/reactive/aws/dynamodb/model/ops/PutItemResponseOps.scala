// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutItemResponseBuilderOps(val self: PutItemResponse.Builder) extends AnyVal {

  final def withAttributesAsScala(value: Option[Map[String, AttributeValue]]): PutItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def withConsumedCapacityAsScala(value: Option[ConsumedCapacity]): PutItemResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  } // ConsumedCapacity

  final def withItemCollectionMetricsAsScala(value: Option[ItemCollectionMetrics]): PutItemResponse.Builder = {
    value.fold(self) { v =>
      self.itemCollectionMetrics(v)
    }
  } // ItemCollectionMetrics

}

final class PutItemResponseOps(val self: PutItemResponse) extends AnyVal {

  final def attributesAsScala: Option[Map[String, AttributeValue]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity) // ConsumedCapacity

  final def itemCollectionMetricsAsScala: Option[ItemCollectionMetrics] =
    Option(self.itemCollectionMetrics) // ItemCollectionMetrics

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutItemResponseOps {

  implicit def toPutItemResponseBuilderOps(v: PutItemResponse.Builder): PutItemResponseBuilderOps =
    new PutItemResponseBuilderOps(v)

  implicit def toPutItemResponseOps(v: PutItemResponse): PutItemResponseOps = new PutItemResponseOps(v)

}
