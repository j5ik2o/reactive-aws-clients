package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ QueryRequest => JavaQueryRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  Select,
  QueryRequest => ScalaQueryRequest
}

import scala.collection.JavaConverters._

object QueryRequestOps {

  import AttributeValueOps._
  import ConditionOps._

  implicit class ScalaQueryRequestOps(val self: ScalaQueryRequest) extends AnyVal {

    def toJava: JavaQueryRequest = {
      val result = new JavaQueryRequest()
      self.tableName.foreach(result.setTableName)
      self.indexName.foreach(result.setIndexName)
      self.select.map(_.entryName).foreach(result.setSelect)
      self.attributesToGet.map(_.asJava).foreach(result.setAttributesToGet)
      self.limit.foreach(v => result.setLimit(v))
      self.consistentRead.foreach(v => result.setConsistentRead(v))
      self.keyConditions.map(_.mapValues(_.toJava).asJava).foreach(result.setKeyConditions)
      self.queryFilter.map(_.mapValues(_.toJava).asJava).foreach(result.setQueryFilter)
      self.conditionalOperator.map(_.entryName).foreach(result.setConditionalOperator)
      self.scanIndexForward.foreach(v => result.setScanIndexForward(v))
      self.exclusiveStartKey.map(_.mapValues(_.toJava).asJava).foreach(result.setExclusiveStartKey)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.setReturnConsumedCapacity)
      self.projectionExpression.foreach(result.setProjectionExpression)
      self.filterExpression.foreach(result.setFilterExpression)
      self.keyConditionExpression.foreach(result.setKeyConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      result
    }

  }

  implicit class JavaQueryRequestOps(val self: JavaQueryRequest) extends AnyVal {

    def toScala: ScalaQueryRequest = {
      ScalaQueryRequest()
        .withTableName(Option(self.getTableName))
        .withIndexName(Option(self.getIndexName))
        .withSelect(Option(self.getSelect).map(Select.withName))
        .withAttributesToGet(Option(self.getAttributesToGet).map(_.asScala))
        .withLimit(Option(self.getLimit))
        .withConsistentRead(Option(self.getConsistentRead))
        .withKeyConditions(Option(self.getKeyConditions).map(_.asScala.toMap.mapValues(_.toScala)))
        .withQueryFilter(Option(self.getQueryFilter).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConditionalOperator(Option(self.getConditionalOperator).map(ConditionalOperator.withName))
        .withScanIndexForward(Option(self.getScanIndexForward))
        .withExclusiveStartKey(Option(self.getExclusiveStartKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity).map(ReturnConsumedCapacity.withName))
        .withProjectionExpression(Option(self.getProjectionExpression))
        .withFilterExpression(Option(self.getFilterExpression))
        .withKeyConditionExpression(Option(self.getKeyConditionExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.getExpressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
    }

  }

}
