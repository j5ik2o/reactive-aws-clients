package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PutRequest => ScalaPutRequest }
import software.amazon.awssdk.services.dynamodb.model.{ PutRequest => JavaPutRequest }

import scala.collection.JavaConverters._

object PutRequestOps {
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeValueOps._

  implicit class ScalaPutRequestOps(val self: ScalaPutRequest) extends AnyVal {

    def toJava: JavaPutRequest = {
      val result = JavaPutRequest.builder()
      self.item.foreach(v => result.item(v.mapValues(_.toJava).asJava))
      result.build()
    }

  }

  implicit class JavaPutRequestOps(val self: JavaPutRequest) extends AnyVal {

    def toScala: ScalaPutRequest = {
      ScalaPutRequest().withItem(Option(self.item().asScala.toMap.mapValues(_.toScala)))
    }

  }
}
