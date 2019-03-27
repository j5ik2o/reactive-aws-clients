// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Update => ScalaUpdate, _ }
import com.amazonaws.services.dynamodbv2.model.{ Update => JavaUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateOps {

  implicit class ScalaUpdateOps(val self: ScalaUpdate) extends AnyVal {

    def toJava: JavaUpdate = {
      val result = new JavaUpdate()
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.updateExpression.filter(_.nonEmpty).foreach(v => result.withUpdateExpression(v))       // String
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))                     // String
      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.withConditionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withExpressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withExpressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.returnValuesOnConditionCheckFailure.foreach { v =>
        import ReturnValuesOnConditionCheckFailureOps._; result.withReturnValuesOnConditionCheckFailure(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaUpdateOps(val self: JavaUpdate) extends AnyVal {

    def toScala: ScalaUpdate = {
      ScalaUpdate()
        .withKey(Option(self.getKey).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withUpdateExpression(Option(self.getUpdateExpression)) // String
        .withTableName(Option(self.getTableName)) // String
        .withConditionExpression(Option(self.getConditionExpression)) // String
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
        .withExpressionAttributeValues(Option(self.getExpressionAttributeValues).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withReturnValuesOnConditionCheckFailure(Option(self.getReturnValuesOnConditionCheckFailure).map { v =>
          import ReturnValuesOnConditionCheckFailureOps._; v.toScala
        }) // String
    }

  }

}
