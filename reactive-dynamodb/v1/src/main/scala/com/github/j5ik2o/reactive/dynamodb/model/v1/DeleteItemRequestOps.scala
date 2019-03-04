package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DeleteItemRequest => JavaDeleteItemRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  ReturnValue,
  DeleteItemRequest => ScalaDeleteItemRequest
}

import scala.collection.JavaConverters._

object DeleteItemRequestOps {
  import AttributeValueOps._
  import ExpectedAttributeValueOps._

  implicit class ScalaDeleteItemRequestOps(val self: ScalaDeleteItemRequest) extends AnyVal {

    def toJava: JavaDeleteItemRequest = {
      val result = new JavaDeleteItemRequest()
      self.tableName.foreach(result.setTableName)
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.setKey)
      self.expected.map(_.mapValues(_.toJava).asJava).foreach(result.setExpected)
      self.conditionalOperator.map(_.entryName).foreach(result.setConditionalOperator)
      self.returnValues.map(_.entryName).foreach(result.setReturnValues)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.setReturnConsumedCapacity)
      self.returnItemCollectionMetrics.foreach(result.setReturnItemCollectionMetrics)
      self.conditionExpression.foreach(result.setConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      result
    }
  }

  implicit class JavaDeleteItemRequestOps(val self: JavaDeleteItemRequest) extends AnyVal {

    def toScala: ScalaDeleteItemRequest = {
      ScalaDeleteItemRequest()
        .withTableName(Option(self.getTableName))
        .withKey(Option(self.getKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withExpected(Option(self.getExpected).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConditionalOperator(Option(self.getConditionalOperator).map(ConditionalOperator.withName))
        .withReturnValues(Option(self.getReturnValues).map(ReturnValue.withName))
        .withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity).map(ReturnConsumedCapacity.withName))
        .withConditionExpression(Option(self.getConditionExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.getExpressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
    }

  }

}
