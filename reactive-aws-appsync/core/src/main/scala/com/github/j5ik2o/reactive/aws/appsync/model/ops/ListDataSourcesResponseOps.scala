// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListDataSourcesResponseBuilderOps(val self: ListDataSourcesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourcesAsScala(value: Option[Seq[DataSource]]): ListDataSourcesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dataSources(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListDataSourcesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListDataSourcesResponseOps(val self: ListDataSourcesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourcesAsScala: Option[Seq[DataSource]] =
    Option(self.dataSources).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDataSourcesResponseOps {

  implicit def toListDataSourcesResponseBuilderOps(
      v: ListDataSourcesResponse.Builder
  ): ListDataSourcesResponseBuilderOps = new ListDataSourcesResponseBuilderOps(v)

  implicit def toListDataSourcesResponseOps(v: ListDataSourcesResponse): ListDataSourcesResponseOps =
    new ListDataSourcesResponseOps(v)

}
