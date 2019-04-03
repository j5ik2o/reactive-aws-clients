// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ItemResponseBuilderOps(val self: ItemResponse.Builder) extends AnyVal {

  final def withItemAsScala(value: Option[Map[String, AttributeValue]]): ItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.item(v.asJava)
    } // Map[String, AttributeValue]
  }

}

final class ItemResponseOps(val self: ItemResponse) extends AnyVal {

  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToItemResponseOps {

  implicit def toItemResponseBuilderOps(v: ItemResponse.Builder): ItemResponseBuilderOps = new ItemResponseBuilderOps(v)

  implicit def toItemResponseOps(v: ItemResponse): ItemResponseOps = new ItemResponseOps(v)

}
