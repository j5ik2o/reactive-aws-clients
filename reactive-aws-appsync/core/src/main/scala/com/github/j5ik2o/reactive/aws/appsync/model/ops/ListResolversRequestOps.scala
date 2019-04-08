// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListResolversRequestBuilderOps(val self: ListResolversRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): ListResolversRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def typeNameAsScala(value: Option[String]): ListResolversRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): ListResolversRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): ListResolversRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

}

final class ListResolversRequestOps(val self: ListResolversRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def typeNameAsScala: Option[String] = Option(self.typeName) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResolversRequestOps {

  implicit def toListResolversRequestBuilderOps(v: ListResolversRequest.Builder): ListResolversRequestBuilderOps =
    new ListResolversRequestBuilderOps(v)

  implicit def toListResolversRequestOps(v: ListResolversRequest): ListResolversRequestOps =
    new ListResolversRequestOps(v)

}
