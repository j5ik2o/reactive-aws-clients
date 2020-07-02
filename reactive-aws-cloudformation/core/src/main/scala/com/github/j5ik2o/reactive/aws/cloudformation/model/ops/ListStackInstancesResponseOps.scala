// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackInstancesResponseBuilderOps(val self: ListStackInstancesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summariesAsScala(value: Option[Seq[StackInstanceSummary]]): ListStackInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.summaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStackInstancesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListStackInstancesResponseOps(val self: ListStackInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summariesAsScala: Option[Seq[StackInstanceSummary]] =
    Option(self.summaries).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackInstancesResponseOps {

  implicit def toListStackInstancesResponseBuilderOps(
      v: ListStackInstancesResponse.Builder
  ): ListStackInstancesResponseBuilderOps = new ListStackInstancesResponseBuilderOps(v)

  implicit def toListStackInstancesResponseOps(v: ListStackInstancesResponse): ListStackInstancesResponseOps =
    new ListStackInstancesResponseOps(v)

}
