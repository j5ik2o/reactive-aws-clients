// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListElasticsearchInstanceTypesResponseBuilderOps(val self: ListElasticsearchInstanceTypesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchInstanceTypesAsScala(
      value: Option[Seq[ESPartitionInstanceType]]
  ): ListElasticsearchInstanceTypesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticsearchInstanceTypes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListElasticsearchInstanceTypesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListElasticsearchInstanceTypesResponseOps(val self: ListElasticsearchInstanceTypesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchInstanceTypesAsScala: Option[Seq[ESPartitionInstanceType]] =
    Option(self.elasticsearchInstanceTypes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

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
