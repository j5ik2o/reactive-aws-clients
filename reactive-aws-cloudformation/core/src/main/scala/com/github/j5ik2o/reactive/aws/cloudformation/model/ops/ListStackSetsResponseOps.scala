// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackSetsResponseBuilderOps(val self: ListStackSetsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summariesAsScala(value: Option[Seq[StackSetSummary]]): ListStackSetsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.summaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStackSetsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListStackSetsResponseOps(val self: ListStackSetsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summariesAsScala: Option[Seq[StackSetSummary]] = Option(self.summaries).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackSetsResponseOps {

  implicit def toListStackSetsResponseBuilderOps(v: ListStackSetsResponse.Builder): ListStackSetsResponseBuilderOps =
    new ListStackSetsResponseBuilderOps(v)

  implicit def toListStackSetsResponseOps(v: ListStackSetsResponse): ListStackSetsResponseOps =
    new ListStackSetsResponseOps(v)

}
