package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ ScanRequest => JavaScanRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  Select,
  ScanRequest => ScalaScanRequest
}

import scala.collection.JavaConverters._

object ScanRequestOps {

  import AttributeValueOps._
  import ConditionOps._

  implicit class ScalaScanRequestOps(val self: ScalaScanRequest) extends AnyVal {

    def toJava: JavaScanRequest = {
      val result = new JavaScanRequest
      self.tableName.foreach(result.setTableName)
      self.indexName.foreach(result.setIndexName)
      self.attributesToGet.map(_.asJava).foreach(result.setAttributesToGet)
      self.limit.foreach(v => result.setLimit(v))
      self.select.map(_.entryName).foreach(result.setSelect)
      self.scanFilter.map(_.mapValues(_.toJava).asJava).foreach(result.setScanFilter)
      self.conditionalOperator.map(_.entryName).foreach(result.setConditionalOperator)
      self.exclusiveStartKey.map(_.mapValues(_.toJava).asJava).foreach(result.setExclusiveStartKey)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.setReturnConsumedCapacity)
      self.totalSegments.foreach(v => result.setTotalSegments(v))
      self.segment.foreach(v => result.setSegment(v))
      self.projectionExpression.foreach(result.setProjectionExpression)
      self.filterExpression.foreach(result.setFilterExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      self.consistentRead.foreach(v => result.setConsistentRead(v))
      result
    }

  }

  implicit class JavaScanRequestOps(val self: JavaScanRequest) extends AnyVal {

    def toScala: ScalaScanRequest = {
      ScalaScanRequest()
        .withTableName(Option(self.getTableName))
        .withIndexName(Option(self.getIndexName))
        .withAttributesToGet(Option(self.getAttributesToGet).map(_.asScala))
        .withLimit(Option(self.getLimit))
        .withSelect(Option(self.getSelect).map(Select.withName))
        .withScanFilter(Option(self.getScanFilter).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConditionalOperator(Option(self.getConditionalOperator).map(ConditionalOperator.withName))
        .withExclusiveStartKey(Option(self.getExclusiveStartKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity).map(ReturnConsumedCapacity.withName))
        .withTotalSegments(Option(self.getTotalSegments))
        .withSegment(Option(self.getSegment))
        .withProjectionExpression(Option(self.getProjectionExpression))
        .withFilterExpression(Option(self.getFilterExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.getExpressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
        .withConsistentRead(Option(self.getConsistentRead))
    }

  }

}
