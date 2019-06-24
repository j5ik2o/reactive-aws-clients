// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainConfigRequestBuilderOps(
    val self: DescribeElasticsearchDomainConfigRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): DescribeElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

}

final class DescribeElasticsearchDomainConfigRequestOps(val self: DescribeElasticsearchDomainConfigRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

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
