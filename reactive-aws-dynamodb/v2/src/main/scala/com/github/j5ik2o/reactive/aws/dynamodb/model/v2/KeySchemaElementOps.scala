// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ KeySchemaElement => ScalaKeySchemaElement, _ }
import software.amazon.awssdk.services.dynamodb.model.{ KeySchemaElement => JavaKeySchemaElement }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object KeySchemaElementOps {

  implicit class ScalaKeySchemaElementOps(val self: ScalaKeySchemaElement) extends AnyVal {

    def toJava: JavaKeySchemaElement = {
      val result = JavaKeySchemaElement.builder()
      self.attributeName.filter(_.nonEmpty).foreach(v => result.attributeName(v)) // String
      self.keyType.foreach { v =>
        import KeyTypeOps._; result.keyType(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaKeySchemaElementOps(val self: JavaKeySchemaElement) extends AnyVal {

    def toScala: ScalaKeySchemaElement = {
      ScalaKeySchemaElement()
        .withAttributeName(Option(self.attributeName)) // String
        .withKeyType(Option(self.keyType).map { v =>
          import KeyTypeOps._; v.toScala
        }) // String
    }

  }

}
