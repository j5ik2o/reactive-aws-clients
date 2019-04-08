// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListImportsResponseBuilderOps(val self: ListImportsResponse.Builder) extends AnyVal {

  final def importsAsScala(value: Option[Seq[String]]): ListImportsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.imports(v.asJava)
    } // Seq[String]
  }

  final def nextTokenAsScala(value: Option[String]): ListImportsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListImportsResponseOps(val self: ListImportsResponse) extends AnyVal {

  final def importsAsScala: Option[Seq[String]] = Option(self.imports).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListImportsResponseOps {

  implicit def toListImportsResponseBuilderOps(v: ListImportsResponse.Builder): ListImportsResponseBuilderOps =
    new ListImportsResponseBuilderOps(v)

  implicit def toListImportsResponseOps(v: ListImportsResponse): ListImportsResponseOps = new ListImportsResponseOps(v)

}
