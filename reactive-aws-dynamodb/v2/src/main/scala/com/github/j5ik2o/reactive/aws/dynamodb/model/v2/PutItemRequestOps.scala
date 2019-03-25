package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PutItemRequest => ScalaPutItemRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ PutItemRequest => JavaPutItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutItemRequestOps {

  implicit class ScalaPutItemRequestOps(val self: ScalaPutItemRequest) extends AnyVal {

    def toJava: JavaPutItemRequest = {
      val result = JavaPutItemRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String
      self.item.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.item(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue], case Map[_], UserDefined
      self.expected.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.expected(v.mapValues(_.toJava).asJava)
      } // Map[String, ExpectedAttributeValue], case Map[_], UserDefined
      self.returnValues.foreach { v =>
        import ReturnValueOps._; result.returnValues(v.toJava)
      } // String, case Other
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String, case Other
      self.returnItemCollectionMetrics.foreach { v =>
        import ReturnItemCollectionMetricsOps._; result.returnItemCollectionMetrics(v.toJava)
      } // String, case Other
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.conditionalOperator(v.toJava)
      } // String, case Other
      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.conditionExpression(v)) // String, case String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava)
      } // Map[String, String], case Map[_]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.expressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue], case Map[_], UserDefined

      result.build()
    }

  }

}
