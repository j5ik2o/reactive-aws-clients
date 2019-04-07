// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListElasticsearchInstanceTypesResponseBuilderOps(val self: ListElasticsearchInstanceTypesResponse.Builder)
    extends AnyVal {

  final def withElasticsearchInstanceTypesAsScala(
      value: Option[Seq[ESPartitionInstanceType]]
  ): ListElasticsearchInstanceTypesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticsearchInstanceTypes(v.asJava)
    } // Seq[String]
  }

  final def withNextTokenAsScala(value: Option[String]): ListElasticsearchInstanceTypesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListElasticsearchInstanceTypesResponseOps(val self: ListElasticsearchInstanceTypesResponse) extends AnyVal {

  final def elasticsearchInstanceTypesAsScala: Option[Seq[ESPartitionInstanceType]] =
    Option(self.elasticsearchInstanceTypes).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[String]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListElasticsearchInstanceTypesResponseOps {

  implicit def toListElasticsearchInstanceTypesResponseBuilderOps(
      v: ListElasticsearchInstanceTypesResponse.Builder
  ): ListElasticsearchInstanceTypesResponseBuilderOps = new ListElasticsearchInstanceTypesResponseBuilderOps(v)

  implicit def toListElasticsearchInstanceTypesResponseOps(
      v: ListElasticsearchInstanceTypesResponse
  ): ListElasticsearchInstanceTypesResponseOps = new ListElasticsearchInstanceTypesResponseOps(v)

}
