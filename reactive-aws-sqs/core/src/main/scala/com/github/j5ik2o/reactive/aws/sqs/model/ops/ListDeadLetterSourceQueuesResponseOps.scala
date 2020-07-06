// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListDeadLetterSourceQueuesResponseBuilderOps(val self: ListDeadLetterSourceQueuesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlsAsScala(value: Option[Seq[String]]): ListDeadLetterSourceQueuesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.queueUrls(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListDeadLetterSourceQueuesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListDeadLetterSourceQueuesResponseOps(val self: ListDeadLetterSourceQueuesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlsAsScala: Option[Seq[String]] =
    Option(self.queueUrls).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

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
