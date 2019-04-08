// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackSetOperationResultsResponseBuilderOps(val self: ListStackSetOperationResultsResponse.Builder)
    extends AnyVal {

  final def summariesAsScala(
      value: Option[Seq[StackSetOperationResultSummary]]
  ): ListStackSetOperationResultsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.summaries(v.asJava)
    } // Seq[StackSetOperationResultSummary]
  }

  final def nextTokenAsScala(value: Option[String]): ListStackSetOperationResultsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListStackSetOperationResultsResponseOps(val self: ListStackSetOperationResultsResponse) extends AnyVal {

  final def summariesAsScala: Option[Seq[StackSetOperationResultSummary]] = Option(self.summaries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[StackSetOperationResultSummary]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackSetOperationResultsResponseOps {

  implicit def toListStackSetOperationResultsResponseBuilderOps(
      v: ListStackSetOperationResultsResponse.Builder
  ): ListStackSetOperationResultsResponseBuilderOps = new ListStackSetOperationResultsResponseBuilderOps(v)

  implicit def toListStackSetOperationResultsResponseOps(
      v: ListStackSetOperationResultsResponse
  ): ListStackSetOperationResultsResponseOps = new ListStackSetOperationResultsResponseOps(v)

}
