package com.github.j5ik2o.reactive.aws.dynamodb.model.v2
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ WriteRequest => ScalaWriteRequest }
import software.amazon.awssdk.services.dynamodb.model.{ WriteRequest => JavaWriteRequest }

object WriteRequestOps {
  import DeleteRequestOps._
  import PutRequestOps._

  implicit class ScalaWriteRequestOps(val self: ScalaWriteRequest) {

    def toJava: JavaWriteRequest = {
      val result = JavaWriteRequest.builder()
      self.putRequest.foreach(v => result.putRequest(v.toJava))
      self.deleteRequest.foreach(v => result.deleteRequest(v.toJava))
      result.build()
    }

  }

  implicit class JavaWriteRequestOps(val self: JavaWriteRequest) {

    def toScala: ScalaWriteRequest = {
      ScalaWriteRequest()
        .withPutRequest(Option(self.putRequest().toScala))
        .withDeleteRequest(Option(self.deleteRequest().toScala))
    }

  }
}
