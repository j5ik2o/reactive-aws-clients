// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStacksRequestBuilderOps(val self: ListStacksRequest.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): ListStacksRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def stackStatusFiltersAsScala(value: Option[Seq[StackStatus]]): ListStacksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stackStatusFilters(v.asJava)
    }
  }

}

final class ListStacksRequestOps(val self: ListStacksRequest) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def stackStatusFiltersAsScala: Option[Seq[StackStatus]] = Option(self.stackStatusFilters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStacksRequestOps {

  implicit def toListStacksRequestBuilderOps(v: ListStacksRequest.Builder): ListStacksRequestBuilderOps =
    new ListStacksRequestBuilderOps(v)

  implicit def toListStacksRequestOps(v: ListStacksRequest): ListStacksRequestOps = new ListStacksRequestOps(v)

}
