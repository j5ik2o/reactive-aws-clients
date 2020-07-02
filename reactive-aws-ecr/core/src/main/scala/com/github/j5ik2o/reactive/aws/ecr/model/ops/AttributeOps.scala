// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class AttributeBuilderOps(val self: Attribute.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): Attribute.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Attribute.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class AttributeOps(val self: Attribute) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttributeOps {

  implicit def toAttributeBuilderOps(v: Attribute.Builder): AttributeBuilderOps = new AttributeBuilderOps(v)

  implicit def toAttributeOps(v: Attribute): AttributeOps = new AttributeOps(v)

}
