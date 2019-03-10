package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetItemRequest => ScalaGetItemRequest }
import software.amazon.awssdk.services.dynamodb.model.{ GetItemRequest => JavaGetItemRequest }

import scala.collection.JavaConverters._

object GetItemRequestOps {

  import AttributeValueOps._

  implicit class ScalaGetItemRequestOps(val self: ScalaGetItemRequest) extends AnyVal {

    def toJava: JavaGetItemRequest = {
      val result = JavaGetItemRequest.builder()
      self.tableName.foreach(result.tableName)
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.key)
      self.attributesToGet.map(_.asJava).foreach(result.attributesToGet)
      self.consistentRead.foreach(v => result.consistentRead(v))
      self.returnConsumedCapacity.foreach(result.returnConsumedCapacity)
      self.projectionExpression.foreach(result.projectionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      result.build()
    }

  }

  implicit class JavaGetItemRequestOps(val self: JavaGetItemRequest) extends AnyVal {

    def toScala: ScalaGetItemRequest = {
      ScalaGetItemRequest()
        .withTableName(Option(self.tableName))
        .withKey(Option(self.key).map(_.asScala.toMap.mapValues(_.toScala)))
        .withAttributesToGet(Option(self.attributesToGet).map(_.asScala))
        .withConsistentRead(Option(self.consistentRead).map(_.booleanValue()))
        .withReturnConsumedCapacity(Option(self.returnConsumedCapacity).map(_.toString))
        .withProjectionExpression(Option(self.projectionExpression))
        .withExpressionAttributeNames(
          Option(self.expressionAttributeNames).map(_.asScala.toMap)
        )
    }

  }

}
