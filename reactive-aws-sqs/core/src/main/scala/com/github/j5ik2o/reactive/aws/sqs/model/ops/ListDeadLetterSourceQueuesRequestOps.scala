// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListDeadLetterSourceQueuesRequestBuilderOps(val self: ListDeadLetterSourceQueuesRequest.Builder)
    extends AnyVal {

  final def withQueueUrlAsScala(value: Option[String]): ListDeadLetterSourceQueuesRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

}

final class ListDeadLetterSourceQueuesRequestOps(val self: ListDeadLetterSourceQueuesRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDeadLetterSourceQueuesRequestOps {

  implicit def toListDeadLetterSourceQueuesRequestBuilderOps(
      v: ListDeadLetterSourceQueuesRequest.Builder
  ): ListDeadLetterSourceQueuesRequestBuilderOps = new ListDeadLetterSourceQueuesRequestBuilderOps(v)

  implicit def toListDeadLetterSourceQueuesRequestOps(
      v: ListDeadLetterSourceQueuesRequest
  ): ListDeadLetterSourceQueuesRequestOps = new ListDeadLetterSourceQueuesRequestOps(v)

}
