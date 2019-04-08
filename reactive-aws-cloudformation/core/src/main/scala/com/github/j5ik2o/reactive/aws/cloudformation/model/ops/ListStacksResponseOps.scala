// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStacksResponseBuilderOps(val self: ListStacksResponse.Builder) extends AnyVal {

  final def stackSummariesAsScala(value: Option[Seq[StackSummary]]): ListStacksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stackSummaries(v.asJava)
    } // Seq[StackSummary]
  }

  final def nextTokenAsScala(value: Option[String]): ListStacksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListStacksResponseOps(val self: ListStacksResponse) extends AnyVal {

  final def stackSummariesAsScala: Option[Seq[StackSummary]] = Option(self.stackSummaries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[StackSummary]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStacksResponseOps {

  implicit def toListStacksResponseBuilderOps(v: ListStacksResponse.Builder): ListStacksResponseBuilderOps =
    new ListStacksResponseBuilderOps(v)

  implicit def toListStacksResponseOps(v: ListStacksResponse): ListStacksResponseOps = new ListStacksResponseOps(v)

}
