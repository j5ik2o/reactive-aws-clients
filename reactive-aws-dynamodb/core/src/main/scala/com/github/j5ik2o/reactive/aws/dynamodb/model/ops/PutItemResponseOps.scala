// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutItemResponseBuilderOps(val self: PutItemResponse.Builder) extends AnyVal {

  final def attributesAsScala(value: Option[Map[String, AttributeValue]]): PutItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    }
  }

  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): PutItemResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  }

  final def itemCollectionMetricsAsScala(value: Option[ItemCollectionMetrics]): PutItemResponse.Builder = {
    value.fold(self) { v =>
      self.itemCollectionMetrics(v)
    }
  }

}

final class PutItemResponseOps(val self: PutItemResponse) extends AnyVal {

  final def attributesAsScala: Option[Map[String, AttributeValue]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity)

  final def itemCollectionMetricsAsScala: Option[ItemCollectionMetrics] = Option(self.itemCollectionMetrics)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutItemResponseOps {

  implicit def toPutItemResponseBuilderOps(v: PutItemResponse.Builder): PutItemResponseBuilderOps =
    new PutItemResponseBuilderOps(v)

  implicit def toPutItemResponseOps(v: PutItemResponse): PutItemResponseOps = new PutItemResponseOps(v)

}
