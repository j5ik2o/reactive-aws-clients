// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListGraphqlApisRequestBuilderOps(val self: ListGraphqlApisRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListGraphqlApisRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListGraphqlApisRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class ListGraphqlApisRequestOps(val self: ListGraphqlApisRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListGraphqlApisRequestOps {

  implicit def toListGraphqlApisRequestBuilderOps(v: ListGraphqlApisRequest.Builder): ListGraphqlApisRequestBuilderOps =
    new ListGraphqlApisRequestBuilderOps(v)

  implicit def toListGraphqlApisRequestOps(v: ListGraphqlApisRequest): ListGraphqlApisRequestOps =
    new ListGraphqlApisRequestOps(v)

}
