// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetResolverRequestBuilderOps(val self: GetResolverRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): GetResolverRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def typeNameAsScala(value: Option[String]): GetResolverRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  final def fieldNameAsScala(value: Option[String]): GetResolverRequest.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  }

}

final class GetResolverRequestOps(val self: GetResolverRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def typeNameAsScala: Option[String] = Option(self.typeName)

  final def fieldNameAsScala: Option[String] = Option(self.fieldName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetResolverRequestOps {

  implicit def toGetResolverRequestBuilderOps(v: GetResolverRequest.Builder): GetResolverRequestBuilderOps =
    new GetResolverRequestBuilderOps(v)

  implicit def toGetResolverRequestOps(v: GetResolverRequest): GetResolverRequestOps = new GetResolverRequestOps(v)

}
