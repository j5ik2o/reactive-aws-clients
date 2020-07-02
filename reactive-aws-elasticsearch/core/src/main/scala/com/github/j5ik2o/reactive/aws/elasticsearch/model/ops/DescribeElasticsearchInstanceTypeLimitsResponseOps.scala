// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchInstanceTypeLimitsResponseBuilderOps(
    val self: DescribeElasticsearchInstanceTypeLimitsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitsByRoleAsScala(
      value: Option[Map[String, Limits]]
  ): DescribeElasticsearchInstanceTypeLimitsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.limitsByRole(v.asJava)
    }
  }

}

final class DescribeElasticsearchInstanceTypeLimitsResponseOps(
    val self: DescribeElasticsearchInstanceTypeLimitsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitsByRoleAsScala: Option[Map[String, Limits]] =
    Option(self.limitsByRole).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticsearchInstanceTypeLimitsResponseOps {

  implicit def toDescribeElasticsearchInstanceTypeLimitsResponseBuilderOps(
      v: DescribeElasticsearchInstanceTypeLimitsResponse.Builder
  ): DescribeElasticsearchInstanceTypeLimitsResponseBuilderOps =
    new DescribeElasticsearchInstanceTypeLimitsResponseBuilderOps(v)

  implicit def toDescribeElasticsearchInstanceTypeLimitsResponseOps(
      v: DescribeElasticsearchInstanceTypeLimitsResponse
  ): DescribeElasticsearchInstanceTypeLimitsResponseOps = new DescribeElasticsearchInstanceTypeLimitsResponseOps(v)

}
