package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ConditionalOperator,
  ReturnConsumedCapacity,
  Select,
  ScanRequest => ScalaScanRequest
}
import software.amazon.awssdk.services.dynamodb.model.{ ScanRequest => JavaScanRequest }

import scala.collection.JavaConverters._

object ScanRequestOps {

  import AttributeValueOps._
  import ConditionOps._

  implicit class ScalaScanRequestOps(val self: ScalaScanRequest) extends AnyVal {

    def toJava: JavaScanRequest = {
      val result = JavaScanRequest.builder()
      self.tableName.foreach(result.tableName)
      self.indexName.foreach(result.indexName)
      self.attributesToGet.map(_.asJava).foreach(result.attributesToGet)
      self.limit.foreach(v => result.limit(v))
      self.select.map(_.entryName).foreach(result.select)
      self.scanFilter.map(_.mapValues(_.toJava).asJava).foreach(result.scanFilter)
      self.conditionalOperator.map(_.entryName).foreach(result.conditionalOperator)
      self.exclusiveStartKey.map(_.mapValues(_.toJava).asJava).foreach(result.exclusiveStartKey)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.returnConsumedCapacity)
      self.totalSegments.foreach(v => result.totalSegments(v))
      self.segment.foreach(v => result.segment(v))
      self.projectionExpression.foreach(result.projectionExpression)
      self.filterExpression.foreach(result.filterExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.expressionAttributeValues)
      self.consistentRead.foreach(v => result.consistentRead(v))
      result.build()
    }

  }

  implicit class JavaScanRequestOps(val self: JavaScanRequest) extends AnyVal {

    def toScala: ScalaScanRequest = {
      ScalaScanRequest()
        .withTableName(Option(self.tableName))
        .withIndexName(Option(self.indexName))
        .withAttributesToGet(Option(self.attributesToGet).map(_.asScala))
        .withLimit(Option(self.limit))
        .withSelect(Option(self.select).map(_.toString).map(Select.withName))
        .withScanFilter(Option(self.scanFilter).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConditionalOperator(Option(self.conditionalOperator).map(_.toString).map(ConditionalOperator.withName))
        .withExclusiveStartKey(Option(self.exclusiveStartKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withReturnConsumedCapacity(
          Option(self.returnConsumedCapacity).map(_.toString).map(ReturnConsumedCapacity.withName)
        )
        .withTotalSegments(Option(self.totalSegments))
        .withSegment(Option(self.segment))
        .withProjectionExpression(Option(self.projectionExpression))
        .withFilterExpression(Option(self.filterExpression))
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.expressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
        .withConsistentRead(Option(self.consistentRead).map(_.booleanValue()))
    }

  }

}
