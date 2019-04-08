// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackResourcesResponseBuilderOps(val self: ListStackResourcesResponse.Builder) extends AnyVal {

  final def stackResourceSummariesAsScala(
      value: Option[Seq[StackResourceSummary]]
  ): ListStackResourcesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stackResourceSummaries(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListStackResourcesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListStackResourcesResponseOps(val self: ListStackResourcesResponse) extends AnyVal {

  final def stackResourceSummariesAsScala: Option[Seq[StackResourceSummary]] = Option(self.stackResourceSummaries).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

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
