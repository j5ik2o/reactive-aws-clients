package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  ReturnItemCollectionMetrics,
  ReturnValue,
  PutItemRequest => ScalaPutItemRequest
}
import software.amazon.awssdk.services.dynamodb.model.{ PutItemRequest => JavaPutItemRequest }

import scala.collection.JavaConverters._

object PutItemRequestOps {

  import AttributeValueOps._
  import ExpectedAttributeValueOps._

  implicit class ScalaPutItemRequestOps(val self: ScalaPutItemRequest) extends AnyVal {

    def toJava: JavaPutItemRequest = {
      val builder = JavaPutItemRequest.builder()
      self.tableName.foreach(builder.tableName)
      self.item.map(_.mapValues(_.toJava).asJava).foreach(builder.item)
      self.expected.map(_.mapValues(_.toJava).asJava).foreach(builder.expected)
      self.returnValues.map(_.entryName).foreach(builder.returnValues)
      self.returnConsumedCapacity.map(_.entryName).foreach(builder.returnConsumedCapacity)
      self.returnItemCollectionMetrics.map(_.entryName).foreach(builder.returnItemCollectionMetrics)
      self.conditionalOperator.map(_.entryName).foreach(builder.conditionalOperator)
      self.conditionExpression.foreach(builder.conditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(builder.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(builder.expressionAttributeValues)
      builder.build()
    }

  }

  implicit class JavaPutItemRequestOps(val self: JavaPutItemRequest) extends AnyVal {

    def toScala: ScalaPutItemRequest = {
      ScalaPutItemRequest()
        .withTableName(Option(self.tableName))
        .withItem(Option(self.item).map(_.asScala.toMap.mapValues(_.toScala)))
        .withExpected(Option(self.expected).map(_.asScala.toMap.mapValues(_.toScala)))
        .withReturnValues(Option(self.returnValues).map(_.toString).map(ReturnValue.withName))
        .withReturnConsumedCapacity(
          Option(self.returnConsumedCapacity).map(_.toString).map(ReturnConsumedCapacity.withName)
        )
        .withReturnItemCollectionMetrics(
          Option(self.returnItemCollectionMetrics).map(_.toString).map(ReturnItemCollectionMetrics.withName)
        ).withConditionalOperator(Option(self.conditionalOperator).map(_.toString).map(ConditionalOperator.withName))
        .withConditionExpression(Option(self.conditionExpression))
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.expressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
    }

  }

}
