// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeReservedElasticsearchInstanceOfferingsRequestBuilderOps(
    val self: DescribeReservedElasticsearchInstanceOfferingsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): DescribeReservedElasticsearchInstanceOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceOfferingId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeReservedElasticsearchInstanceOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeReservedElasticsearchInstanceOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeReservedElasticsearchInstanceOfferingsRequestOps(
    val self: DescribeReservedElasticsearchInstanceOfferingsRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

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
