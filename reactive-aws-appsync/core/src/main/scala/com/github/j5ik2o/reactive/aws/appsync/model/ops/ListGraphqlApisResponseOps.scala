// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListGraphqlApisResponseBuilderOps(val self: ListGraphqlApisResponse.Builder) extends AnyVal {

  final def graphqlApisAsScala(value: Option[Seq[GraphqlApi]]): ListGraphqlApisResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.graphqlApis(v.asJava)
    } // Seq[GraphqlApi]
  }

  final def nextTokenAsScala(value: Option[String]): ListGraphqlApisResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListGraphqlApisResponseOps(val self: ListGraphqlApisResponse) extends AnyVal {

  final def graphqlApisAsScala: Option[Seq[GraphqlApi]] = Option(self.graphqlApis).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[GraphqlApi]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListGraphqlApisResponseOps {

  implicit def toListGraphqlApisResponseBuilderOps(
      v: ListGraphqlApisResponse.Builder
  ): ListGraphqlApisResponseBuilderOps = new ListGraphqlApisResponseBuilderOps(v)

  implicit def toListGraphqlApisResponseOps(v: ListGraphqlApisResponse): ListGraphqlApisResponseOps =
    new ListGraphqlApisResponseOps(v)

}
