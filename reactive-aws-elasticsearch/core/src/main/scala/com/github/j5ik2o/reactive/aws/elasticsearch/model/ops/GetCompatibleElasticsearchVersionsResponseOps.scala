// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetCompatibleElasticsearchVersionsResponseBuilderOps(
    val self: GetCompatibleElasticsearchVersionsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleElasticsearchVersionsAsScala(
      value: Option[Seq[CompatibleVersionsMap]]
  ): GetCompatibleElasticsearchVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.compatibleElasticsearchVersions(v.asJava)
    }
  }

}

final class GetCompatibleElasticsearchVersionsResponseOps(val self: GetCompatibleElasticsearchVersionsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleElasticsearchVersionsAsScala: Option[Seq[CompatibleVersionsMap]] =
    Option(self.compatibleElasticsearchVersions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
