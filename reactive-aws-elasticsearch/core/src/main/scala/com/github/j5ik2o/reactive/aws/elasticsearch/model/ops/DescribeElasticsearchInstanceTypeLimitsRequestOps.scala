// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchInstanceTypeLimitsRequestBuilderOps(
    val self: DescribeElasticsearchInstanceTypeLimitsRequest.Builder
) extends AnyVal {

  final def domainNameAsScala(value: Option[String]): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  final def instanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def elasticsearchVersionAsScala(
      value: Option[String]
  ): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  }

}

final class DescribeElasticsearchInstanceTypeLimitsRequestOps(val self: DescribeElasticsearchInstanceTypeLimitsRequest)
    extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName)

  final def instanceTypeAsScala: Option[ESPartitionInstanceType] = Option(self.instanceType)

  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion)

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
