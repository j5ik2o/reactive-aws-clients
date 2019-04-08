// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeReservedElasticsearchInstancesRequestBuilderOps(
    val self: DescribeReservedElasticsearchInstancesRequest.Builder
) extends AnyVal {

  final def reservedElasticsearchInstanceIdAsScala(
      value: Option[String]
  ): DescribeReservedElasticsearchInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceId(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): DescribeReservedElasticsearchInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeReservedElasticsearchInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeReservedElasticsearchInstancesRequestOps(val self: DescribeReservedElasticsearchInstancesRequest)
    extends AnyVal {

  final def reservedElasticsearchInstanceIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceId) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedElasticsearchInstancesRequestOps {

  implicit def toDescribeReservedElasticsearchInstancesRequestBuilderOps(
      v: DescribeReservedElasticsearchInstancesRequest.Builder
  ): DescribeReservedElasticsearchInstancesRequestBuilderOps =
    new DescribeReservedElasticsearchInstancesRequestBuilderOps(v)

  implicit def toDescribeReservedElasticsearchInstancesRequestOps(
      v: DescribeReservedElasticsearchInstancesRequest
  ): DescribeReservedElasticsearchInstancesRequestOps = new DescribeReservedElasticsearchInstancesRequestOps(v)

}
