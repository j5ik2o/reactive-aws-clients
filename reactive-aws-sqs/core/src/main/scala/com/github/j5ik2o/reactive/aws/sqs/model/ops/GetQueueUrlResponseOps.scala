// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class GetQueueUrlResponseBuilderOps(val self: GetQueueUrlResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): GetQueueUrlResponse.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

}

final class GetQueueUrlResponseOps(val self: GetQueueUrlResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetQueueUrlResponseOps {

  implicit def toGetQueueUrlResponseBuilderOps(v: GetQueueUrlResponse.Builder): GetQueueUrlResponseBuilderOps =
    new GetQueueUrlResponseBuilderOps(v)

  implicit def toGetQueueUrlResponseOps(v: GetQueueUrlResponse): GetQueueUrlResponseOps = new GetQueueUrlResponseOps(v)

}
