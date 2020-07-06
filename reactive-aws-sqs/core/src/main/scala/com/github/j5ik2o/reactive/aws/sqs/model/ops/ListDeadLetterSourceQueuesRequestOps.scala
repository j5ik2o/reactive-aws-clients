// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListDeadLetterSourceQueuesRequestBuilderOps(val self: ListDeadLetterSourceQueuesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): ListDeadLetterSourceQueuesRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListDeadLetterSourceQueuesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListDeadLetterSourceQueuesRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class ListDeadLetterSourceQueuesRequestOps(val self: ListDeadLetterSourceQueuesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

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
