package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateItemRequest => JavaUpdateItemRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  ReturnValue,
  UpdateItemRequest => ScalaUpdateItemRequest
}

import scala.collection.JavaConverters._

object UpdateItemRequestOps {

  import AttributeValueOps._
  import AttributeValueUpdateOps._
  import ExpectedAttributeValueOps._

  implicit class ScalaUpdateItemRequestOps(val self: ScalaUpdateItemRequest) extends AnyVal {

    def toJava: JavaUpdateItemRequest = {
      val result = new JavaUpdateItemRequest()
      self.tableName.foreach(result.setTableName)
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.setKey)
      self.attributeUpdates.map(_.mapValues(_.toJava).asJava).foreach(result.setAttributeUpdates)
      self.expected.map(_.mapValues(_.toJava).asJava).foreach(result.setExpected)
      self.conditionalOperator.map(_.entryName).foreach(result.setConditionalOperator)
      self.returnValues.map(_.entryName).foreach(result.setReturnValues)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.setReturnConsumedCapacity)
      self.updateExpression.foreach(result.setUpdateExpression)
      self.conditionExpression.foreach(result.setConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      result
    }

  }

  implicit class JavaUpdateItemRequestOps(val self: JavaUpdateItemRequest) extends AnyVal {

    def toScala: ScalaUpdateItemRequest = {
      ScalaUpdateItemRequest()
        .withTableName(Option(self.getTableName))
        .withKey(Option(self.getKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withAttributeUpdates(Option(self.getAttributeUpdates).map(_.asScala.toMap.mapValues(_.toScala)))
        .withExpected(Option(self.getExpected).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConditionalOperator(Option(self.getConditionalOperator).map(ConditionalOperator.withName))
        .withReturnValues(Option(self.getReturnValues).map(ReturnValue.withName))
        .withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity).map(ReturnConsumedCapacity.withName))
        .withUpdateExpression(Option(self.getUpdateExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.getExpressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
    }

  }

}
