package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ConditionCheck => JavaConditionCheck }
import com.github.j5ik2o.reactive.dynamodb.model.{
  ReturnValuesOnConditionCheckFailure,
  ConditionCheck => ScalaConditionCheck
}

import scala.collection.JavaConverters._

object ConditionCheckOps {

  import AttributeValueOps._

  implicit class ScalaConditionCheckOps(val self: ScalaConditionCheck) extends AnyVal {

    def toJava: JavaConditionCheck = {
      val result = new JavaConditionCheck()
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.setKey)
      self.tableName.foreach(result.setTableName)
      self.conditionExpression.foreach(result.setConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      self.returnValuesOnConditionCheckFailure.map(_.entryName).foreach(result.setReturnValuesOnConditionCheckFailure)
      result
    }

  }

  implicit class JavaConditionCheckOps(val self: JavaConditionCheck) extends AnyVal {

    def toScala: ScalaConditionCheck = {
      ScalaConditionCheck()
        .withKey(Option(self.getKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withTableName(Option(self.getTableName))
        .withConditionExpression(Option(self.getConditionExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
        .withExpressionAttributeValues(
          Option(self.getExpressionAttributeValues).map(_.asScala.toMap.mapValues(_.toScala))
        )
        .withReturnValuesOnConditionCheckFailure(
          Option(self.getReturnValuesOnConditionCheckFailure)
            .map(ReturnValuesOnConditionCheckFailure.withName)
        )
    }

  }

}
