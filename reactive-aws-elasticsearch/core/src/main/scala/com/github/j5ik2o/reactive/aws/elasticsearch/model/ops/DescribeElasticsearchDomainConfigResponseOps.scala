// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainConfigResponseBuilderOps(
    val self: DescribeElasticsearchDomainConfigResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainConfigAsScala(
      value: Option[ElasticsearchDomainConfig]
  ): DescribeElasticsearchDomainConfigResponse.Builder = {
    value.fold(self) { v => self.domainConfig(v) }
  }

}

final class DescribeElasticsearchDomainConfigResponseOps(val self: DescribeElasticsearchDomainConfigResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainConfigAsScala: Option[ElasticsearchDomainConfig] = Option(self.domainConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticsearchDomainConfigResponseOps {

  implicit def toDescribeElasticsearchDomainConfigResponseBuilderOps(
      v: DescribeElasticsearchDomainConfigResponse.Builder
  ): DescribeElasticsearchDomainConfigResponseBuilderOps = new DescribeElasticsearchDomainConfigResponseBuilderOps(v)

  implicit def toDescribeElasticsearchDomainConfigResponseOps(
      v: DescribeElasticsearchDomainConfigResponse
  ): DescribeElasticsearchDomainConfigResponseOps = new DescribeElasticsearchDomainConfigResponseOps(v)

}
