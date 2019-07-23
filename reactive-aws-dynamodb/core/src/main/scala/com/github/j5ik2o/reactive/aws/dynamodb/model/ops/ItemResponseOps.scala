// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ItemResponseBuilderOps(val self: ItemResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemAsScala(value: Option[Map[String, AttributeValue]]): ItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.item(v.asJava)
    }
  }

}

final class ItemResponseOps(val self: ItemResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToItemResponseOps {

  implicit def toItemResponseBuilderOps(v: ItemResponse.Builder): ItemResponseBuilderOps = new ItemResponseBuilderOps(v)

  implicit def toItemResponseOps(v: ItemResponse): ItemResponseOps = new ItemResponseOps(v)

}
