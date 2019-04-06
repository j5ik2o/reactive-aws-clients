// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListFunctionsRequestBuilderOps(val self: ListFunctionsRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withNextTokenAsScala(value: Option[String]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def withMaxResultsAsScala(value: Option[Int]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

}

final class ListFunctionsRequestOps(val self: ListFunctionsRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionsRequestOps {

  implicit def toListFunctionsRequestBuilderOps(v: ListFunctionsRequest.Builder): ListFunctionsRequestBuilderOps =
    new ListFunctionsRequestBuilderOps(v)

  implicit def toListFunctionsRequestOps(v: ListFunctionsRequest): ListFunctionsRequestOps =
    new ListFunctionsRequestOps(v)

}
