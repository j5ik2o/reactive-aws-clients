// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class PurgeQueueRequestBuilderOps(val self: PurgeQueueRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): PurgeQueueRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

}

final class PurgeQueueRequestOps(val self: PurgeQueueRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurgeQueueRequestOps {

  implicit def toPurgeQueueRequestBuilderOps(v: PurgeQueueRequest.Builder): PurgeQueueRequestBuilderOps =
    new PurgeQueueRequestBuilderOps(v)

  implicit def toPurgeQueueRequestOps(v: PurgeQueueRequest): PurgeQueueRequestOps = new PurgeQueueRequestOps(v)

}
