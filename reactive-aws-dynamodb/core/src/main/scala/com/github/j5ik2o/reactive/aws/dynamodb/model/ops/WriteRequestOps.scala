// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ WriteRequest => ScalaWriteRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ WriteRequest => JavaWriteRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object WriteRequestOps {

  implicit class ScalaWriteRequestOps(val self: ScalaWriteRequest) extends AnyVal {

    def toJava: JavaWriteRequest = {
      val result = JavaWriteRequest.builder()
      self.putRequest.foreach { v =>
        import PutRequestOps._; result.putRequest(v.toJava)
      } // PutRequest
      self.deleteRequest.foreach { v =>
        import DeleteRequestOps._; result.deleteRequest(v.toJava)
      } // DeleteRequest

      result.build()
    }

  }

  implicit class JavaWriteRequestOps(val self: JavaWriteRequest) extends AnyVal {

    def toScala: ScalaWriteRequest = {
      ScalaWriteRequest()
        .withPutRequest(Option(self.putRequest).map { v =>
          import PutRequestOps._; v.toScala
        }) // PutRequest
        .withDeleteRequest(Option(self.deleteRequest).map { v =>
          import DeleteRequestOps._; v.toScala
        }) // DeleteRequest
    }

  }

}
