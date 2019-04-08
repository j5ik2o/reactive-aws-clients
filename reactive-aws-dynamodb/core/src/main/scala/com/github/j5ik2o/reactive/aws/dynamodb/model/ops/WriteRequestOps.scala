// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class WriteRequestBuilderOps(val self: WriteRequest.Builder) extends AnyVal {

  final def putRequestAsScala(value: Option[PutRequest]): WriteRequest.Builder = {
    value.fold(self) { v =>
      self.putRequest(v)
    }
  } // PutRequest

  final def deleteRequestAsScala(value: Option[DeleteRequest]): WriteRequest.Builder = {
    value.fold(self) { v =>
      self.deleteRequest(v)
    }
  } // DeleteRequest

}

final class WriteRequestOps(val self: WriteRequest) extends AnyVal {

  final def putRequestAsScala: Option[PutRequest] = Option(self.putRequest) // PutRequest

  final def deleteRequestAsScala: Option[DeleteRequest] = Option(self.deleteRequest) // DeleteRequest

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToWriteRequestOps {

  implicit def toWriteRequestBuilderOps(v: WriteRequest.Builder): WriteRequestBuilderOps = new WriteRequestBuilderOps(v)

  implicit def toWriteRequestOps(v: WriteRequest): WriteRequestOps = new WriteRequestOps(v)

}
