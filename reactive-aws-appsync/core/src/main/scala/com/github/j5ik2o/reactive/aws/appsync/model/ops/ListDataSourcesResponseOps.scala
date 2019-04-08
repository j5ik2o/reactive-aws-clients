// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListDataSourcesResponseBuilderOps(val self: ListDataSourcesResponse.Builder) extends AnyVal {

  final def dataSourcesAsScala(value: Option[Seq[DataSource]]): ListDataSourcesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dataSources(v.asJava)
    } // Seq[DataSource]
  }

  final def nextTokenAsScala(value: Option[String]): ListDataSourcesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListDataSourcesResponseOps(val self: ListDataSourcesResponse) extends AnyVal {

  final def dataSourcesAsScala: Option[Seq[DataSource]] = Option(self.dataSources).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[DataSource]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDataSourcesResponseOps {

  implicit def toListDataSourcesResponseBuilderOps(
      v: ListDataSourcesResponse.Builder
  ): ListDataSourcesResponseBuilderOps = new ListDataSourcesResponseBuilderOps(v)

  implicit def toListDataSourcesResponseOps(v: ListDataSourcesResponse): ListDataSourcesResponseOps =
    new ListDataSourcesResponseOps(v)

}
