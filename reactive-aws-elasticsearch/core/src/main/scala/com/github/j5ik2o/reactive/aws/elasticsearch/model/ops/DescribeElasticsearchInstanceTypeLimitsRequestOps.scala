// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchInstanceTypeLimitsRequestBuilderOps(
    val self: DescribeElasticsearchInstanceTypeLimitsRequest.Builder
) extends AnyVal {

  final def withDomainNameAsScala(value: Option[String]): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

  final def withInstanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  } // String

  final def withElasticsearchVersionAsScala(
      value: Option[String]
  ): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  } // String

}

final class DescribeElasticsearchInstanceTypeLimitsRequestOps(val self: DescribeElasticsearchInstanceTypeLimitsRequest)
    extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

  final def instanceTypeAsScala: Option[ESPartitionInstanceType] = Option(self.instanceType) // String

  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticsearchInstanceTypeLimitsRequestOps {

  implicit def toDescribeElasticsearchInstanceTypeLimitsRequestBuilderOps(
      v: DescribeElasticsearchInstanceTypeLimitsRequest.Builder
  ): DescribeElasticsearchInstanceTypeLimitsRequestBuilderOps =
    new DescribeElasticsearchInstanceTypeLimitsRequestBuilderOps(v)

  implicit def toDescribeElasticsearchInstanceTypeLimitsRequestOps(
      v: DescribeElasticsearchInstanceTypeLimitsRequest
  ): DescribeElasticsearchInstanceTypeLimitsRequestOps = new DescribeElasticsearchInstanceTypeLimitsRequestOps(v)

}
