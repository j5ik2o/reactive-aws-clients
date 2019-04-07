// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListElasticsearchVersionsResponseBuilderOps(val self: ListElasticsearchVersionsResponse.Builder)
    extends AnyVal {

  final def withElasticsearchVersionsAsScala(value: Option[Seq[String]]): ListElasticsearchVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticsearchVersions(v.asJava)
    } // Seq[String]
  }

  final def withNextTokenAsScala(value: Option[String]): ListElasticsearchVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListElasticsearchVersionsResponseOps(val self: ListElasticsearchVersionsResponse) extends AnyVal {

  final def elasticsearchVersionsAsScala: Option[Seq[String]] = Option(self.elasticsearchVersions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListElasticsearchVersionsResponseOps {

  implicit def toListElasticsearchVersionsResponseBuilderOps(
      v: ListElasticsearchVersionsResponse.Builder
  ): ListElasticsearchVersionsResponseBuilderOps = new ListElasticsearchVersionsResponseBuilderOps(v)

  implicit def toListElasticsearchVersionsResponseOps(
      v: ListElasticsearchVersionsResponse
  ): ListElasticsearchVersionsResponseOps = new ListElasticsearchVersionsResponseOps(v)

}
