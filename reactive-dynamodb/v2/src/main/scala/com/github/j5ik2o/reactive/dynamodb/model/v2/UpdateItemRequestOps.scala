package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  ReturnValue,
  UpdateItemRequest => ScalaUpdateItemRequest
}
import software.amazon.awssdk.services.dynamodb.model.{ UpdateItemRequest => JavaUpdateItemRequest }

import scala.collection.JavaConverters._

object UpdateItemRequestOps {

  import AttributeValueOps._
  import AttributeValueUpdateOps._
  import ExpectedAttributeValueOps._

  implicit class ScalaUpdateItemRequestOps(val self: ScalaUpdateItemRequest) extends AnyVal {

    def toJava: JavaUpdateItemRequest = {
      val result = JavaUpdateItemRequest.builder()
      self.tableName.foreach(result.tableName)
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.key)
      self.attributeUpdates.map(_.mapValues(_.toJava).asJava).foreach(result.attributeUpdates)
      self.expected.map(_.mapValues(_.toJava).asJava).foreach(result.expected)
      self.conditionalOperator.map(_.entryName).foreach(result.conditionalOperator)
      self.returnValues.map(_.entryName).foreach(result.returnValues)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.returnConsumedCapacity)
      self.updateExpression.foreach(result.updateExpression)
      self.conditionExpression.foreach(result.conditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.expressionAttributeValues)
      result.build()
    }

  }

  implicit class JavaUpdateItemRequestOps(val self: JavaUpdateItemRequest) extends AnyVal {

    def toScala: ScalaUpdateItemRequest = {
      ScalaUpdateItemRequest()
        .withTableName(Option(self.tableName))
        .withKey(Option(self.key).map(_.asScala.toMap.mapValues(_.toScala)))
        .withAttributeUpdates(Option(self.attributeUpdates).map(_.asScala.toMap.mapValues(_.toScala)))
        .withExpected(Option(self.expected).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConditionalOperator(Option(self.conditionalOperator).map(_.toString).map(ConditionalOperator.withName))
        .withReturnValues(Option(self.returnValues).map(_.toString).map(ReturnValue.withName))
        .withReturnConsumedCapacity(
          Option(self.returnConsumedCapacity).map(_.toString).map(ReturnConsumedCapacity.withName)
        )
        .withUpdateExpression(Option(self.updateExpression()))
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.expressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
    }

  }

}
