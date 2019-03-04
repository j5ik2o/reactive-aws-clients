package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ReturnValuesOnConditionCheckFailure, Update => ScalaUpdate }
import software.amazon.awssdk.services.dynamodb.model.{ Update => JavaUpdate }

import scala.collection.JavaConverters._

object UpdateOps {

  import AttributeValueOps._

  implicit class ScalaUpdateOps(val self: ScalaUpdate) extends AnyVal {

    def toJava: JavaUpdate = {
      val result = JavaUpdate.builder()
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.key)
      self.updateExpression.foreach(result.updateExpression)
      self.tableName.foreach(result.tableName)
      self.conditionExpression.foreach(result.conditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.expressionAttributeValues)
      self.returnValuesOnConditionCheckFailure.map(_.entryName).foreach(result.returnValuesOnConditionCheckFailure)
      result.build()
    }

  }

  implicit class JavaUpdateOps(val self: JavaUpdate) extends AnyVal {

    def toScala: ScalaUpdate = {
      ScalaUpdate()
        .withKey(Option(self.key).map(_.asScala.toMap.mapValues(_.toScala)))
        .withTableName(Option(self.tableName))
        .withConditionExpression(Option(self.conditionExpression))
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.expressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
        .withReturnValuesOnConditionCheckFailure(
          Option(self.returnValuesOnConditionCheckFailure)
            .map(_.toString).map(ReturnValuesOnConditionCheckFailure.withName)
        )
    }

  }

}
