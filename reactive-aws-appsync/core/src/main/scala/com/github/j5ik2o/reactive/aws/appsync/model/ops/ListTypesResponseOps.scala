// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListTypesResponseBuilderOps(val self: ListTypesResponse.Builder) extends AnyVal {

  final def withTypesAsScala(value: Option[Seq[Type]]): ListTypesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.types(v.asJava)
    } // Seq[Type]
  }

  final def withNextTokenAsScala(value: Option[String]): ListTypesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListTypesResponseOps(val self: ListTypesResponse) extends AnyVal {

  final def typesAsScala: Option[Seq[Type]] = Option(self.types).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Type]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypesResponseOps {

  implicit def toListTypesResponseBuilderOps(v: ListTypesResponse.Builder): ListTypesResponseBuilderOps =
    new ListTypesResponseBuilderOps(v)

  implicit def toListTypesResponseOps(v: ListTypesResponse): ListTypesResponseOps = new ListTypesResponseOps(v)

}
