// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListResolversRequestBuilderOps(val self: ListResolversRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): ListResolversRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def typeNameAsScala(value: Option[String]): ListResolversRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListResolversRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListResolversRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListResolversRequestOps(val self: ListResolversRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def typeNameAsScala: Option[String] = Option(self.typeName)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResolversRequestOps {

  implicit def toListResolversRequestBuilderOps(v: ListResolversRequest.Builder): ListResolversRequestBuilderOps =
    new ListResolversRequestBuilderOps(v)

  implicit def toListResolversRequestOps(v: ListResolversRequest): ListResolversRequestOps =
    new ListResolversRequestOps(v)

}
