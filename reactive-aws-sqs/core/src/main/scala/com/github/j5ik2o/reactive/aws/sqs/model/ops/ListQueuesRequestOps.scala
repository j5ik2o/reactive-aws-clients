// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListQueuesRequestBuilderOps(val self: ListQueuesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueNamePrefixAsScala(value: Option[String]): ListQueuesRequest.Builder = {
    value.fold(self) { v => self.queueNamePrefix(v) }
  }

}

final class ListQueuesRequestOps(val self: ListQueuesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueNamePrefixAsScala: Option[String] = Option(self.queueNamePrefix)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListQueuesRequestOps {

  implicit def toListQueuesRequestBuilderOps(v: ListQueuesRequest.Builder): ListQueuesRequestBuilderOps =
    new ListQueuesRequestBuilderOps(v)

  implicit def toListQueuesRequestOps(v: ListQueuesRequest): ListQueuesRequestOps = new ListQueuesRequestOps(v)

}
