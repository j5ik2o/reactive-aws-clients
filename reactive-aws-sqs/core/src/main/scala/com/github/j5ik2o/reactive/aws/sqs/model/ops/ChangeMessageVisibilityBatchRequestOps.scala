// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ChangeMessageVisibilityBatchRequestBuilderOps(val self: ChangeMessageVisibilityBatchRequest.Builder)
    extends AnyVal {

  final def withQueueUrlAsScala(value: Option[String]): ChangeMessageVisibilityBatchRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

  final def withEntriesAsScala(
      value: Option[Seq[ChangeMessageVisibilityBatchRequestEntry]]
  ): ChangeMessageVisibilityBatchRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.entries(v.asJava)
    } // Seq[ChangeMessageVisibilityBatchRequestEntry]
  }

}

final class ChangeMessageVisibilityBatchRequestOps(val self: ChangeMessageVisibilityBatchRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

  final def entriesAsScala: Option[Seq[ChangeMessageVisibilityBatchRequestEntry]] = Option(self.entries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ChangeMessageVisibilityBatchRequestEntry]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeMessageVisibilityBatchRequestOps {

  implicit def toChangeMessageVisibilityBatchRequestBuilderOps(
      v: ChangeMessageVisibilityBatchRequest.Builder
  ): ChangeMessageVisibilityBatchRequestBuilderOps = new ChangeMessageVisibilityBatchRequestBuilderOps(v)

  implicit def toChangeMessageVisibilityBatchRequestOps(
      v: ChangeMessageVisibilityBatchRequest
  ): ChangeMessageVisibilityBatchRequestOps = new ChangeMessageVisibilityBatchRequestOps(v)

}
