// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainsRequestBuilderOps(val self: DescribeElasticsearchDomainsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNamesAsScala(value: Option[Seq[String]]): DescribeElasticsearchDomainsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.domainNames(v.asJava)
    }
  }

}

final class DescribeElasticsearchDomainsRequestOps(val self: DescribeElasticsearchDomainsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNamesAsScala: Option[Seq[String]] =
    Option(self.domainNames).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticsearchDomainsRequestOps {

  implicit def toDescribeElasticsearchDomainsRequestBuilderOps(
      v: DescribeElasticsearchDomainsRequest.Builder
  ): DescribeElasticsearchDomainsRequestBuilderOps = new DescribeElasticsearchDomainsRequestBuilderOps(v)

  implicit def toDescribeElasticsearchDomainsRequestOps(
      v: DescribeElasticsearchDomainsRequest
  ): DescribeElasticsearchDomainsRequestOps = new DescribeElasticsearchDomainsRequestOps(v)

}
