// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListResolversResponseBuilderOps(val self: ListResolversResponse.Builder) extends AnyVal {

  final def withResolversAsScala(value: Option[Seq[Resolver]]): ListResolversResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resolvers(v.asJava)
    } // Seq[Resolver]
  }

  final def withNextTokenAsScala(value: Option[String]): ListResolversResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListResolversResponseOps(val self: ListResolversResponse) extends AnyVal {

  final def resolversAsScala: Option[Seq[Resolver]] = Option(self.resolvers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Resolver]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResolversResponseOps {

  implicit def toListResolversResponseBuilderOps(v: ListResolversResponse.Builder): ListResolversResponseBuilderOps =
    new ListResolversResponseBuilderOps(v)

  implicit def toListResolversResponseOps(v: ListResolversResponse): ListResolversResponseOps =
    new ListResolversResponseOps(v)

}
