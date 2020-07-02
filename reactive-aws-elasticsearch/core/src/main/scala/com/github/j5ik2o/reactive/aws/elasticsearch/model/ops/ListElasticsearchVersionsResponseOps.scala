// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListElasticsearchVersionsResponseBuilderOps(val self: ListElasticsearchVersionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchVersionsAsScala(value: Option[Seq[String]]): ListElasticsearchVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticsearchVersions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListElasticsearchVersionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListElasticsearchVersionsResponseOps(val self: ListElasticsearchVersionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchVersionsAsScala: Option[Seq[String]] =
    Option(self.elasticsearchVersions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

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
