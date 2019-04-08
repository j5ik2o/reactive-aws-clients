// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AttributeValueUpdateBuilderOps(val self: AttributeValueUpdate.Builder) extends AnyVal {

  final def valueAsScala(value: Option[AttributeValue]): AttributeValueUpdate.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // AttributeValue

  final def actionAsScala(value: Option[AttributeAction]): AttributeValueUpdate.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  } // String

}

final class AttributeValueUpdateOps(val self: AttributeValueUpdate) extends AnyVal {

  final def valueAsScala: Option[AttributeValue] = Option(self.value) // AttributeValue

  final def actionAsScala: Option[AttributeAction] = Option(self.action) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttributeValueUpdateOps {

  implicit def toAttributeValueUpdateBuilderOps(v: AttributeValueUpdate.Builder): AttributeValueUpdateBuilderOps =
    new AttributeValueUpdateBuilderOps(v)

  implicit def toAttributeValueUpdateOps(v: AttributeValueUpdate): AttributeValueUpdateOps =
    new AttributeValueUpdateOps(v)

}
