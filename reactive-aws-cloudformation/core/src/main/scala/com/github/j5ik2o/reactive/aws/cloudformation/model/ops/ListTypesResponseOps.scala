// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListTypesResponseBuilderOps(val self: ListTypesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeSummariesAsScala(value: Option[Seq[TypeSummary]]): ListTypesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.typeSummaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTypesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListTypesResponseOps(val self: ListTypesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeSummariesAsScala: Option[Seq[TypeSummary]] =
    Option(self.typeSummaries).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypesResponseOps {

  implicit def toListTypesResponseBuilderOps(v: ListTypesResponse.Builder): ListTypesResponseBuilderOps =
    new ListTypesResponseBuilderOps(v)

  implicit def toListTypesResponseOps(v: ListTypesResponse): ListTypesResponseOps = new ListTypesResponseOps(v)

}
