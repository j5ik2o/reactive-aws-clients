// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListResolversByFunctionResponseBuilderOps(val self: ListResolversByFunctionResponse.Builder)
    extends AnyVal {

  final def resolversAsScala(value: Option[Seq[Resolver]]): ListResolversByFunctionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resolvers(v.asJava)
    } // Seq[Resolver]
  }

  final def nextTokenAsScala(value: Option[String]): ListResolversByFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListResolversByFunctionResponseOps(val self: ListResolversByFunctionResponse) extends AnyVal {

  final def resolversAsScala: Option[Seq[Resolver]] = Option(self.resolvers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Resolver]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResolversByFunctionResponseOps {

  implicit def toListResolversByFunctionResponseBuilderOps(
      v: ListResolversByFunctionResponse.Builder
  ): ListResolversByFunctionResponseBuilderOps = new ListResolversByFunctionResponseBuilderOps(v)

  implicit def toListResolversByFunctionResponseOps(
      v: ListResolversByFunctionResponse
  ): ListResolversByFunctionResponseOps = new ListResolversByFunctionResponseOps(v)

}
