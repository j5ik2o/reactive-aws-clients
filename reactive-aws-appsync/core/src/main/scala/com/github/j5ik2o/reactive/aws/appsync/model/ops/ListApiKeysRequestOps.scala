// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListApiKeysRequestBuilderOps(val self: ListApiKeysRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): ListApiKeysRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withNextTokenAsScala(value: Option[String]): ListApiKeysRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def withMaxResultsAsScala(value: Option[Int]): ListApiKeysRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

}

final class ListApiKeysRequestOps(val self: ListApiKeysRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListApiKeysRequestOps {

  implicit def toListApiKeysRequestBuilderOps(v: ListApiKeysRequest.Builder): ListApiKeysRequestBuilderOps =
    new ListApiKeysRequestBuilderOps(v)

  implicit def toListApiKeysRequestOps(v: ListApiKeysRequest): ListApiKeysRequestOps = new ListApiKeysRequestOps(v)

}
