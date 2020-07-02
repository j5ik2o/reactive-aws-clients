// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListQueueTagsRequestBuilderOps(val self: ListQueueTagsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): ListQueueTagsRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

}

final class ListQueueTagsRequestOps(val self: ListQueueTagsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListQueueTagsRequestOps {

  implicit def toListQueueTagsRequestBuilderOps(v: ListQueueTagsRequest.Builder): ListQueueTagsRequestBuilderOps =
    new ListQueueTagsRequestBuilderOps(v)

  implicit def toListQueueTagsRequestOps(v: ListQueueTagsRequest): ListQueueTagsRequestOps =
    new ListQueueTagsRequestOps(v)

}
