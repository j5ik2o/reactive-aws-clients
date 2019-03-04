package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  ReturnValue,
  DeleteItemRequest => ScalaDeleteItemRequest
}
import software.amazon.awssdk.services.dynamodb.model.{ DeleteItemRequest => JavaDeleteItemRequest }

import scala.collection.JavaConverters._

object DeleteItemRequestOps {
  import AttributeValueOps._
  import ExpectedAttributeValueOps._

  implicit class ScalaDeleteItemRequestOps(val self: ScalaDeleteItemRequest) extends AnyVal {

    def toJava: JavaDeleteItemRequest = {
      val result = JavaDeleteItemRequest.builder()
      self.tableName.foreach(result.tableName)
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.key)
      self.expected.map(_.mapValues(_.toJava).asJava).foreach(result.expected)
      self.conditionalOperator.map(_.entryName).foreach(result.conditionalOperator)
      self.returnValues.map(_.entryName).foreach(result.returnValues)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.returnConsumedCapacity)
      self.returnItemCollectionMetrics.foreach(result.returnItemCollectionMetrics)
      self.conditionExpression.foreach(result.conditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.expressionAttributeValues)
      result.build()
    }
  }

  implicit class JavaDeleteItemRequestOps(val self: JavaDeleteItemRequest) extends AnyVal {

    def toScala: ScalaDeleteItemRequest = {
      ScalaDeleteItemRequest()
        .withTableName(Option(self.tableName))
        .withKey(Option(self.key).map(_.asScala.toMap.mapValues(_.toScala)))
        .withExpected(Option(self.expected).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConditionalOperator(Option(self.conditionalOperator).map(_.toString).map(ConditionalOperator.withName))
        .withReturnValues(Option(self.returnValues).map(_.toString).map(ReturnValue.withName))
        .withReturnConsumedCapacity(
          Option(self.returnConsumedCapacity).map(_.toString).map(ReturnConsumedCapacity.withName)
        )
        .withConditionExpression(Option(self.conditionExpression))
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.expressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
    }

  }

}
