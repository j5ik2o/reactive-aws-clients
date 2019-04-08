// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class TagQueueRequestBuilderOps(val self: TagQueueRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): TagQueueRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

  final def tagsAsScala(value: Option[Map[String, String]]): TagQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Map[String, String]
  }

}

final class TagQueueRequestOps(val self: TagQueueRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagQueueRequestOps {

  implicit def toTagQueueRequestBuilderOps(v: TagQueueRequest.Builder): TagQueueRequestBuilderOps =
    new TagQueueRequestBuilderOps(v)

  implicit def toTagQueueRequestOps(v: TagQueueRequest): TagQueueRequestOps = new TagQueueRequestOps(v)

}
