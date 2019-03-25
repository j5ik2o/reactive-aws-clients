package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Update => ScalaUpdate, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Update => JavaUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateOps {

  implicit class ScalaUpdateOps(val self: ScalaUpdate) extends AnyVal {

    def toJava: JavaUpdate = {
      val result = JavaUpdate.builder()
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.key(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.updateExpression.filter(_.nonEmpty).foreach(v => result.updateExpression(v))       // String
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))                     // String
      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.conditionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.expressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.returnValuesOnConditionCheckFailure.foreach { v =>
        import ReturnValuesOnConditionCheckFailureOps._; result.returnValuesOnConditionCheckFailure(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaUpdateOps(val self: JavaUpdate) extends AnyVal {

    def toScala: ScalaUpdate = {
      ScalaUpdate()
        .withKey(Option(self.key).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withUpdateExpression(Option(self.updateExpression)) // String
        .withTableName(Option(self.tableName)) // String
        .withConditionExpression(Option(self.conditionExpression)) // String
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
        .withExpressionAttributeValues(Option(self.expressionAttributeValues).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withReturnValuesOnConditionCheckFailure(Option(self.returnValuesOnConditionCheckFailure).map { v =>
          import ReturnValuesOnConditionCheckFailureOps._; v.toScala
        }) // String
    }

  }

}
