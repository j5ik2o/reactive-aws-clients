// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainRequestBuilderOps(val self: DescribeElasticsearchDomainRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): DescribeElasticsearchDomainRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

}

final class DescribeElasticsearchDomainRequestOps(val self: DescribeElasticsearchDomainRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticsearchDomainRequestOps {

  implicit def toDescribeElasticsearchDomainRequestBuilderOps(
      v: DescribeElasticsearchDomainRequest.Builder
  ): DescribeElasticsearchDomainRequestBuilderOps = new DescribeElasticsearchDomainRequestBuilderOps(v)

  implicit def toDescribeElasticsearchDomainRequestOps(
      v: DescribeElasticsearchDomainRequest
  ): DescribeElasticsearchDomainRequestOps = new DescribeElasticsearchDomainRequestOps(v)

}
