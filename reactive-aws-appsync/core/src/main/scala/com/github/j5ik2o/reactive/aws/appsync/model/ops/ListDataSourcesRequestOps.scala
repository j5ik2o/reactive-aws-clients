// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListDataSourcesRequestBuilderOps(val self: ListDataSourcesRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): ListDataSourcesRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withNextTokenAsScala(value: Option[String]): ListDataSourcesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def withMaxResultsAsScala(value: Option[Int]): ListDataSourcesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

}

final class ListDataSourcesRequestOps(val self: ListDataSourcesRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDataSourcesRequestOps {

  implicit def toListDataSourcesRequestBuilderOps(v: ListDataSourcesRequest.Builder): ListDataSourcesRequestBuilderOps =
    new ListDataSourcesRequestBuilderOps(v)

  implicit def toListDataSourcesRequestOps(v: ListDataSourcesRequest): ListDataSourcesRequestOps =
    new ListDataSourcesRequestOps(v)

}
