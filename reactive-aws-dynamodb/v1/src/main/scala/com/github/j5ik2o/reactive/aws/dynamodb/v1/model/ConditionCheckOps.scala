// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ConditionCheck => ScalaConditionCheck, _ }
import com.amazonaws.services.dynamodbv2.model.{ ConditionCheck => JavaConditionCheck }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConditionCheckOps {

  implicit class ScalaConditionCheckOps(val self: ScalaConditionCheck) extends AnyVal {

    def toJava: JavaConditionCheck = {
      val result = new JavaConditionCheck()
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
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

  implicit class JavaConditionCheckOps(val self: JavaConditionCheck) extends AnyVal {

    def toScala: ScalaConditionCheck = {
      ScalaConditionCheck()
        .withKey(Option(self.getKey).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
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
