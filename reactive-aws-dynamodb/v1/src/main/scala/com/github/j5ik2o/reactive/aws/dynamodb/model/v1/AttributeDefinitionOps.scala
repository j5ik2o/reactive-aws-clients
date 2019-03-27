// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeDefinition => ScalaAttributeDefinition, _ }
import com.amazonaws.services.dynamodbv2.model.{ AttributeDefinition => JavaAttributeDefinition }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeDefinitionOps {

  implicit class ScalaAttributeDefinitionOps(val self: ScalaAttributeDefinition) extends AnyVal {

    def toJava: JavaAttributeDefinition = {
      val result = new JavaAttributeDefinition()
      self.attributeName.filter(_.nonEmpty).foreach(v => result.withAttributeName(v)) // String
      self.attributeType.foreach { v =>
        import ScalarAttributeTypeOps._; result.withAttributeType(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaAttributeDefinitionOps(val self: JavaAttributeDefinition) extends AnyVal {

    def toScala: ScalaAttributeDefinition = {
      ScalaAttributeDefinition()
        .withAttributeName(Option(self.getAttributeName)) // String
        .withAttributeType(Option(self.getAttributeType).map { v =>
          import ScalarAttributeTypeOps._; v.toScala
        }) // String
    }

  }

}
