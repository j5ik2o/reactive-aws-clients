// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainResponseBuilderOps(val self: DescribeElasticsearchDomainResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainStatusAsScala(
      value: Option[ElasticsearchDomainStatus]
  ): DescribeElasticsearchDomainResponse.Builder = {
    value.fold(self) { v => self.domainStatus(v) }
  }

}

final class DescribeElasticsearchDomainResponseOps(val self: DescribeElasticsearchDomainResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainStatusAsScala: Option[ElasticsearchDomainStatus] = Option(self.domainStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticsearchDomainResponseOps {

  implicit def toDescribeElasticsearchDomainResponseBuilderOps(
      v: DescribeElasticsearchDomainResponse.Builder
  ): DescribeElasticsearchDomainResponseBuilderOps = new DescribeElasticsearchDomainResponseBuilderOps(v)

  implicit def toDescribeElasticsearchDomainResponseOps(
      v: DescribeElasticsearchDomainResponse
  ): DescribeElasticsearchDomainResponseOps = new DescribeElasticsearchDomainResponseOps(v)

}
