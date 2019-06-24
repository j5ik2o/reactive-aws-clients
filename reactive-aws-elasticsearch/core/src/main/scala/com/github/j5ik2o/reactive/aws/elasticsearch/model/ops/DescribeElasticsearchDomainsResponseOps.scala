// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainsResponseBuilderOps(val self: DescribeElasticsearchDomainsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainStatusListAsScala(
      value: Option[Seq[ElasticsearchDomainStatus]]
  ): DescribeElasticsearchDomainsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.domainStatusList(v.asJava)
    }
  }

}

final class DescribeElasticsearchDomainsResponseOps(val self: DescribeElasticsearchDomainsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainStatusListAsScala: Option[Seq[ElasticsearchDomainStatus]] = Option(self.domainStatusList).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticsearchDomainsResponseOps {

  implicit def toDescribeElasticsearchDomainsResponseBuilderOps(
      v: DescribeElasticsearchDomainsResponse.Builder
  ): DescribeElasticsearchDomainsResponseBuilderOps = new DescribeElasticsearchDomainsResponseBuilderOps(v)

  implicit def toDescribeElasticsearchDomainsResponseOps(
      v: DescribeElasticsearchDomainsResponse
  ): DescribeElasticsearchDomainsResponseOps = new DescribeElasticsearchDomainsResponseOps(v)

}
