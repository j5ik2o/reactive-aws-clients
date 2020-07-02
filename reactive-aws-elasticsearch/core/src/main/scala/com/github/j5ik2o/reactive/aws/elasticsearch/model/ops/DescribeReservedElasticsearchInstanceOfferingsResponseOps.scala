// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeReservedElasticsearchInstanceOfferingsResponseBuilderOps(
    val self: DescribeReservedElasticsearchInstanceOfferingsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeReservedElasticsearchInstanceOfferingsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingsAsScala(
      value: Option[Seq[ReservedElasticsearchInstanceOffering]]
  ): DescribeReservedElasticsearchInstanceOfferingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.reservedElasticsearchInstanceOfferings(v.asJava)
    }
  }

}

final class DescribeReservedElasticsearchInstanceOfferingsResponseOps(
    val self: DescribeReservedElasticsearchInstanceOfferingsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingsAsScala: Option[Seq[ReservedElasticsearchInstanceOffering]] =
    Option(self.reservedElasticsearchInstanceOfferings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
