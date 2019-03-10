package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ GetItemRequest => JavaGetItemRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetItemRequest => ScalaGetItemRequest }

import scala.collection.JavaConverters._

object GetItemRequestOps {

  import AttributeValueOps._

  implicit class ScalaGetItemRequestOps(val self: ScalaGetItemRequest) extends AnyVal {

    def toJava: JavaGetItemRequest = {
      val result = new JavaGetItemRequest()
      self.tableName.foreach(result.setTableName)
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.setKey)
      self.attributesToGet.map(_.asJava).foreach(result.setAttributesToGet)
      self.consistentRead.foreach(v => result.setConsistentRead(v))
      self.returnConsumedCapacity.foreach(result.setReturnConsumedCapacity)
      self.projectionExpression.foreach(result.setProjectionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      result
    }

  }

  implicit class JavaGetItemRequestOps(val self: JavaGetItemRequest) extends AnyVal {

    def toScala: ScalaGetItemRequest = {
      ScalaGetItemRequest()
        .withTableName(Option(self.getTableName))
        .withKey(Option(self.getKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withAttributesToGet(Option(self.getAttributesToGet).map(_.asScala))
        .withConsistentRead(Option(self.getConsistentRead).map(_.booleanValue()))
        .withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity))
        .withProjectionExpression(Option(self.getProjectionExpression))
        .withExpressionAttributeNames(
          Option(self.getExpressionAttributeNames).map(_.asScala.toMap)
        )
    }

  }

}
