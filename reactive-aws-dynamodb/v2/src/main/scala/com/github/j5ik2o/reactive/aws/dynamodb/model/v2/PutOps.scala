package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReturnValuesOnConditionCheckFailure, Put => ScalaPut }
import software.amazon.awssdk.services.dynamodb.model.{ Put => JavaPut }

import scala.collection.JavaConverters._

object PutOps {

  import AttributeValueOps._

  implicit class ScalaPutOps(val self: ScalaPut) extends AnyVal {

    def toJava: JavaPut = {
      val result = JavaPut.builder()
      self.item.map(_.mapValues(_.toJava).asJava).foreach(result.item)
      self.tableName.foreach(result.tableName)
      self.conditionExpression.foreach(result.conditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.expressionAttributeValues)
      self.returnValuesOnConditionCheckFailure.map(_.entryName).foreach(result.returnValuesOnConditionCheckFailure)
      result.build()
    }

  }

  implicit class JavaPutOps(val self: JavaPut) extends AnyVal {

    def toScala: ScalaPut = {
      ScalaPut()
        .withItem(Option(self.item).map(_.asScala.toMap.mapValues(_.toScala)))
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
