// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TagBuilderOps(val self: Tag.Builder) extends AnyVal {

  final def withKeyAsScala(value: Option[String]): Tag.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withValueAsScala(value: Option[String]): Tag.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // String

}

final class TagOps(val self: Tag) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def valueAsScala: Option[String] = Option(self.value) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagOps {

  implicit def toTagBuilderOps(v: Tag.Builder): TagBuilderOps = new TagBuilderOps(v)

  implicit def toTagOps(v: Tag): TagOps = new TagOps(v)

}
