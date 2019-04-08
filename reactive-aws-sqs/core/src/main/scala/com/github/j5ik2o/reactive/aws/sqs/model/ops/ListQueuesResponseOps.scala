// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListQueuesResponseBuilderOps(val self: ListQueuesResponse.Builder) extends AnyVal {

  final def queueUrlsAsScala(value: Option[Seq[String]]): ListQueuesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.queueUrls(v.asJava)
    } // Seq[String]
  }

}

final class ListQueuesResponseOps(val self: ListQueuesResponse) extends AnyVal {

  final def queueUrlsAsScala: Option[Seq[String]] = Option(self.queueUrls).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListQueuesResponseOps {

  implicit def toListQueuesResponseBuilderOps(v: ListQueuesResponse.Builder): ListQueuesResponseBuilderOps =
    new ListQueuesResponseBuilderOps(v)

  implicit def toListQueuesResponseOps(v: ListQueuesResponse): ListQueuesResponseOps = new ListQueuesResponseOps(v)

}
