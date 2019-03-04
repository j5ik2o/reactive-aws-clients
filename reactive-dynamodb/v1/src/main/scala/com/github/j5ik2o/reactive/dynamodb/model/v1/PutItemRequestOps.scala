package com.github.j5ik2o.reactive.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ PutItemRequest => JavaPutItemRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  ReturnItemCollectionMetrics,
  ReturnValue,
  PutItemRequest => ScalaPutItemRequest
}

import scala.collection.JavaConverters._

object PutItemRequestOps {

  import AttributeValueOps._
  import ExpectedAttributeValueOps._

  implicit class ScalaPutItemRequestOps(val self: ScalaPutItemRequest) extends AnyVal {

    def toJava: JavaPutItemRequest = {
      val result = new JavaPutItemRequest()
      self.tableName.foreach(result.setTableName)
      self.item.map(_.mapValues(_.toJava).asJava).foreach(result.setItem)
      self.expected.map(_.mapValues(_.toJava).asJava).foreach(result.setExpected)
      self.returnValues.map(_.entryName).foreach(result.setReturnValues)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.setReturnConsumedCapacity)
      self.returnItemCollectionMetrics.map(_.entryName).foreach(result.setReturnItemCollectionMetrics)
      self.conditionalOperator.map(_.entryName).foreach(result.setConditionalOperator)
      self.conditionExpression.foreach(result.setConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      result
    }

  }

  implicit class JavaPutItemRequestOps(val self: JavaPutItemRequest) extends AnyVal {

    def toScala: ScalaPutItemRequest = {
      ScalaPutItemRequest()
        .withTableName(Option(self.getTableName))
        .withItem(Option(self.getItem).map(_.asScala.toMap.mapValues(_.toScala)))
        .withExpected(Option(self.getExpected).map(_.asScala.toMap.mapValues(_.toScala)))
        .withReturnValues(Option(self.getReturnValues).map(ReturnValue.withName))
        .withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity).map(ReturnConsumedCapacity.withName))
        .withReturnItemCollectionMetrics(
          Option(self.getReturnItemCollectionMetrics).map(ReturnItemCollectionMetrics.withName)
        ).withConditionalOperator(Option(self.getConditionalOperator).map(ConditionalOperator.withName))
        .withConditionExpression(Option(self.getConditionExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.getExpressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
    }

  }

}
