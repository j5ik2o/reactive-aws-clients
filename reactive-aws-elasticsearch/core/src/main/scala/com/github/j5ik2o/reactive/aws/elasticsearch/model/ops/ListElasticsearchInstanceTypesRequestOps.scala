// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListElasticsearchInstanceTypesRequestBuilderOps(val self: ListElasticsearchInstanceTypesRequest.Builder)
    extends AnyVal {

  final def elasticsearchVersionAsScala(value: Option[String]): ListElasticsearchInstanceTypesRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  }

  final def domainNameAsScala(value: Option[String]): ListElasticsearchInstanceTypesRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListElasticsearchInstanceTypesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListElasticsearchInstanceTypesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListElasticsearchInstanceTypesRequestOps(val self: ListElasticsearchInstanceTypesRequest) extends AnyVal {

  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion)

  final def domainNameAsScala: Option[String] = Option(self.domainName)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

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
