package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Get => ScalaGet, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Get => JavaGet }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetOps {

  implicit class ScalaGetOps(val self: ScalaGet) extends AnyVal {

    def toJava: JavaGet = {
      val result = JavaGet.builder()
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.key(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))                       // String, case String
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.projectionExpression(v)) // String, case String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava)
      } // Map[String, String]

      result.build()
    }

  }

  implicit class JavaGetOps(val self: JavaGet) extends AnyVal {

    def toScala: ScalaGet = {
      ScalaGet()
        .withKey(Option(self.key).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withTableName(Option(self.tableName)) // String
        .withProjectionExpression(Option(self.projectionExpression)) // String
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
    }

  }

}
