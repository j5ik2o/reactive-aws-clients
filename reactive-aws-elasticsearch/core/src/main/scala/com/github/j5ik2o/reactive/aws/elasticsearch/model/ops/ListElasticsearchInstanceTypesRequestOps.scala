// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListElasticsearchInstanceTypesRequestBuilderOps(val self: ListElasticsearchInstanceTypesRequest.Builder)
    extends AnyVal {

  final def withElasticsearchVersionAsScala(value: Option[String]): ListElasticsearchInstanceTypesRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  } // String

  final def withDomainNameAsScala(value: Option[String]): ListElasticsearchInstanceTypesRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

  final def withMaxResultsAsScala(value: Option[Int]): ListElasticsearchInstanceTypesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def withNextTokenAsScala(value: Option[String]): ListElasticsearchInstanceTypesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListElasticsearchInstanceTypesRequestOps(val self: ListElasticsearchInstanceTypesRequest) extends AnyVal {

  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion) // String

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListElasticsearchInstanceTypesRequestOps {

  implicit def toListElasticsearchInstanceTypesRequestBuilderOps(
      v: ListElasticsearchInstanceTypesRequest.Builder
  ): ListElasticsearchInstanceTypesRequestBuilderOps = new ListElasticsearchInstanceTypesRequestBuilderOps(v)

  implicit def toListElasticsearchInstanceTypesRequestOps(
      v: ListElasticsearchInstanceTypesRequest
  ): ListElasticsearchInstanceTypesRequestOps = new ListElasticsearchInstanceTypesRequestOps(v)

}
