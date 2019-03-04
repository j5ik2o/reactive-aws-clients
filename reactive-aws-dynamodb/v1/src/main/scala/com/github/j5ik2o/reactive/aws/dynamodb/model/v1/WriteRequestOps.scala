package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ WriteRequest => JavaWriteRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ WriteRequest => ScalaWriteRequest }

object WriteRequestOps {

  import DeleteRequestOps._
  import PutRequestOps._

  implicit class ScalaWriteRequestOps(val self: ScalaWriteRequest) extends AnyVal {

    def toJava: JavaWriteRequest = {
      val result = new JavaWriteRequest()
      self.putRequest.foreach(v => result.setPutRequest(v.toJava))
      self.deleteRequest.foreach(v => result.setDeleteRequest(v.toJava))
      result
    }

  }

  implicit class JavaWriteRequestOps(val self: JavaWriteRequest) extends AnyVal {

    def toScala: ScalaWriteRequest = {
      ScalaWriteRequest()
        .withPutRequest(Option(self.getPutRequest.toScala))
        .withDeleteRequest(Option(self.getDeleteRequest.toScala))
    }

  }

}
