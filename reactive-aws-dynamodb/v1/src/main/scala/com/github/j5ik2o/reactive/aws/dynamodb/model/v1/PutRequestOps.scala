// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PutRequest => ScalaPutRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ PutRequest => JavaPutRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRequestOps {

  implicit class ScalaPutRequestOps(val self: ScalaPutRequest) extends AnyVal {

    def toJava: JavaPutRequest = {
      val result = new JavaPutRequest()
      self.item.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withItem(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]

      result
    }

  }

  implicit class JavaPutRequestOps(val self: JavaPutRequest) extends AnyVal {

    def toScala: ScalaPutRequest = {
      ScalaPutRequest()
        .withItem(Option(self.getItem).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
    }

  }

}
