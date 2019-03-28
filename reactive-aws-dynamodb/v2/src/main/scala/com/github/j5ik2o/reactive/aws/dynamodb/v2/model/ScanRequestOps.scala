// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ScanRequest => ScalaScanRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ScanRequest => JavaScanRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ScanRequestOps {

  implicit class ScalaScanRequestOps(val self: ScalaScanRequest) extends AnyVal {

    def toJava: JavaScanRequest = {
      val result = JavaScanRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String
      self.attributesToGet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.attributesToGet(v.asJava)
      } // Seq[String]
      self.limit.map(_.intValue).foreach(v => result.limit(v)) // Int
      self.select.foreach { v =>
        import SelectOps._; result.select(v.toJava)
      } // String
      self.scanFilter.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ConditionOps._; result.scanFilter(v.mapValues(_.toJava).asJava)
      } // Map[String, Condition]
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.conditionalOperator(v.toJava)
      } // String
      self.exclusiveStartKey.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.exclusiveStartKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String
      self.totalSegments.map(_.intValue).foreach(v => result.totalSegments(v))                  // Int
      self.segment.map(_.intValue).foreach(v => result.segment(v))                              // Int
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.projectionExpression(v)) // String
      self.filterExpression.filter(_.nonEmpty).foreach(v => result.filterExpression(v))         // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.expressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.consistentRead.map(_.booleanValue).foreach(v => result.consistentRead(v)) // Boolean

      result.build()
    }

  }

}
