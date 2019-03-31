// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateItemRequest => ScalaUpdateItemRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateItemRequest => JavaUpdateItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateItemRequestOps {

  implicit class ScalaUpdateItemRequestOps(val self: ScalaUpdateItemRequest) extends AnyVal {

    def toJava: JavaUpdateItemRequest = {
      val result = JavaUpdateItemRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.key(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.attributeUpdates.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueUpdateOps._;
        result.attributeUpdates(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValueUpdate]
      self.expected.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ExpectedAttributeValueOps._;
        result.expected(v.mapValues(_.toJava).asJava)
      } // Map[String, ExpectedAttributeValue]
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.conditionalOperator(v.toJava)
      } // String
      self.returnValues.foreach { v =>
        import ReturnValueOps._; result.returnValues(v.toJava)
      } // String
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String
      self.returnItemCollectionMetrics.foreach { v =>
        import ReturnItemCollectionMetricsOps._; result.returnItemCollectionMetrics(v.toJava)
      } // String
      self.updateExpression.filter(_.nonEmpty).foreach(v => result.updateExpression(v))       // String
      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.conditionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.expressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]

      result.build()
    }

  }

}
