// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetItemRequest => ScalaGetItemRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ GetItemRequest => JavaGetItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetItemRequestOps {

  implicit class ScalaGetItemRequestOps(val self: ScalaGetItemRequest) extends AnyVal {

    def toJava: JavaGetItemRequest = {
      val result = new JavaGetItemRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.attributesToGet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withAttributesToGet(v.asJava)
      } // Seq[String]
      self.consistentRead.map(_.booleanValue).foreach(v => result.withConsistentRead(v)) // Boolean
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.withProjectionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withExpressionAttributeNames(v.asJava)
      } // Map[String, String]

      result
    }

  }

}
