package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ KeyType, KeySchemaElement => ScalaKeySchemaElement }
import software.amazon.awssdk.services.dynamodb.model.{ KeySchemaElement => JavaKeySchemaElement }

object KeySchemaElementOps {

  implicit class ScalaKeySchemaElementOps(val self: ScalaKeySchemaElement) extends AnyVal {

    def toJava: JavaKeySchemaElement = {
      val result = JavaKeySchemaElement.builder()
      self.keyType.map(_.entryName).foreach(result.keyType)
      self.attributeName.foreach(result.attributeName)
      result.build()
    }

  }

  implicit class JavaKeySchemaElementOps(val self: JavaKeySchemaElement) extends AnyVal {

    def toScala: ScalaKeySchemaElement = {
      ScalaKeySchemaElement()
        .withKeyType(Option(self.keyType).map(_.toString).map(KeyType.withName))
        .withAttributeName(Option(self.attributeName))
    }

  }

}
