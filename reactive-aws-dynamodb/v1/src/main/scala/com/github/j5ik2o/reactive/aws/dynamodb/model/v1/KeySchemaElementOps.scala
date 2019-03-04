package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ KeySchemaElement => JavaKeySchemaElement }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ KeyType, KeySchemaElement => ScalaKeySchemaElement }

object KeySchemaElementOps {

  implicit class ScalaKeySchemaElementOps(val self: ScalaKeySchemaElement) extends AnyVal {

    def toJava: JavaKeySchemaElement = {
      val result = new JavaKeySchemaElement()
      self.keyType.map(_.entryName).foreach(result.setKeyType)
      self.attributeName.foreach(result.setAttributeName)
      result
    }

  }

  implicit class JavaKeySchemaElementOps(val self: JavaKeySchemaElement) extends AnyVal {

    def toScala: ScalaKeySchemaElement = {
      ScalaKeySchemaElement()
        .withKeyType(Option(self.getKeyType).map(KeyType.withName))
        .withAttributeName(Option(self.getAttributeName))
    }

  }

}
