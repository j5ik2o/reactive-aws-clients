// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackInstancesResponseBuilderOps(val self: ListStackInstancesResponse.Builder) extends AnyVal {

  final def summariesAsScala(value: Option[Seq[StackInstanceSummary]]): ListStackInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.summaries(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListStackInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListStackInstancesResponseOps(val self: ListStackInstancesResponse) extends AnyVal {

  final def summariesAsScala: Option[Seq[StackInstanceSummary]] = Option(self.summaries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
