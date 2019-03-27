// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ QueryRequest => ScalaQueryRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ QueryRequest => JavaQueryRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object QueryRequestOps {

  implicit class ScalaQueryRequestOps(val self: ScalaQueryRequest) extends AnyVal {

    def toJava: JavaQueryRequest = {
      val result = JavaQueryRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String
      self.select.foreach { v =>
        import SelectOps._; result.select(v.toJava)
      } // String
      self.attributesToGet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.attributesToGet(v.asJava)
      } // Seq[String]
      self.limit.map(_.intValue).foreach(v => result.limit(v))                       // Int
      self.consistentRead.map(_.booleanValue).foreach(v => result.consistentRead(v)) // Boolean
      self.keyConditions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ConditionOps._; result.keyConditions(v.mapValues(_.toJava).asJava)
      } // Map[String, Condition]
      self.queryFilter.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ConditionOps._; result.queryFilter(v.mapValues(_.toJava).asJava)
      } // Map[String, Condition]
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.conditionalOperator(v.toJava)
      } // String
      self.scanIndexForward.map(_.booleanValue).foreach(v => result.scanIndexForward(v)) // Boolean
      self.exclusiveStartKey.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.exclusiveStartKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.projectionExpression(v))     // String
      self.filterExpression.filter(_.nonEmpty).foreach(v => result.filterExpression(v))             // String
      self.keyConditionExpression.filter(_.nonEmpty).foreach(v => result.keyConditionExpression(v)) // String
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
