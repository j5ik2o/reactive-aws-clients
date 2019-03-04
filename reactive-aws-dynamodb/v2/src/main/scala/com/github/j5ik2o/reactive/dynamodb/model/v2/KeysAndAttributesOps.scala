package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ KeysAndAttributes => ScalaKeysAndAttributes }
import software.amazon.awssdk.services.dynamodb.model.{ KeysAndAttributes => JavaKeysAndAttributes }

import scala.collection.JavaConverters._

object KeysAndAttributesOps {
  import AttributeValueOps._

  implicit class JavaKeysAndAttributesOps(val self: JavaKeysAndAttributes) extends AnyVal {

    def toScala: ScalaKeysAndAttributes = {
      ScalaKeysAndAttributes()
        .withKeys(Option(self.keys()).map(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))))
        .withAttributesToGet(Option(self.attributesToGet).map(_.asScala))
        .withConsistentRead(Option(self.consistentRead))
        .withProjectionExpression(Option(self.projectionExpression))
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map(_.asScala.toMap))
    }

  }

  implicit class ScalaKeysAndAttributesOps(val self: ScalaKeysAndAttributes) extends AnyVal {

    def toJava: JavaKeysAndAttributes = {
      val result = JavaKeysAndAttributes.builder()
      self.keys.foreach(v => result.keys(v.map(_.mapValues(_.toJava).asJava).asJava))
      self.attributesToGet.foreach(v => result.attributesToGet(v.asJava))
      self.consistentRead.foreach(v => result.consistentRead(v))
      self.projectionExpression.foreach(result.projectionExpression)
      self.expressionAttributeNames.foreach(v => result.expressionAttributeNames(v.asJava))
      result.build()
    }

  }

}
