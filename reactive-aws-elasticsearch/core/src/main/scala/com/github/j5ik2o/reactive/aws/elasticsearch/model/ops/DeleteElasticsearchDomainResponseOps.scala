// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteElasticsearchDomainResponseBuilderOps(val self: DeleteElasticsearchDomainResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainStatusAsScala(value: Option[ElasticsearchDomainStatus]): DeleteElasticsearchDomainResponse.Builder = {
    value.fold(self) { v => self.domainStatus(v) }
  }

}

final class DeleteElasticsearchDomainResponseOps(val self: DeleteElasticsearchDomainResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainStatusAsScala: Option[ElasticsearchDomainStatus] = Option(self.domainStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteElasticsearchDomainResponseOps {

  implicit def toDeleteElasticsearchDomainResponseBuilderOps(
      v: DeleteElasticsearchDomainResponse.Builder
  ): DeleteElasticsearchDomainResponseBuilderOps = new DeleteElasticsearchDomainResponseBuilderOps(v)

  implicit def toDeleteElasticsearchDomainResponseOps(
      v: DeleteElasticsearchDomainResponse
  ): DeleteElasticsearchDomainResponseOps = new DeleteElasticsearchDomainResponseOps(v)

}
