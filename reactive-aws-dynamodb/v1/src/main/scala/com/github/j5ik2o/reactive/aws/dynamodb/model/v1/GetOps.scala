package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ Get => JavaGet }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Get => ScalaGet }

import scala.collection.JavaConverters._

object GetOps {

  import AttributeValueOps._

  implicit class ScalaGetOps(val self: ScalaGet) extends AnyVal {

    def toJava: JavaGet = {
      val result = new JavaGet()
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.setKey)
      self.tableName.foreach(result.setTableName)
      self.projectionExpression.foreach(result.setProjectionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.setExpressionAttributeNames)
      result
    }

  }

  implicit class JavaGetOps(val self: JavaGet) extends AnyVal {

    def toScala: ScalaGet = {
      ScalaGet()
        .withKey(Option(self.getKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withTableName(Option(self.getTableName))
        .withProjectionExpression(Option(self.getProjectionExpression))
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map(_.asScala.toMap))
    }

  }

}
