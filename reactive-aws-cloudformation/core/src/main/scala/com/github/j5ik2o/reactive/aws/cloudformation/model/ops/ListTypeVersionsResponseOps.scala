// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListTypeVersionsResponseBuilderOps(val self: ListTypeVersionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeVersionSummariesAsScala(value: Option[Seq[TypeVersionSummary]]): ListTypeVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.typeVersionSummaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTypeVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTypeVersionsResponseOps(val self: ListTypeVersionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeVersionSummariesAsScala: Option[Seq[TypeVersionSummary]] = Option(self.typeVersionSummaries).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypeVersionsResponseOps {

  implicit def toListTypeVersionsResponseBuilderOps(
      v: ListTypeVersionsResponse.Builder
  ): ListTypeVersionsResponseBuilderOps = new ListTypeVersionsResponseBuilderOps(v)

  implicit def toListTypeVersionsResponseOps(v: ListTypeVersionsResponse): ListTypeVersionsResponseOps =
    new ListTypeVersionsResponseOps(v)

}
