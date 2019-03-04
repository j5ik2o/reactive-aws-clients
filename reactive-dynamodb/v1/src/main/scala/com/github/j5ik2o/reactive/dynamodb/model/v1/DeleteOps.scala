package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ Delete => JavaDelete }
import com.github.j5ik2o.reactive.dynamodb.model.{ ReturnValuesOnConditionCheckFailure, Delete => ScalaDelete }

import scala.collection.JavaConverters._
object DeleteOps {

  import AttributeValueOps._

  implicit class ScalaDeleteOps(val self: ScalaDelete) extends AnyVal {

    def toJava: JavaDelete = {
      val result = new JavaDelete()
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.setKey)
      self.tableName.foreach(result.setTableName)
      self.conditionExpression.foreach(result.setConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      self.returnValuesOnConditionCheckFailure.map(_.entryName).foreach(result.setReturnValuesOnConditionCheckFailure)
      result
    }

  }

  implicit class JavaDeleteOps(val self: JavaDelete) extends AnyVal {

    def toScala: ScalaDelete = {
      ScalaDelete()
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
