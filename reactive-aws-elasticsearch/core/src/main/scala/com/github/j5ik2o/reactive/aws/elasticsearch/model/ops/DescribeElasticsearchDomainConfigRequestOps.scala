// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainConfigRequestBuilderOps(
    val self: DescribeElasticsearchDomainConfigRequest.Builder
) extends AnyVal {

  final def withDomainNameAsScala(value: Option[String]): DescribeElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

}

final class DescribeElasticsearchDomainConfigRequestOps(val self: DescribeElasticsearchDomainConfigRequest)
    extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticsearchDomainConfigRequestOps {

  implicit def toDescribeElasticsearchDomainConfigRequestBuilderOps(
      v: DescribeElasticsearchDomainConfigRequest.Builder
  ): DescribeElasticsearchDomainConfigRequestBuilderOps = new DescribeElasticsearchDomainConfigRequestBuilderOps(v)

  implicit def toDescribeElasticsearchDomainConfigRequestOps(
      v: DescribeElasticsearchDomainConfigRequest
  ): DescribeElasticsearchDomainConfigRequestOps = new DescribeElasticsearchDomainConfigRequestOps(v)

}
