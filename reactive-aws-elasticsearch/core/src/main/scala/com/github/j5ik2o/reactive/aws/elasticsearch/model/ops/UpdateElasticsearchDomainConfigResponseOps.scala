// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpdateElasticsearchDomainConfigResponseBuilderOps(val self: UpdateElasticsearchDomainConfigResponse.Builder)
    extends AnyVal {

  final def domainConfigAsScala(
      value: Option[ElasticsearchDomainConfig]
  ): UpdateElasticsearchDomainConfigResponse.Builder = {
    value.fold(self) { v =>
      self.domainConfig(v)
    }
  } // ElasticsearchDomainConfig

}

final class UpdateElasticsearchDomainConfigResponseOps(val self: UpdateElasticsearchDomainConfigResponse)
    extends AnyVal {

  final def domainConfigAsScala: Option[ElasticsearchDomainConfig] =
    Option(self.domainConfig) // ElasticsearchDomainConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateElasticsearchDomainConfigResponseOps {

  implicit def toUpdateElasticsearchDomainConfigResponseBuilderOps(
      v: UpdateElasticsearchDomainConfigResponse.Builder
  ): UpdateElasticsearchDomainConfigResponseBuilderOps = new UpdateElasticsearchDomainConfigResponseBuilderOps(v)

  implicit def toUpdateElasticsearchDomainConfigResponseOps(
      v: UpdateElasticsearchDomainConfigResponse
  ): UpdateElasticsearchDomainConfigResponseOps = new UpdateElasticsearchDomainConfigResponseOps(v)

}
