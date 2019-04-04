// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AttributeDefinitionBuilderOps(val self: AttributeDefinition.Builder) extends AnyVal {

  final def withAttributeNameAsScala(value: Option[String]): AttributeDefinition.Builder = {
    value.fold(self) { v =>
      self.attributeName(v)
    }
  } // String

  final def withAttributeTypeAsScala(value: Option[ScalarAttributeType]): AttributeDefinition.Builder = {
    value.fold(self) { v =>
      self.attributeType(v)
    }
  } // String

}

final class AttributeDefinitionOps(val self: AttributeDefinition) extends AnyVal {

  final def attributeNameAsScala: Option[String] = Option(self.attributeName) // String

  final def attributeTypeAsScala: Option[ScalarAttributeType] = Option(self.attributeType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttributeDefinitionOps {

  implicit def toAttributeDefinitionBuilderOps(v: AttributeDefinition.Builder): AttributeDefinitionBuilderOps =
    new AttributeDefinitionBuilderOps(v)

  implicit def toAttributeDefinitionOps(v: AttributeDefinition): AttributeDefinitionOps = new AttributeDefinitionOps(v)

}
