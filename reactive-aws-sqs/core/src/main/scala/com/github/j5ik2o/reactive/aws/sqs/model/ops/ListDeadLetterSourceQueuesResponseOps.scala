// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListDeadLetterSourceQueuesResponseBuilderOps(val self: ListDeadLetterSourceQueuesResponse.Builder)
    extends AnyVal {

  final def queueUrlsAsScala(value: Option[Seq[String]]): ListDeadLetterSourceQueuesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.queueUrls(v.asJava)
    }
  }

}

final class ListDeadLetterSourceQueuesResponseOps(val self: ListDeadLetterSourceQueuesResponse) extends AnyVal {

  final def queueUrlsAsScala: Option[Seq[String]] = Option(self.queueUrls).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDeadLetterSourceQueuesResponseOps {

  implicit def toListDeadLetterSourceQueuesResponseBuilderOps(
      v: ListDeadLetterSourceQueuesResponse.Builder
  ): ListDeadLetterSourceQueuesResponseBuilderOps = new ListDeadLetterSourceQueuesResponseBuilderOps(v)

  implicit def toListDeadLetterSourceQueuesResponseOps(
      v: ListDeadLetterSourceQueuesResponse
  ): ListDeadLetterSourceQueuesResponseOps = new ListDeadLetterSourceQueuesResponseOps(v)

}
