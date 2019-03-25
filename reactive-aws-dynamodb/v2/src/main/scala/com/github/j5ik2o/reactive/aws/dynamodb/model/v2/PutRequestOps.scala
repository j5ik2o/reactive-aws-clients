package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PutRequest => ScalaPutRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ PutRequest => JavaPutRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRequestOps {

  implicit class ScalaPutRequestOps(val self: ScalaPutRequest) extends AnyVal {

    def toJava: JavaPutRequest = {
      val result = JavaPutRequest.builder()
      self.item.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.item(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]

      result.build()
    }

  }

  implicit class JavaPutRequestOps(val self: JavaPutRequest) extends AnyVal {

    def toScala: ScalaPutRequest = {
      ScalaPutRequest()
        .withItem(Option(self.item).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
    }

  }

}
