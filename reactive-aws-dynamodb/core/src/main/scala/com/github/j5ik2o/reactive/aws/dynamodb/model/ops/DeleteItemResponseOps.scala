// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteItemResponseBuilderOps(val self: DeleteItemResponse.Builder) extends AnyVal {

  final def attributesAsScala(value: Option[Map[String, AttributeValue]]): DeleteItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): DeleteItemResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  } // ConsumedCapacity

  final def itemCollectionMetricsAsScala(value: Option[ItemCollectionMetrics]): DeleteItemResponse.Builder = {
    value.fold(self) { v =>
      self.itemCollectionMetrics(v)
    }
  } // ItemCollectionMetrics

}

final class DeleteItemResponseOps(val self: DeleteItemResponse) extends AnyVal {

  final def attributesAsScala: Option[Map[String, AttributeValue]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity) // ConsumedCapacity

  final def itemCollectionMetricsAsScala: Option[ItemCollectionMetrics] =
    Option(self.itemCollectionMetrics) // ItemCollectionMetrics

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteItemResponseOps {

  implicit def toDeleteItemResponseBuilderOps(v: DeleteItemResponse.Builder): DeleteItemResponseBuilderOps =
    new DeleteItemResponseBuilderOps(v)

  implicit def toDeleteItemResponseOps(v: DeleteItemResponse): DeleteItemResponseOps = new DeleteItemResponseOps(v)

}
