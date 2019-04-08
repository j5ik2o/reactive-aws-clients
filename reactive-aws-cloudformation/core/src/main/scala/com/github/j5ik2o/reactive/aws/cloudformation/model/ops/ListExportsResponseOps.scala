// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListExportsResponseBuilderOps(val self: ListExportsResponse.Builder) extends AnyVal {

  final def exportsAsScala(value: Option[Seq[Export]]): ListExportsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.exports(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListExportsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListExportsResponseOps(val self: ListExportsResponse) extends AnyVal {

  final def exportsAsScala: Option[Seq[Export]] = Option(self.exports).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListExportsResponseOps {

  implicit def toListExportsResponseBuilderOps(v: ListExportsResponse.Builder): ListExportsResponseBuilderOps =
    new ListExportsResponseBuilderOps(v)

  implicit def toListExportsResponseOps(v: ListExportsResponse): ListExportsResponseOps = new ListExportsResponseOps(v)

}
