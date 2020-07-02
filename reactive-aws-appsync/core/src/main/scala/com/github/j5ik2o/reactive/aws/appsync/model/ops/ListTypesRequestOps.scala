// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListTypesRequestBuilderOps(val self: ListTypesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): ListTypesRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala(value: Option[TypeDefinitionFormat]): ListTypesRequest.Builder = {
    value.fold(self) { v => self.format(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTypesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListTypesRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class ListTypesRequestOps(val self: ListTypesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala: Option[TypeDefinitionFormat] = Option(self.format)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypesRequestOps {

  implicit def toListTypesRequestBuilderOps(v: ListTypesRequest.Builder): ListTypesRequestBuilderOps =
    new ListTypesRequestBuilderOps(v)

  implicit def toListTypesRequestOps(v: ListTypesRequest): ListTypesRequestOps = new ListTypesRequestOps(v)

}
