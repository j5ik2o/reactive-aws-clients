// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackResourcesResponseBuilderOps(val self: ListStackResourcesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceSummariesAsScala(
      value: Option[Seq[StackResourceSummary]]
  ): ListStackResourcesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stackResourceSummaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStackResourcesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListStackResourcesResponseOps(val self: ListStackResourcesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceSummariesAsScala: Option[Seq[StackResourceSummary]] = Option(self.stackResourceSummaries).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackResourcesResponseOps {

  implicit def toListStackResourcesResponseBuilderOps(
      v: ListStackResourcesResponse.Builder
  ): ListStackResourcesResponseBuilderOps = new ListStackResourcesResponseBuilderOps(v)

  implicit def toListStackResourcesResponseOps(v: ListStackResourcesResponse): ListStackResourcesResponseOps =
    new ListStackResourcesResponseOps(v)

}
