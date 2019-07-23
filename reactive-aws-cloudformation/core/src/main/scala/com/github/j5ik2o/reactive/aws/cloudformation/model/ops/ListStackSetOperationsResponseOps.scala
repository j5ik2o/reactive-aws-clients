// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackSetOperationsResponseBuilderOps(val self: ListStackSetOperationsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summariesAsScala(value: Option[Seq[StackSetOperationSummary]]): ListStackSetOperationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.summaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStackSetOperationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListStackSetOperationsResponseOps(val self: ListStackSetOperationsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summariesAsScala: Option[Seq[StackSetOperationSummary]] = Option(self.summaries).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackSetOperationsResponseOps {

  implicit def toListStackSetOperationsResponseBuilderOps(
      v: ListStackSetOperationsResponse.Builder
  ): ListStackSetOperationsResponseBuilderOps = new ListStackSetOperationsResponseBuilderOps(v)

  implicit def toListStackSetOperationsResponseOps(
      v: ListStackSetOperationsResponse
  ): ListStackSetOperationsResponseOps = new ListStackSetOperationsResponseOps(v)

}
