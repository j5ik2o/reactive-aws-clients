package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReturnValuesOnConditionCheckFailure,
  ConditionCheck => ScalaConditionCheck
}
import software.amazon.awssdk.services.dynamodb.model.{ ConditionCheck => JavaConditionCheck }

import scala.collection.JavaConverters._

object ConditionCheckOps {

  import AttributeValueOps._

  implicit class ScalaConditionCheckOps(val self: ScalaConditionCheck) extends AnyVal {

    def toJava: JavaConditionCheck = {
      val result = JavaConditionCheck.builder()
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.key)
      self.tableName.foreach(result.tableName)
      self.conditionExpression.foreach(result.conditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.expressionAttributeValues)
      self.returnValuesOnConditionCheckFailure.map(_.entryName).foreach(result.returnValuesOnConditionCheckFailure)
      result.build()
    }

  }

  implicit class JavaConditionCheckOps(val self: JavaConditionCheck) extends AnyVal {

    def toScala: ScalaConditionCheck = {
      ScalaConditionCheck()
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
