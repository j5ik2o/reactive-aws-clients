// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ KeySchemaElement => ScalaKeySchemaElement, _ }
import com.amazonaws.services.dynamodbv2.model.{ KeySchemaElement => JavaKeySchemaElement }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object KeySchemaElementOps {

  implicit class ScalaKeySchemaElementOps(val self: ScalaKeySchemaElement) extends AnyVal {

    def toJava: JavaKeySchemaElement = {
      val result = new JavaKeySchemaElement()
      self.attributeName.filter(_.nonEmpty).foreach(v => result.withAttributeName(v)) // String
      self.keyType.foreach { v =>
        import KeyTypeOps._; result.withKeyType(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaKeySchemaElementOps(val self: JavaKeySchemaElement) extends AnyVal {

    def toScala: ScalaKeySchemaElement = {
      ScalaKeySchemaElement()
        .withAttributeName(Option(self.getAttributeName)) // String
        .withKeyType(Option(self.getKeyType).map { v =>
          import KeyTypeOps._; v.toScala
        }) // String
    }

  }

}
