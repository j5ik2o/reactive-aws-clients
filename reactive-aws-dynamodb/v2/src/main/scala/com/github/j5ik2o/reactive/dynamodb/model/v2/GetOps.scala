package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ Get => ScalaGet }
import software.amazon.awssdk.services.dynamodb.model.{ Get => JavaGet }

import scala.collection.JavaConverters._

object GetOps {

  import AttributeValueOps._

  implicit class ScalaGetOps(val self: ScalaGet) extends AnyVal {

    def toJava: JavaGet = {
      val result = JavaGet.builder()
      self.key.map(_.mapValues(_.toJava).asJava).foreach(result.key)
      self.tableName.foreach(result.tableName)
      self.projectionExpression.foreach(result.projectionExpression)
      self.expressionAttributeNames.map(_.asJava).foreach(result.expressionAttributeNames)
      result.build()
    }

  }

  implicit class JavaGetOps(val self: JavaGet) extends AnyVal {

    def toScala: ScalaGet = {
      ScalaGet()
        .withKey(Option(self.key).map(_.asScala.toMap.mapValues(_.toScala)))
        .withTableName(Option(self.tableName))
        .withProjectionExpression(Option(self.projectionExpression))
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map(_.asScala.toMap))
    }

  }

}
