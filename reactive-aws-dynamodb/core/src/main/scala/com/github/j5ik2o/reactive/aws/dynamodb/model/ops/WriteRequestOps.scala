// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class WriteRequestBuilderOps(val self: WriteRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def putRequestAsScala(value: Option[PutRequest]): WriteRequest.Builder = {
    value.fold(self) { v => self.putRequest(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteRequestAsScala(value: Option[DeleteRequest]): WriteRequest.Builder = {
    value.fold(self) { v => self.deleteRequest(v) }
  }

}

final class WriteRequestOps(val self: WriteRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def putRequestAsScala: Option[PutRequest] = Option(self.putRequest)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteRequestAsScala: Option[DeleteRequest] = Option(self.deleteRequest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToWriteRequestOps {

  implicit def toWriteRequestBuilderOps(v: WriteRequest.Builder): WriteRequestBuilderOps = new WriteRequestBuilderOps(v)

  implicit def toWriteRequestOps(v: WriteRequest): WriteRequestOps = new WriteRequestOps(v)

}
