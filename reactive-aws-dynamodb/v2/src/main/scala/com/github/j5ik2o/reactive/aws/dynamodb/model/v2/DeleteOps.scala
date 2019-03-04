package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReturnValuesOnConditionCheckFailure, Delete => ScalaDelete }
import software.amazon.awssdk.services.dynamodb.model.{ Delete => JavaDelete }

import scala.collection.JavaConverters._
object DeleteOps {

  import AttributeValueOps._

  implicit class ScalaDeleteOps(val self: ScalaDelete) extends AnyVal {

    def toJava: JavaDelete = {
      val result = JavaDelete.builder()
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.key)
      self.tableName.foreach(result.tableName)
      self.conditionExpression.foreach(result.conditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.expressionAttributeValues)
      self.returnValuesOnConditionCheckFailure.map(_.entryName).foreach(result.returnValuesOnConditionCheckFailure)
      result.build()
    }

  }

  implicit class JavaDeleteOps(val self: JavaDelete) extends AnyVal {

    def toScala: ScalaDelete = {
      ScalaDelete()
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
