// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class UntagQueueRequestBuilderOps(val self: UntagQueueRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): UntagQueueRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

  final def tagKeysAsScala(value: Option[Seq[String]]): UntagQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagKeys(v.asJava)
    }
  }

}

final class UntagQueueRequestOps(val self: UntagQueueRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  final def tagKeysAsScala: Option[Seq[String]] = Option(self.tagKeys).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagQueueRequestOps {

  implicit def toUntagQueueRequestBuilderOps(v: UntagQueueRequest.Builder): UntagQueueRequestBuilderOps =
    new UntagQueueRequestBuilderOps(v)

  implicit def toUntagQueueRequestOps(v: UntagQueueRequest): UntagQueueRequestOps = new UntagQueueRequestOps(v)

}
