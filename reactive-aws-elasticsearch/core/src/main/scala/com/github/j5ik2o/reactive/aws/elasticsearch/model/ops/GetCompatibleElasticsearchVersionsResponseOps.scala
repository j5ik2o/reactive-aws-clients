// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetCompatibleElasticsearchVersionsResponseBuilderOps(
    val self: GetCompatibleElasticsearchVersionsResponse.Builder
) extends AnyVal {

  final def compatibleElasticsearchVersionsAsScala(
      value: Option[Seq[CompatibleVersionsMap]]
  ): GetCompatibleElasticsearchVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.compatibleElasticsearchVersions(v.asJava)
    } // Seq[CompatibleVersionsMap]
  }

}

final class GetCompatibleElasticsearchVersionsResponseOps(val self: GetCompatibleElasticsearchVersionsResponse)
    extends AnyVal {

  final def compatibleElasticsearchVersionsAsScala: Option[Seq[CompatibleVersionsMap]] =
    Option(self.compatibleElasticsearchVersions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[CompatibleVersionsMap]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCompatibleElasticsearchVersionsResponseOps {

  implicit def toGetCompatibleElasticsearchVersionsResponseBuilderOps(
      v: GetCompatibleElasticsearchVersionsResponse.Builder
  ): GetCompatibleElasticsearchVersionsResponseBuilderOps = new GetCompatibleElasticsearchVersionsResponseBuilderOps(v)

  implicit def toGetCompatibleElasticsearchVersionsResponseOps(
      v: GetCompatibleElasticsearchVersionsResponse
  ): GetCompatibleElasticsearchVersionsResponseOps = new GetCompatibleElasticsearchVersionsResponseOps(v)

}
