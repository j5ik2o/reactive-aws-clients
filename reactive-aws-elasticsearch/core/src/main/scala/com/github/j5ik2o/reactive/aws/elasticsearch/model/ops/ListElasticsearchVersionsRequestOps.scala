// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListElasticsearchVersionsRequestBuilderOps(val self: ListElasticsearchVersionsRequest.Builder)
    extends AnyVal {

  final def withMaxResultsAsScala(value: Option[Int]): ListElasticsearchVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def withNextTokenAsScala(value: Option[String]): ListElasticsearchVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListElasticsearchVersionsRequestOps(val self: ListElasticsearchVersionsRequest) extends AnyVal {

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListElasticsearchVersionsRequestOps {

  implicit def toListElasticsearchVersionsRequestBuilderOps(
      v: ListElasticsearchVersionsRequest.Builder
  ): ListElasticsearchVersionsRequestBuilderOps = new ListElasticsearchVersionsRequestBuilderOps(v)

  implicit def toListElasticsearchVersionsRequestOps(
      v: ListElasticsearchVersionsRequest
  ): ListElasticsearchVersionsRequestOps = new ListElasticsearchVersionsRequestOps(v)

}
