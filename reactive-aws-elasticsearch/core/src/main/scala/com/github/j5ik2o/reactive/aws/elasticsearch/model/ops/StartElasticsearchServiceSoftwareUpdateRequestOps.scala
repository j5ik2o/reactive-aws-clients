// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class StartElasticsearchServiceSoftwareUpdateRequestBuilderOps(
    val self: StartElasticsearchServiceSoftwareUpdateRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): StartElasticsearchServiceSoftwareUpdateRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

}

final class StartElasticsearchServiceSoftwareUpdateRequestOps(val self: StartElasticsearchServiceSoftwareUpdateRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartElasticsearchServiceSoftwareUpdateRequestOps {

  implicit def toStartElasticsearchServiceSoftwareUpdateRequestBuilderOps(
      v: StartElasticsearchServiceSoftwareUpdateRequest.Builder
  ): StartElasticsearchServiceSoftwareUpdateRequestBuilderOps =
    new StartElasticsearchServiceSoftwareUpdateRequestBuilderOps(v)

  implicit def toStartElasticsearchServiceSoftwareUpdateRequestOps(
      v: StartElasticsearchServiceSoftwareUpdateRequest
  ): StartElasticsearchServiceSoftwareUpdateRequestOps = new StartElasticsearchServiceSoftwareUpdateRequestOps(v)

}
