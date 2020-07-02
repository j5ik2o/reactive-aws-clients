// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CancelElasticsearchServiceSoftwareUpdateRequestBuilderOps(
    val self: CancelElasticsearchServiceSoftwareUpdateRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): CancelElasticsearchServiceSoftwareUpdateRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

}

final class CancelElasticsearchServiceSoftwareUpdateRequestOps(
    val self: CancelElasticsearchServiceSoftwareUpdateRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelElasticsearchServiceSoftwareUpdateRequestOps {

  implicit def toCancelElasticsearchServiceSoftwareUpdateRequestBuilderOps(
      v: CancelElasticsearchServiceSoftwareUpdateRequest.Builder
  ): CancelElasticsearchServiceSoftwareUpdateRequestBuilderOps =
    new CancelElasticsearchServiceSoftwareUpdateRequestBuilderOps(v)

  implicit def toCancelElasticsearchServiceSoftwareUpdateRequestOps(
      v: CancelElasticsearchServiceSoftwareUpdateRequest
  ): CancelElasticsearchServiceSoftwareUpdateRequestOps = new CancelElasticsearchServiceSoftwareUpdateRequestOps(v)

}
