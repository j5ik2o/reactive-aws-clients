// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CreateElasticsearchDomainResponseBuilderOps(val self: CreateElasticsearchDomainResponse.Builder)
    extends AnyVal {

  final def domainStatusAsScala(value: Option[ElasticsearchDomainStatus]): CreateElasticsearchDomainResponse.Builder = {
    value.fold(self) { v =>
      self.domainStatus(v)
    }
  }

}

final class CreateElasticsearchDomainResponseOps(val self: CreateElasticsearchDomainResponse) extends AnyVal {

  final def domainStatusAsScala: Option[ElasticsearchDomainStatus] = Option(self.domainStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateElasticsearchDomainResponseOps {

  implicit def toCreateElasticsearchDomainResponseBuilderOps(
      v: CreateElasticsearchDomainResponse.Builder
  ): CreateElasticsearchDomainResponseBuilderOps = new CreateElasticsearchDomainResponseBuilderOps(v)

  implicit def toCreateElasticsearchDomainResponseOps(
      v: CreateElasticsearchDomainResponse
  ): CreateElasticsearchDomainResponseOps = new CreateElasticsearchDomainResponseOps(v)

}
