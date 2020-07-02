// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetCompatibleElasticsearchVersionsRequestBuilderOps(
    val self: GetCompatibleElasticsearchVersionsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): GetCompatibleElasticsearchVersionsRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

}

final class GetCompatibleElasticsearchVersionsRequestOps(val self: GetCompatibleElasticsearchVersionsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCompatibleElasticsearchVersionsRequestOps {

  implicit def toGetCompatibleElasticsearchVersionsRequestBuilderOps(
      v: GetCompatibleElasticsearchVersionsRequest.Builder
  ): GetCompatibleElasticsearchVersionsRequestBuilderOps = new GetCompatibleElasticsearchVersionsRequestBuilderOps(v)

  implicit def toGetCompatibleElasticsearchVersionsRequestOps(
      v: GetCompatibleElasticsearchVersionsRequest
  ): GetCompatibleElasticsearchVersionsRequestOps = new GetCompatibleElasticsearchVersionsRequestOps(v)

}
