// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainRequestBuilderOps(val self: DescribeElasticsearchDomainRequest.Builder)
    extends AnyVal {

  final def domainNameAsScala(value: Option[String]): DescribeElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

}

final class DescribeElasticsearchDomainRequestOps(val self: DescribeElasticsearchDomainRequest) extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

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
