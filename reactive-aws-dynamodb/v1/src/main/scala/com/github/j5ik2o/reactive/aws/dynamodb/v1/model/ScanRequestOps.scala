// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ScanRequest => ScalaScanRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ ScanRequest => JavaScanRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ScanRequestOps {

  implicit class ScalaScanRequestOps(val self: ScalaScanRequest) extends AnyVal {

    def toJava: JavaScanRequest = {
      val result = new JavaScanRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.attributesToGet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withAttributesToGet(v.asJava)
      } // Seq[String]
      self.limit.map(_.intValue).foreach(v => result.withLimit(v)) // Int
      self.select.foreach { v =>
        import SelectOps._; result.withSelect(v.toJava)
      } // String
      self.scanFilter.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ConditionOps._; result.withScanFilter(v.mapValues(_.toJava).asJava)
      } // Map[String, Condition]
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.withConditionalOperator(v.toJava)
      } // String
      self.exclusiveStartKey.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withExclusiveStartKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String
      self.totalSegments.map(_.intValue).foreach(v => result.withTotalSegments(v))                  // Int
      self.segment.map(_.intValue).foreach(v => result.withSegment(v))                              // Int
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.withProjectionExpression(v)) // String
      self.filterExpression.filter(_.nonEmpty).foreach(v => result.withFilterExpression(v))         // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withExpressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withExpressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.consistentRead.map(_.booleanValue).foreach(v => result.withConsistentRead(v)) // Boolean

      result
    }

  }

}
