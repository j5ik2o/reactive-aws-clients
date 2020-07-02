// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttributeValueBuilderOps(val self: AttributeValue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): AttributeValue.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class AttributeValueOps(val self: AttributeValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttributeValueOps {

  implicit def toAttributeValueBuilderOps(v: AttributeValue.Builder): AttributeValueBuilderOps =
    new AttributeValueBuilderOps(v)

  implicit def toAttributeValueOps(v: AttributeValue): AttributeValueOps = new AttributeValueOps(v)

}
