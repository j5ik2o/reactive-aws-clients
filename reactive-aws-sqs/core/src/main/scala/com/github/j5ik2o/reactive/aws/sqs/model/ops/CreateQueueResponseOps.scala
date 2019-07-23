// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class CreateQueueResponseBuilderOps(val self: CreateQueueResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): CreateQueueResponse.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

}

final class CreateQueueResponseOps(val self: CreateQueueResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateQueueResponseOps {

  implicit def toCreateQueueResponseBuilderOps(v: CreateQueueResponse.Builder): CreateQueueResponseBuilderOps =
    new CreateQueueResponseBuilderOps(v)

  implicit def toCreateQueueResponseOps(v: CreateQueueResponse): CreateQueueResponseOps = new CreateQueueResponseOps(v)

}
