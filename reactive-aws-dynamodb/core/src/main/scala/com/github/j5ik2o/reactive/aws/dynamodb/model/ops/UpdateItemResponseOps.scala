// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateItemResponseBuilderOps(val self: UpdateItemResponse.Builder) extends AnyVal {

  final def attributesAsScala(value: Option[Map[String, AttributeValue]]): UpdateItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    }
  }

  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): UpdateItemResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  }

  final def itemCollectionMetricsAsScala(value: Option[ItemCollectionMetrics]): UpdateItemResponse.Builder = {
    value.fold(self) { v =>
      self.itemCollectionMetrics(v)
    }
  }

}

final class UpdateItemResponseOps(val self: UpdateItemResponse) extends AnyVal {

  final def attributesAsScala: Option[Map[String, AttributeValue]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity)

  final def itemCollectionMetricsAsScala: Option[ItemCollectionMetrics] = Option(self.itemCollectionMetrics)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateItemResponseOps {

  implicit def toUpdateItemResponseBuilderOps(v: UpdateItemResponse.Builder): UpdateItemResponseBuilderOps =
    new UpdateItemResponseBuilderOps(v)

  implicit def toUpdateItemResponseOps(v: UpdateItemResponse): UpdateItemResponseOps = new UpdateItemResponseOps(v)

}
