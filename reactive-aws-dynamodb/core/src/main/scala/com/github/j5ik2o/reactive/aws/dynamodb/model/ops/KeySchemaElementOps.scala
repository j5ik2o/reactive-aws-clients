// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class KeySchemaElementBuilderOps(val self: KeySchemaElement.Builder) extends AnyVal {

  final def attributeNameAsScala(value: Option[String]): KeySchemaElement.Builder = {
    value.fold(self) { v =>
      self.attributeName(v)
    }
  } // String

  final def keyTypeAsScala(value: Option[KeyType]): KeySchemaElement.Builder = {
    value.fold(self) { v =>
      self.keyType(v)
    }
  } // KeyType

}

final class KeySchemaElementOps(val self: KeySchemaElement) extends AnyVal {

  final def attributeNameAsScala: Option[String] = Option(self.attributeName) // String

  final def keyTypeAsScala: Option[KeyType] = Option(self.keyType) // KeyType

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeySchemaElementOps {

  implicit def toKeySchemaElementBuilderOps(v: KeySchemaElement.Builder): KeySchemaElementBuilderOps =
    new KeySchemaElementBuilderOps(v)

  implicit def toKeySchemaElementOps(v: KeySchemaElement): KeySchemaElementOps = new KeySchemaElementOps(v)

}
