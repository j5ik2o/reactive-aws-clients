package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ AttributeDefinition => JavaAttributeDefinition }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ScalarAttributeType,
  AttributeDefinition => ScalaAttributeDefinition
}

object AttributeDefinitionOps {

  implicit class ScalaAttributeDefinitionOps(val self: ScalaAttributeDefinition) extends AnyVal {

    def toJava: JavaAttributeDefinition = {
      val result = new JavaAttributeDefinition()
      self.attributeName.foreach(result.setAttributeName)
      self.attributeType.foreach(v => result.setAttributeType(v.entryName))
      result
    }

  }

  implicit class JavaAttributeDefinitionOps(val self: JavaAttributeDefinition) extends AnyVal {

    def toScala: ScalaAttributeDefinition = {
      ScalaAttributeDefinition()
        .withAttributeName(Option(self.getAttributeName)).withAttributeType(
          Option(self.getAttributeType).map(ScalarAttributeType.withName)
        )
    }

  }

}
