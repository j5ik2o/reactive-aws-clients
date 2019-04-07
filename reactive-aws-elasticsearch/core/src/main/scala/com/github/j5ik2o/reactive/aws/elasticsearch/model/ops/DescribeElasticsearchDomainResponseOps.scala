// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainResponseBuilderOps(val self: DescribeElasticsearchDomainResponse.Builder)
    extends AnyVal {

  final def withDomainStatusAsScala(
      value: Option[ElasticsearchDomainStatus]
  ): DescribeElasticsearchDomainResponse.Builder = {
    value.fold(self) { v =>
      self.domainStatus(v)
    }
  } // ElasticsearchDomainStatus

}

final class DescribeElasticsearchDomainResponseOps(val self: DescribeElasticsearchDomainResponse) extends AnyVal {

  final def domainStatusAsScala: Option[ElasticsearchDomainStatus] =
    Option(self.domainStatus) // ElasticsearchDomainStatus

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
