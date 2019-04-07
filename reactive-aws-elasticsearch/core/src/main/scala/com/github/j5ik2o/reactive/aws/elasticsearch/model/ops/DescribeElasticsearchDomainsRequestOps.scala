// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeElasticsearchDomainsRequestBuilderOps(val self: DescribeElasticsearchDomainsRequest.Builder)
    extends AnyVal {

  final def withDomainNamesAsScala(value: Option[Seq[String]]): DescribeElasticsearchDomainsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.domainNames(v.asJava)
    } // Seq[String]
  }

}

final class DescribeElasticsearchDomainsRequestOps(val self: DescribeElasticsearchDomainsRequest) extends AnyVal {

  final def domainNamesAsScala: Option[Seq[String]] = Option(self.domainNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

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
