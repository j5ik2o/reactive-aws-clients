package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ Update => JavaUpdate }
import com.github.j5ik2o.reactive.dynamodb.model.{ ReturnValuesOnConditionCheckFailure, Update => ScalaUpdate }

import scala.collection.JavaConverters._

object UpdateOps {

  import AttributeValueOps._

  implicit class ScalaUpdateOps(val self: ScalaUpdate) extends AnyVal {

    def toJava: JavaUpdate = {
      val result = new JavaUpdate()
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.setKey)
      self.updateExpression.foreach(result.setUpdateExpression)
      self.tableName.foreach(result.setTableName)
      self.conditionExpression.foreach(result.setConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      self.returnValuesOnConditionCheckFailure.map(_.entryName).foreach(result.setReturnValuesOnConditionCheckFailure)
      result
    }

  }

  implicit class JavaUpdateOps(val self: JavaUpdate) extends AnyVal {

    def toScala: ScalaUpdate = {
      ScalaUpdate()
        .withKey(Option(self.getKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withTableName(Option(self.getTableName))
        .withConditionExpression(Option(self.getConditionExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.getExpressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
        .withReturnValuesOnConditionCheckFailure(
          Option(self.getReturnValuesOnConditionCheckFailure).map(ReturnValuesOnConditionCheckFailure.withName)
        )
    }

  }

}
