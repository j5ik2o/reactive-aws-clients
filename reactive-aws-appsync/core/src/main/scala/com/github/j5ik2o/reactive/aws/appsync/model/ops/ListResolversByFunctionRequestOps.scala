// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListResolversByFunctionRequestBuilderOps(val self: ListResolversByFunctionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): ListResolversByFunctionRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionIdAsScala(value: Option[String]): ListResolversByFunctionRequest.Builder = {
    value.fold(self) { v => self.functionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListResolversByFunctionRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListResolversByFunctionRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class ListResolversByFunctionRequestOps(val self: ListResolversByFunctionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionIdAsScala: Option[String] = Option(self.functionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResolversByFunctionRequestOps {

  implicit def toListResolversByFunctionRequestBuilderOps(
      v: ListResolversByFunctionRequest.Builder
  ): ListResolversByFunctionRequestBuilderOps = new ListResolversByFunctionRequestBuilderOps(v)

  implicit def toListResolversByFunctionRequestOps(
      v: ListResolversByFunctionRequest
  ): ListResolversByFunctionRequestOps = new ListResolversByFunctionRequestOps(v)

}
