// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListImportsResponseBuilderOps(val self: ListImportsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importsAsScala(value: Option[Seq[String]]): ListImportsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.imports(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListImportsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListImportsResponseOps(val self: ListImportsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importsAsScala: Option[Seq[String]] =
    Option(self.imports).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListImportsResponseOps {

  implicit def toListImportsResponseBuilderOps(v: ListImportsResponse.Builder): ListImportsResponseBuilderOps =
    new ListImportsResponseBuilderOps(v)

  implicit def toListImportsResponseOps(v: ListImportsResponse): ListImportsResponseOps = new ListImportsResponseOps(v)

}
