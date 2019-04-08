// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteMessageBatchRequestBuilderOps(val self: DeleteMessageBatchRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): DeleteMessageBatchRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

  final def entriesAsScala(value: Option[Seq[DeleteMessageBatchRequestEntry]]): DeleteMessageBatchRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.entries(v.asJava)
    } // Seq[DeleteMessageBatchRequestEntry]
  }

}

final class DeleteMessageBatchRequestOps(val self: DeleteMessageBatchRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

  final def entriesAsScala: Option[Seq[DeleteMessageBatchRequestEntry]] = Option(self.entries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[DeleteMessageBatchRequestEntry]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMessageBatchRequestOps {

  implicit def toDeleteMessageBatchRequestBuilderOps(
      v: DeleteMessageBatchRequest.Builder
  ): DeleteMessageBatchRequestBuilderOps = new DeleteMessageBatchRequestBuilderOps(v)

  implicit def toDeleteMessageBatchRequestOps(v: DeleteMessageBatchRequest): DeleteMessageBatchRequestOps =
    new DeleteMessageBatchRequestOps(v)

}
