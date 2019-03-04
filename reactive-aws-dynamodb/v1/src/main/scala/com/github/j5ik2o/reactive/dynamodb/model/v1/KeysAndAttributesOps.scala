package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ KeysAndAttributes => JavaKeysAndAttributes }
import com.github.j5ik2o.reactive.dynamodb.model.{ KeysAndAttributes => ScalaKeysAndAttributes }

import scala.collection.JavaConverters._

object KeysAndAttributesOps {

  import AttributeValueOps._

  implicit class JavaKeysAndAttributesOps(val self: JavaKeysAndAttributes) extends AnyVal {

    def toScala: ScalaKeysAndAttributes = {
      ScalaKeysAndAttributes()
        .withKeys(Option(self.getKeys).map(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))))
        .withAttributesToGet(Option(self.getAttributesToGet).map(_.asScala))
        .withConsistentRead(Option(self.getConsistentRead))
        .withProjectionExpression(Option(self.getProjectionExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
    }

  }

  implicit class ScalaKeysAndAttributesOps(val self: ScalaKeysAndAttributes) extends AnyVal {

    def toJava: JavaKeysAndAttributes = {
      val result = new JavaKeysAndAttributes()
      self.keys.foreach(v => result.setKeys(v.map(_.mapValues(_.toJava).asJava).asJava))
      self.attributesToGet.foreach(v => result.setAttributesToGet(v.asJava))
      self.consistentRead.foreach(v => result.setConsistentRead(v))
      self.projectionExpression.foreach(result.setProjectionExpression)
      self.expressionAttributeNames.foreach(v => result.setExpressionAttributeNames(v.asJava))
      result
    }

  }
}
