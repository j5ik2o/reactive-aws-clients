// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListFunctionsRequestBuilderOps(val self: ListFunctionsRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListFunctionsRequestOps(val self: ListFunctionsRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionsRequestOps {

  implicit def toListFunctionsRequestBuilderOps(v: ListFunctionsRequest.Builder): ListFunctionsRequestBuilderOps =
    new ListFunctionsRequestBuilderOps(v)

  implicit def toListFunctionsRequestOps(v: ListFunctionsRequest): ListFunctionsRequestOps =
    new ListFunctionsRequestOps(v)

}
