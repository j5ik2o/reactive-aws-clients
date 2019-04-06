// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListTypesRequestBuilderOps(val self: ListTypesRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withFormatAsScala(value: Option[TypeDefinitionFormat]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  } // String

  final def withNextTokenAsScala(value: Option[String]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def withMaxResultsAsScala(value: Option[Int]): ListTypesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

}

final class ListTypesRequestOps(val self: ListTypesRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def formatAsScala: Option[TypeDefinitionFormat] = Option(self.format) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypesRequestOps {

  implicit def toListTypesRequestBuilderOps(v: ListTypesRequest.Builder): ListTypesRequestBuilderOps =
    new ListTypesRequestBuilderOps(v)

  implicit def toListTypesRequestOps(v: ListTypesRequest): ListTypesRequestOps = new ListTypesRequestOps(v)

}
