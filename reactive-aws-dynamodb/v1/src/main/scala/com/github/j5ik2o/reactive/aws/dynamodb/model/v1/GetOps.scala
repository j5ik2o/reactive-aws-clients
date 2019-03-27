// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Get => ScalaGet, _ }
import com.amazonaws.services.dynamodbv2.model.{ Get => JavaGet }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetOps {

  implicit class ScalaGetOps(val self: ScalaGet) extends AnyVal {

    def toJava: JavaGet = {
      val result = new JavaGet()
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))                       // String
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.withProjectionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withExpressionAttributeNames(v.asJava)
      } // Map[String, String]

      result
    }

  }

  implicit class JavaGetOps(val self: JavaGet) extends AnyVal {

    def toScala: ScalaGet = {
      ScalaGet()
        .withKey(Option(self.getKey).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withTableName(Option(self.getTableName)) // String
        .withProjectionExpression(Option(self.getProjectionExpression)) // String
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
    }

  }

}
