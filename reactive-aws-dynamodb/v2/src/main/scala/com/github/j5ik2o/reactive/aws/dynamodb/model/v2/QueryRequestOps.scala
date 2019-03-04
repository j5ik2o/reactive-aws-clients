package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  Select,
  QueryRequest => ScalaQueryRequest
}
import software.amazon.awssdk.services.dynamodb.model.{ QueryRequest => JavaQueryRequest }

import scala.collection.JavaConverters._

object QueryRequestOps {

  import AttributeValueOps._
  import ConditionOps._

  implicit class ScalaQueryRequestOps(val self: ScalaQueryRequest) extends AnyVal {

    def toJava: JavaQueryRequest = {
      val result = JavaQueryRequest.builder()
      self.tableName.foreach(result.tableName)
      self.indexName.foreach(result.indexName)
      self.select.map(_.entryName).foreach(result.select)
      self.attributesToGet.map(_.asJava).foreach(result.attributesToGet)
      self.limit.foreach(v => result.limit(v))
      self.consistentRead.foreach(v => result.consistentRead(v))
      self.keyConditions.map(_.mapValues(_.toJava).asJava).foreach(result.keyConditions)
      self.queryFilter.map(_.mapValues(_.toJava).asJava).foreach(result.queryFilter)
      self.conditionalOperator.map(_.entryName).foreach(result.conditionalOperator)
      self.scanIndexForward.foreach(v => result.scanIndexForward(v))
      self.exclusiveStartKey.map(_.mapValues(_.toJava).asJava).foreach(result.exclusiveStartKey)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.returnConsumedCapacity)
      self.projectionExpression.foreach(result.projectionExpression)
      self.filterExpression.foreach(result.filterExpression)
      self.keyConditionExpression.foreach(result.keyConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.expressionAttributeValues)
      result.build()
    }

  }

  implicit class JavaQueryRequestOps(val self: JavaQueryRequest) extends AnyVal {

    def toScala: ScalaQueryRequest = {
      ScalaQueryRequest()
        .withTableName(Option(self.tableName))
        .withIndexName(Option(self.indexName))
        .withSelect(Option(self.select).map(_.toString).map(Select.withName))
        .withAttributesToGet(Option(self.attributesToGet).map(_.asScala))
        .withLimit(Option(self.limit))
        .withConsistentRead(Option(self.consistentRead))
        .withKeyConditions(Option(self.keyConditions).map(_.asScala.toMap.mapValues(_.toScala)))
        .withQueryFilter(Option(self.queryFilter).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConditionalOperator(Option(self.conditionalOperator).map(_.toString).map(ConditionalOperator.withName))
        .withScanIndexForward(Option(self.scanIndexForward))
        .withExclusiveStartKey(Option(self.exclusiveStartKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withReturnConsumedCapacity(
          Option(self.returnConsumedCapacity).map(_.toString).map(ReturnConsumedCapacity.withName)
        )
        .withProjectionExpression(Option(self.projectionExpression))
        .withFilterExpression(Option(self.filterExpression))
        .withKeyConditionExpression(Option(self.keyConditionExpression))
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.expressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
    }

  }

}
