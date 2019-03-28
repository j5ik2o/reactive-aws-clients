// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateItemRequest => ScalaUpdateItemRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ UpdateItemRequest => JavaUpdateItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateItemRequestOps {

  implicit class ScalaUpdateItemRequestOps(val self: ScalaUpdateItemRequest) extends AnyVal {

    def toJava: JavaUpdateItemRequest = {
      val result = new JavaUpdateItemRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.attributeUpdates.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueUpdateOps._;
        result.withAttributeUpdates(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValueUpdate]
      self.expected.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ExpectedAttributeValueOps._;
        result.withExpected(v.mapValues(_.toJava).asJava)
      } // Map[String, ExpectedAttributeValue]
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.withConditionalOperator(v.toJava)
      } // String
      self.returnValues.foreach { v =>
        import ReturnValueOps._; result.withReturnValues(v.toJava)
      } // String
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String
      self.returnItemCollectionMetrics.foreach { v =>
        import ReturnItemCollectionMetricsOps._; result.withReturnItemCollectionMetrics(v.toJava)
      } // String
      self.updateExpression.filter(_.nonEmpty).foreach(v => result.withUpdateExpression(v))       // String
      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.withConditionExpression(v)) // String
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
