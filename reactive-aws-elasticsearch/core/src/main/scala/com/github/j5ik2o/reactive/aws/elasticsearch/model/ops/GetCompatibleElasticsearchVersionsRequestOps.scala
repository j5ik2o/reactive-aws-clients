// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetCompatibleElasticsearchVersionsRequestBuilderOps(
    val self: GetCompatibleElasticsearchVersionsRequest.Builder
) extends AnyVal {

  final def domainNameAsScala(value: Option[String]): GetCompatibleElasticsearchVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

}

final class GetCompatibleElasticsearchVersionsRequestOps(val self: GetCompatibleElasticsearchVersionsRequest)
    extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

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
