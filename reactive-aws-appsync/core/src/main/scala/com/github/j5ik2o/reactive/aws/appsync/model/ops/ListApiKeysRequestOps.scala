// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListApiKeysRequestBuilderOps(val self: ListApiKeysRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): ListApiKeysRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListApiKeysRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListApiKeysRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class ListApiKeysRequestOps(val self: ListApiKeysRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListApiKeysRequestOps {

  implicit def toListApiKeysRequestBuilderOps(v: ListApiKeysRequest.Builder): ListApiKeysRequestBuilderOps =
    new ListApiKeysRequestBuilderOps(v)

  implicit def toListApiKeysRequestOps(v: ListApiKeysRequest): ListApiKeysRequestOps = new ListApiKeysRequestOps(v)

}
