// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ WriteRequest => ScalaWriteRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ WriteRequest => JavaWriteRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object WriteRequestOps {

  implicit class ScalaWriteRequestOps(val self: ScalaWriteRequest) extends AnyVal {

    def toJava: JavaWriteRequest = {
      val result = new JavaWriteRequest()
      self.putRequest.foreach { v =>
        import PutRequestOps._; result.withPutRequest(v.toJava)
      } // PutRequest
      self.deleteRequest.foreach { v =>
        import DeleteRequestOps._; result.withDeleteRequest(v.toJava)
      } // DeleteRequest

      result
    }

  }

  implicit class JavaWriteRequestOps(val self: JavaWriteRequest) extends AnyVal {

    def toScala: ScalaWriteRequest = {
      ScalaWriteRequest()
        .withPutRequest(Option(self.getPutRequest).map { v =>
          import PutRequestOps._; v.toScala
        }) // PutRequest
        .withDeleteRequest(Option(self.getDeleteRequest).map { v =>
          import DeleteRequestOps._; v.toScala
        }) // DeleteRequest
    }

  }

}
