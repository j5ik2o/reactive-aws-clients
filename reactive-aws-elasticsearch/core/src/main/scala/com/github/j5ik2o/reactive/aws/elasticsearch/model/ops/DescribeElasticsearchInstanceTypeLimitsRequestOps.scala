// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchInstanceTypeLimitsRequestBuilderOps(
    val self: DescribeElasticsearchInstanceTypeLimitsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchVersionAsScala(
      value: Option[String]
  ): DescribeElasticsearchInstanceTypeLimitsRequest.Builder = {
    value.fold(self) { v => self.elasticsearchVersion(v) }
  }

}

final class DescribeElasticsearchInstanceTypeLimitsRequestOps(val self: DescribeElasticsearchInstanceTypeLimitsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[ESPartitionInstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
