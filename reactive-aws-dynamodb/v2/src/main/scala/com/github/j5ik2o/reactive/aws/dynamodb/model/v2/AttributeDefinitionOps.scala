package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeType, AttributeDefinition => ScalaAttributeDefinition }
import software.amazon.awssdk.services.dynamodb.model.{ AttributeDefinition => JavaAttributeDefinition }

object AttributeDefinitionOps {

  implicit class ScalaAttributeDefinitionOps(val self: ScalaAttributeDefinition) extends AnyVal {

    def toJava: JavaAttributeDefinition = {
      val result = JavaAttributeDefinition.builder()
      self.attributeName.foreach(result.attributeName)
      self.attributeType.foreach(v => result.attributeType(v.entryName))
      result.build()
    }

  }

  implicit class JavaAttributeDefinitionOps(val self: JavaAttributeDefinition) extends AnyVal {

    def toScala: ScalaAttributeDefinition = {
      ScalaAttributeDefinition()
        .withAttributeName(Option(self.attributeName)).withAttributeType(
          Option(self.attributeType).map(_.toString).map(AttributeType.withName)
        )
    }

  }
}
