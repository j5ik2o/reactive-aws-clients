// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeReservedElasticsearchInstancesResponseBuilderOps(
    val self: DescribeReservedElasticsearchInstancesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeReservedElasticsearchInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstancesAsScala(
      value: Option[Seq[ReservedElasticsearchInstance]]
  ): DescribeReservedElasticsearchInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedElasticsearchInstances(v.asJava)
    }
  }

}

final class DescribeReservedElasticsearchInstancesResponseOps(val self: DescribeReservedElasticsearchInstancesResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstancesAsScala: Option[Seq[ReservedElasticsearchInstance]] =
    Option(self.reservedElasticsearchInstances).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedElasticsearchInstancesResponseOps {

  implicit def toDescribeReservedElasticsearchInstancesResponseBuilderOps(
      v: DescribeReservedElasticsearchInstancesResponse.Builder
  ): DescribeReservedElasticsearchInstancesResponseBuilderOps =
    new DescribeReservedElasticsearchInstancesResponseBuilderOps(v)

  implicit def toDescribeReservedElasticsearchInstancesResponseOps(
      v: DescribeReservedElasticsearchInstancesResponse
  ): DescribeReservedElasticsearchInstancesResponseOps = new DescribeReservedElasticsearchInstancesResponseOps(v)

}
