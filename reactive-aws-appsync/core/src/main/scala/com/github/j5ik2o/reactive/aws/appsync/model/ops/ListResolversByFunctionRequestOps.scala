// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListResolversByFunctionRequestBuilderOps(val self: ListResolversByFunctionRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): ListResolversByFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def functionIdAsScala(value: Option[String]): ListResolversByFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionId(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): ListResolversByFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): ListResolversByFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

}

final class ListResolversByFunctionRequestOps(val self: ListResolversByFunctionRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def functionIdAsScala: Option[String] = Option(self.functionId) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

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
