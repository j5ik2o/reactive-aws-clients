// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeReservedElasticsearchInstanceOfferingsRequestBuilderOps(
    val self: DescribeReservedElasticsearchInstanceOfferingsRequest.Builder
) extends AnyVal {

  final def reservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): DescribeReservedElasticsearchInstanceOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceOfferingId(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): DescribeReservedElasticsearchInstanceOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeReservedElasticsearchInstanceOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeReservedElasticsearchInstanceOfferingsRequestOps(
    val self: DescribeReservedElasticsearchInstanceOfferingsRequest
) extends AnyVal {

  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedElasticsearchInstanceOfferingsRequestOps {

  implicit def toDescribeReservedElasticsearchInstanceOfferingsRequestBuilderOps(
      v: DescribeReservedElasticsearchInstanceOfferingsRequest.Builder
  ): DescribeReservedElasticsearchInstanceOfferingsRequestBuilderOps =
    new DescribeReservedElasticsearchInstanceOfferingsRequestBuilderOps(v)

  implicit def toDescribeReservedElasticsearchInstanceOfferingsRequestOps(
      v: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): DescribeReservedElasticsearchInstanceOfferingsRequestOps =
    new DescribeReservedElasticsearchInstanceOfferingsRequestOps(v)

}
