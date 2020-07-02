// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class AttributeBuilderOps(val self: Attribute.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Attribute.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Attribute.Builder = {
    value.fold(self) { v => self.value(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTypeAsScala(value: Option[TargetType]): Attribute.Builder = {
    value.fold(self) { v => self.targetType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetIdAsScala(value: Option[String]): Attribute.Builder = {
    value.fold(self) { v => self.targetId(v) }
  }

}

final class AttributeOps(val self: Attribute) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTypeAsScala: Option[TargetType] = Option(self.targetType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetIdAsScala: Option[String] = Option(self.targetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttributeOps {

  implicit def toAttributeBuilderOps(v: Attribute.Builder): AttributeBuilderOps = new AttributeBuilderOps(v)

  implicit def toAttributeOps(v: Attribute): AttributeOps = new AttributeOps(v)

}
