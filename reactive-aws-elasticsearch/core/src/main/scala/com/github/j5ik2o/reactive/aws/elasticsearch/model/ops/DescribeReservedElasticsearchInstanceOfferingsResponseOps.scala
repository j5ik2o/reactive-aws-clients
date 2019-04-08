// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeReservedElasticsearchInstanceOfferingsResponseBuilderOps(
    val self: DescribeReservedElasticsearchInstanceOfferingsResponse.Builder
) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeReservedElasticsearchInstanceOfferingsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def reservedElasticsearchInstanceOfferingsAsScala(
      value: Option[Seq[ReservedElasticsearchInstanceOffering]]
  ): DescribeReservedElasticsearchInstanceOfferingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedElasticsearchInstanceOfferings(v.asJava)
    } // Seq[ReservedElasticsearchInstanceOffering]
  }

}

final class DescribeReservedElasticsearchInstanceOfferingsResponseOps(
    val self: DescribeReservedElasticsearchInstanceOfferingsResponse
) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def reservedElasticsearchInstanceOfferingsAsScala: Option[Seq[ReservedElasticsearchInstanceOffering]] =
    Option(self.reservedElasticsearchInstanceOfferings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[ReservedElasticsearchInstanceOffering]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedElasticsearchInstanceOfferingsResponseOps {

  implicit def toDescribeReservedElasticsearchInstanceOfferingsResponseBuilderOps(
      v: DescribeReservedElasticsearchInstanceOfferingsResponse.Builder
  ): DescribeReservedElasticsearchInstanceOfferingsResponseBuilderOps =
    new DescribeReservedElasticsearchInstanceOfferingsResponseBuilderOps(v)

  implicit def toDescribeReservedElasticsearchInstanceOfferingsResponseOps(
      v: DescribeReservedElasticsearchInstanceOfferingsResponse
  ): DescribeReservedElasticsearchInstanceOfferingsResponseOps =
    new DescribeReservedElasticsearchInstanceOfferingsResponseOps(v)

}
