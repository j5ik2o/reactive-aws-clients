package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ PutRequest => JavaPutRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PutRequest => ScalaPutRequest }

import scala.collection.JavaConverters._

object PutRequestOps {

  import AttributeValueOps._

  implicit class ScalaPutRequestOps(val self: ScalaPutRequest) extends AnyVal {

    def toJava: JavaPutRequest = {
      val result = new JavaPutRequest()
      self.item.foreach(v => result.setItem(v.mapValues(_.toJava).asJava))
      result
    }

  }

  implicit class JavaPutRequestOps(val self: JavaPutRequest) extends AnyVal {

    def toScala: ScalaPutRequest = {
      ScalaPutRequest().withItem(Option(self.getItem).map(_.asScala.toMap.mapValues(_.toScala)))
    }

  }

}
