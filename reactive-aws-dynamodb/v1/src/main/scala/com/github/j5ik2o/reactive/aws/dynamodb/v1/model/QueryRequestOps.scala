// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ QueryRequest => ScalaQueryRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ QueryRequest => JavaQueryRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object QueryRequestOps {

  implicit class ScalaQueryRequestOps(val self: ScalaQueryRequest) extends AnyVal {

    def toJava: JavaQueryRequest = {
      val result = new JavaQueryRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.select.foreach { v =>
        import SelectOps._; result.withSelect(v.toJava)
      } // String
      self.attributesToGet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withAttributesToGet(v.asJava)
      } // Seq[String]
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                       // Int
      self.consistentRead.map(_.booleanValue).foreach(v => result.withConsistentRead(v)) // Boolean
      self.keyConditions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ConditionOps._; result.withKeyConditions(v.mapValues(_.toJava).asJava)
      } // Map[String, Condition]
      self.queryFilter.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ConditionOps._; result.withQueryFilter(v.mapValues(_.toJava).asJava)
      } // Map[String, Condition]
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.withConditionalOperator(v.toJava)
      } // String
      self.scanIndexForward.map(_.booleanValue).foreach(v => result.withScanIndexForward(v)) // Boolean
      self.exclusiveStartKey.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withExclusiveStartKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.withProjectionExpression(v))     // String
      self.filterExpression.filter(_.nonEmpty).foreach(v => result.withFilterExpression(v))             // String
      self.keyConditionExpression.filter(_.nonEmpty).foreach(v => result.withKeyConditionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withExpressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withExpressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]

      result
    }

  }

}
