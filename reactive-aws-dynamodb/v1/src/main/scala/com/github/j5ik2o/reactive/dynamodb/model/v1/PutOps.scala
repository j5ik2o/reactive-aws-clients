package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ Put => JavaPut }
import com.github.j5ik2o.reactive.dynamodb.model.{ ReturnValuesOnConditionCheckFailure, Put => ScalaPut }

import scala.collection.JavaConverters._

object PutOps {

  import AttributeValueOps._

  implicit class ScalaPutOps(val self: ScalaPut) extends AnyVal {

    def toJava: JavaPut = {
      val result = new JavaPut()
      self.item.map(_.mapValues(_.toJava).asJava).foreach(result.setItem)
      self.tableName.foreach(result.setTableName)
      self.conditionExpression.foreach(result.setConditionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      self.expressionAttributeValues.map(_.mapValues(_.toJava).asJava).foreach(result.setExpressionAttributeValues)
      self.returnValuesOnConditionCheckFailure.map(_.entryName).foreach(result.setReturnValuesOnConditionCheckFailure)
      result
    }

  }

  implicit class JavaPutOps(val self: JavaPut) extends AnyVal {

    def toScala: ScalaPut = {
      ScalaPut()
        .withItem(Option(self.getItem).map(_.asScala.toMap.mapValues(_.toScala)))
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
