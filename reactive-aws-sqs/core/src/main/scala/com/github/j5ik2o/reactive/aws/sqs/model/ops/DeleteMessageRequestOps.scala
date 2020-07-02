// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteMessageRequestBuilderOps(val self: DeleteMessageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): DeleteMessageRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala(value: Option[String]): DeleteMessageRequest.Builder = {
    value.fold(self) { v => self.receiptHandle(v) }
  }

}

final class DeleteMessageRequestOps(val self: DeleteMessageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala: Option[String] = Option(self.receiptHandle)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMessageRequestOps {

  implicit def toDeleteMessageRequestBuilderOps(v: DeleteMessageRequest.Builder): DeleteMessageRequestBuilderOps =
    new DeleteMessageRequestBuilderOps(v)

  implicit def toDeleteMessageRequestOps(v: DeleteMessageRequest): DeleteMessageRequestOps =
    new DeleteMessageRequestOps(v)

}
