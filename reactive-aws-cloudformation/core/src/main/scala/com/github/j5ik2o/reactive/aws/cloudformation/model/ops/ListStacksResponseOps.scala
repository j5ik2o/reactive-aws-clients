// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStacksResponseBuilderOps(val self: ListStacksResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSummariesAsScala(value: Option[Seq[StackSummary]]): ListStacksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stackSummaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStacksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListStacksResponseOps(val self: ListStacksResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSummariesAsScala: Option[Seq[StackSummary]] = Option(self.stackSummaries).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStacksResponseOps {

  implicit def toListStacksResponseBuilderOps(v: ListStacksResponse.Builder): ListStacksResponseBuilderOps =
    new ListStacksResponseBuilderOps(v)

  implicit def toListStacksResponseOps(v: ListStacksResponse): ListStacksResponseOps = new ListStacksResponseOps(v)

}
