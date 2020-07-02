// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateItemResponseBuilderOps(val self: UpdateItemResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Map[String, AttributeValue]]): UpdateItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): UpdateItemResponse.Builder = {
    value.fold(self) { v => self.consumedCapacity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionMetricsAsScala(value: Option[ItemCollectionMetrics]): UpdateItemResponse.Builder = {
    value.fold(self) { v => self.itemCollectionMetrics(v) }
  }

}

final class UpdateItemResponseOps(val self: UpdateItemResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.attributes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemCollectionMetricsAsScala: Option[ItemCollectionMetrics] = Option(self.itemCollectionMetrics)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateItemResponseOps {

  implicit def toUpdateItemResponseBuilderOps(v: UpdateItemResponse.Builder): UpdateItemResponseBuilderOps =
    new UpdateItemResponseBuilderOps(v)

  implicit def toUpdateItemResponseOps(v: UpdateItemResponse): UpdateItemResponseOps = new UpdateItemResponseOps(v)

}
