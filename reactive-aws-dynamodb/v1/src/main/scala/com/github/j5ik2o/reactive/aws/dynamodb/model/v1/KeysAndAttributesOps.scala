// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ KeysAndAttributes => ScalaKeysAndAttributes, _ }
import com.amazonaws.services.dynamodbv2.model.{ KeysAndAttributes => JavaKeysAndAttributes }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object KeysAndAttributesOps {

  implicit class ScalaKeysAndAttributesOps(val self: ScalaKeysAndAttributes) extends AnyVal {

    def toJava: JavaKeysAndAttributes = {
      val result = new JavaKeysAndAttributes()
      self.keys.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withKeys(v.map(_.mapValues(_.toJava).asJava).asJava)
      } // Seq[Map[String, AttributeValue]]
      self.attributesToGet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withAttributesToGet(v.asJava)
      } // Seq[String]
      self.consistentRead.map(_.booleanValue).foreach(v => result.withConsistentRead(v))            // Boolean
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.withProjectionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withExpressionAttributeNames(v.asJava)
      } // Map[String, String]

      result
    }

  }

  implicit class JavaKeysAndAttributesOps(val self: JavaKeysAndAttributes) extends AnyVal {

    def toScala: ScalaKeysAndAttributes = {
      ScalaKeysAndAttributes()
        .withKeys(Option(self.getKeys).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._;
          v.asScala.map(_.asScala.toMap.mapValues(_.toScala))
        }) // Seq[Map[String, AttributeValue]]
        .withAttributesToGet(Option(self.getAttributesToGet).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withConsistentRead(Option(self.getConsistentRead).map(_.booleanValue)) // Boolean
        .withProjectionExpression(Option(self.getProjectionExpression)) // String
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
    }

  }

}
