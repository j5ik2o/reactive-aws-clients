// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListQueuesResponseBuilderOps(val self: ListQueuesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlsAsScala(value: Option[Seq[String]]): ListQueuesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.queueUrls(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListQueuesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListQueuesResponseOps(val self: ListQueuesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlsAsScala: Option[Seq[String]] =
    Option(self.queueUrls).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListQueuesResponseOps {

  implicit def toListQueuesResponseBuilderOps(v: ListQueuesResponse.Builder): ListQueuesResponseBuilderOps =
    new ListQueuesResponseBuilderOps(v)

  implicit def toListQueuesResponseOps(v: ListQueuesResponse): ListQueuesResponseOps = new ListQueuesResponseOps(v)

}
