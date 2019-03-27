// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeDefinition => ScalaAttributeDefinition, _ }
import software.amazon.awssdk.services.dynamodb.model.{ AttributeDefinition => JavaAttributeDefinition }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeDefinitionOps {

  implicit class ScalaAttributeDefinitionOps(val self: ScalaAttributeDefinition) extends AnyVal {

    def toJava: JavaAttributeDefinition = {
      val result = JavaAttributeDefinition.builder()
      self.attributeName.filter(_.nonEmpty).foreach(v => result.attributeName(v)) // String
      self.attributeType.foreach { v =>
        import ScalarAttributeTypeOps._; result.attributeType(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaAttributeDefinitionOps(val self: JavaAttributeDefinition) extends AnyVal {

    def toScala: ScalaAttributeDefinition = {
      ScalaAttributeDefinition()
        .withAttributeName(Option(self.attributeName)) // String
        .withAttributeType(Option(self.attributeType).map { v =>
          import ScalarAttributeTypeOps._; v.toScala
        }) // String
    }

  }

}
