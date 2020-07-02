// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class GetQueueUrlRequestBuilderOps(val self: GetQueueUrlRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueNameAsScala(value: Option[String]): GetQueueUrlRequest.Builder = {
    value.fold(self) { v => self.queueName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueOwnerAWSAccountIdAsScala(value: Option[String]): GetQueueUrlRequest.Builder = {
    value.fold(self) { v => self.queueOwnerAWSAccountId(v) }
  }

}

final class GetQueueUrlRequestOps(val self: GetQueueUrlRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueNameAsScala: Option[String] = Option(self.queueName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueOwnerAWSAccountIdAsScala: Option[String] = Option(self.queueOwnerAWSAccountId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetQueueUrlRequestOps {

  implicit def toGetQueueUrlRequestBuilderOps(v: GetQueueUrlRequest.Builder): GetQueueUrlRequestBuilderOps =
    new GetQueueUrlRequestBuilderOps(v)

  implicit def toGetQueueUrlRequestOps(v: GetQueueUrlRequest): GetQueueUrlRequestOps = new GetQueueUrlRequestOps(v)

}
