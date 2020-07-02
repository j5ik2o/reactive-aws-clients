// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class TagQueueRequestBuilderOps(val self: TagQueueRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): TagQueueRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): TagQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TagQueueRequestOps(val self: TagQueueRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagQueueRequestOps {

  implicit def toTagQueueRequestBuilderOps(v: TagQueueRequest.Builder): TagQueueRequestBuilderOps =
    new TagQueueRequestBuilderOps(v)

  implicit def toTagQueueRequestOps(v: TagQueueRequest): TagQueueRequestOps = new TagQueueRequestOps(v)

}
