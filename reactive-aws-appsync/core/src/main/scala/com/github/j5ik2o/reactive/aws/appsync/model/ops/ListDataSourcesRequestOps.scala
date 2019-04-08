// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListDataSourcesRequestBuilderOps(val self: ListDataSourcesRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): ListDataSourcesRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListDataSourcesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListDataSourcesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListDataSourcesRequestOps(val self: ListDataSourcesRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDataSourcesRequestOps {

  implicit def toListDataSourcesRequestBuilderOps(v: ListDataSourcesRequest.Builder): ListDataSourcesRequestBuilderOps =
    new ListDataSourcesRequestBuilderOps(v)

  implicit def toListDataSourcesRequestOps(v: ListDataSourcesRequest): ListDataSourcesRequestOps =
    new ListDataSourcesRequestOps(v)

}
