// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutItemResponseBuilderOps(val self: PutItemResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Map[String, AttributeValue]]): PutItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): PutItemResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionMetricsAsScala(value: Option[ItemCollectionMetrics]): PutItemResponse.Builder = {
    value.fold(self) { v =>
      self.itemCollectionMetrics(v)
    }
  }

}

final class PutItemResponseOps(val self: PutItemResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Map[String, AttributeValue]] = Option(self.attributes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionMetricsAsScala: Option[ItemCollectionMetrics] = Option(self.itemCollectionMetrics)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutItemResponseOps {

  implicit def toPutItemResponseBuilderOps(v: PutItemResponse.Builder): PutItemResponseBuilderOps =
    new PutItemResponseBuilderOps(v)

  implicit def toPutItemResponseOps(v: PutItemResponse): PutItemResponseOps = new PutItemResponseOps(v)

}
